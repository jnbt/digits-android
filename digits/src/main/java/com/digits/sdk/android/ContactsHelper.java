/*
 * Copyright (C) 2015 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.digits.sdk.android;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.StructuredName;

import com.digits.sdk.vcard.VCardBuilder;
import com.digits.sdk.vcard.VCardConfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class ContactsHelper {
    private static final int MAX_CONTACTS = 2500;
    private static final String[] allProjectionColumns = new String[]{
            ContactsContract.Data.MIMETYPE,
            ContactsContract.Contacts.LOOKUP_KEY,
            Phone.TYPE, Phone.LABEL, Phone.IS_PRIMARY, Phone.NUMBER,
            Email.DATA, Email.TYPE, Email.LABEL, Email.IS_PRIMARY,
            StructuredName.DISPLAY_NAME, StructuredName.GIVEN_NAME, StructuredName.FAMILY_NAME
    };
    private static final String selectionQuery = ContactsContract.Data.MIMETYPE + "=? OR " +
            ContactsContract.Data.MIMETYPE + "=? OR " +
            ContactsContract.Data.MIMETYPE + "=?";
    private static final String[] selectionArgs = new String[]{Phone.CONTENT_ITEM_TYPE,
            Email.CONTENT_ITEM_TYPE,
            StructuredName.CONTENT_ITEM_TYPE};

    private final Context context;

    ContactsHelper(Context context) {
        this.context = context;
    }

    public Cursor getContactsCursor() {
        // Get unique values from allProjectionColumns
        final HashSet<String> tempSet = new HashSet<String>(Arrays.asList(allProjectionColumns));
        final String[] projectionColumns = tempSet.toArray(new String[tempSet.size()]);

        final Uri uri = ContactsContract.Data.CONTENT_URI.buildUpon()
                .appendQueryParameter("limit", Integer.toString(MAX_CONTACTS)).build();

        return context.getContentResolver().query(uri, projectionColumns, selectionQuery,
                selectionArgs, null);
    }

    public List<String> createContactList(Cursor cursor) {
        if (cursor == null || cursor.getCount() == 0) {
            return Collections.<String>emptyList();
        }

        final int mimeTypeColumnIndex = cursor.getColumnIndex(ContactsContract.Data.MIMETYPE);
        final int lookupKeyColumnIndex = cursor.getColumnIndex(ContactsContract.Contacts
                .LOOKUP_KEY);
        final Map<String, List<ContentValues>> mapContactsData = new HashMap<String, List<ContentValues>>();
        while (cursor.moveToNext()) {
            final String mimeType = cursor.getString(mimeTypeColumnIndex);
            final ContentValues cv = new ContentValues();
            cv.put(ContactsContract.Data.MIMETYPE, mimeType);
            if(mimeType ==Phone.CONTENT_ITEM_TYPE) {
                    DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, cv, Phone.TYPE);
                    DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, cv, Phone.LABEL);
                    DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, cv, Phone.IS_PRIMARY);
                    DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, cv, Phone.NUMBER);
            }
            else if(mimeType == Email.CONTENT_ITEM_TYPE){
                    DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, cv, Email.DATA);
                    DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, cv, Email.TYPE);
                    DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, cv, Email.LABEL);
                    DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, cv, Email.IS_PRIMARY);
            }
            else if(mimeType == Email.CONTENT_ITEM_TYPE){
                    // was break
            }
            else if(mimeType == StructuredName.CONTENT_ITEM_TYPE){
                    DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, cv,
                            StructuredName.DISPLAY_NAME);
                    DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, cv,
                            StructuredName.GIVEN_NAME);
                    DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, cv,
                            StructuredName.FAMILY_NAME);
            }
            // Aggregate contacts based on their lookup key.
            final String lookupKey = cursor.getString(lookupKeyColumnIndex);
            List<ContentValues> contactDetails = mapContactsData.get(lookupKey);
            if (contactDetails == null) {
                contactDetails = new ArrayList<ContentValues>();
                mapContactsData.put(lookupKey, contactDetails);
            }
            contactDetails.add(cv);
        }

        return processContactsMap(mapContactsData);
    }

    private List<String> processContactsMap(Map<String, List<ContentValues>> mapContactsData) {
        final List<String> vCards = new ArrayList<String>();
        final Map<String, List<ContentValues>> contactMimeTypeMap = new HashMap<String, List<ContentValues>>();
        final VCardBuilder builder = new VCardBuilder(VCardConfig.VCARD_TYPE_V30_GENERIC,
                VCardConfig.DEFAULT_EXPORT_CHARSET);
        for (String key : mapContactsData.keySet()) {
            final List<ContentValues> contentValuesList = mapContactsData.get(key);
            boolean hasPhoneOrEmail = false;
            contactMimeTypeMap.clear();
            builder.clear();
            for (ContentValues cv : contentValuesList) {
                final String mimeType = cv.getAsString(ContactsContract.Data.MIMETYPE);
                if (Phone.CONTENT_ITEM_TYPE.equals(mimeType) ||
                        Email.CONTENT_ITEM_TYPE.equals(mimeType)) {
                    hasPhoneOrEmail = true;
                }
                List<ContentValues> group = contactMimeTypeMap.get(mimeType);
                if (group == null) {
                    group = new ArrayList<ContentValues>();
                    contactMimeTypeMap.put(mimeType, group);
                }
                group.add(cv);
            }
            if (!hasPhoneOrEmail) {
                continue; // Contact does not have a phone or email id.
            }

            builder.appendNameProperties(contactMimeTypeMap.get(
                    StructuredName.CONTENT_ITEM_TYPE))
                    .appendPhones(contactMimeTypeMap.get(Phone.CONTENT_ITEM_TYPE), null)
                    .appendEmails(contactMimeTypeMap.get(Email.CONTENT_ITEM_TYPE));

            final String vcard = builder.toString();
            vCards.add(vcard);
        }

        return vCards;
    }
}
