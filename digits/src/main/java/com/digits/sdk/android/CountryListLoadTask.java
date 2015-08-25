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

import io.fabric.sdk.android.services.concurrency.AsyncTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

class CountryListLoadTask extends AsyncTask<Void, Void, List<CountryInfo>> {
    private final static int MAX_COUNTRIES = 291;

    private final Listener listener;

    public CountryListLoadTask(Listener listener) {
        this.listener = listener;
    }

    @Override
    protected List<CountryInfo> doInBackground(Void... params) {
        final List<CountryInfo> countryInfoList = new ArrayList<CountryInfo>(MAX_COUNTRIES);
        countryInfoList.add(new CountryInfo(new Locale("", "AF").getDisplayCountry(), 93));
        countryInfoList.add(new CountryInfo(new Locale("", "AX").getDisplayCountry(), 358));
        countryInfoList.add(new CountryInfo(new Locale("", "AL").getDisplayCountry(), 355));
        countryInfoList.add(new CountryInfo(new Locale("", "DZ").getDisplayCountry(), 213));
        countryInfoList.add(new CountryInfo(new Locale("", "AS").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "AD").getDisplayCountry(), 376));
        countryInfoList.add(new CountryInfo(new Locale("", "AO").getDisplayCountry(), 244));
        countryInfoList.add(new CountryInfo(new Locale("", "AI").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "AG").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "AR").getDisplayCountry(), 54));
        countryInfoList.add(new CountryInfo(new Locale("", "AM").getDisplayCountry(), 374));
        countryInfoList.add(new CountryInfo(new Locale("", "AW").getDisplayCountry(), 297));
        countryInfoList.add(new CountryInfo(new Locale("", "AC").getDisplayCountry(), 247));
        countryInfoList.add(new CountryInfo(new Locale("", "AU").getDisplayCountry(), 61));
        countryInfoList.add(new CountryInfo(new Locale("", "AT").getDisplayCountry(), 43));
        countryInfoList.add(new CountryInfo(new Locale("", "AZ").getDisplayCountry(), 994));
        countryInfoList.add(new CountryInfo(new Locale("", "BS").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "BH").getDisplayCountry(), 973));
        countryInfoList.add(new CountryInfo(new Locale("", "BD").getDisplayCountry(), 880));
        countryInfoList.add(new CountryInfo(new Locale("", "BB").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "BY").getDisplayCountry(), 375));
        countryInfoList.add(new CountryInfo(new Locale("", "BE").getDisplayCountry(), 32));
        countryInfoList.add(new CountryInfo(new Locale("", "BZ").getDisplayCountry(), 501));
        countryInfoList.add(new CountryInfo(new Locale("", "BJ").getDisplayCountry(), 229));
        countryInfoList.add(new CountryInfo(new Locale("", "BM").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "BT").getDisplayCountry(), 975));
        countryInfoList.add(new CountryInfo(new Locale("", "BO").getDisplayCountry(), 591));
        countryInfoList.add(new CountryInfo(new Locale("", "BA").getDisplayCountry(), 387));
        countryInfoList.add(new CountryInfo(new Locale("", "BW").getDisplayCountry(), 267));
        countryInfoList.add(new CountryInfo(new Locale("", "BR").getDisplayCountry(), 55));
        countryInfoList.add(new CountryInfo(new Locale("", "IO").getDisplayCountry(), 246));
        countryInfoList.add(new CountryInfo(new Locale("", "VG").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "BN").getDisplayCountry(), 673));
        countryInfoList.add(new CountryInfo(new Locale("", "BG").getDisplayCountry(), 359));
        countryInfoList.add(new CountryInfo(new Locale("", "BF").getDisplayCountry(), 226));
        countryInfoList.add(new CountryInfo(new Locale("", "BI").getDisplayCountry(), 257));
        countryInfoList.add(new CountryInfo(new Locale("", "KH").getDisplayCountry(), 855));
        countryInfoList.add(new CountryInfo(new Locale("", "CM").getDisplayCountry(), 237));
        countryInfoList.add(new CountryInfo(new Locale("", "CA").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "CV").getDisplayCountry(), 238));
        countryInfoList.add(new CountryInfo(new Locale("", "BQ").getDisplayCountry(), 599));
        countryInfoList.add(new CountryInfo(new Locale("", "KY").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "CF").getDisplayCountry(), 236));
        countryInfoList.add(new CountryInfo(new Locale("", "TD").getDisplayCountry(), 235));
        countryInfoList.add(new CountryInfo(new Locale("", "CL").getDisplayCountry(), 56));
        countryInfoList.add(new CountryInfo(new Locale("", "CN").getDisplayCountry(), 86));
        countryInfoList.add(new CountryInfo(new Locale("", "CX").getDisplayCountry(), 61));
        countryInfoList.add(new CountryInfo(new Locale("", "CC").getDisplayCountry(), 61));
        countryInfoList.add(new CountryInfo(new Locale("", "CO").getDisplayCountry(), 57));
        countryInfoList.add(new CountryInfo(new Locale("", "KM").getDisplayCountry(), 269));
        countryInfoList.add(new CountryInfo(new Locale("", "CD").getDisplayCountry(), 243));
        countryInfoList.add(new CountryInfo(new Locale("", "CG").getDisplayCountry(), 242));
        countryInfoList.add(new CountryInfo(new Locale("", "CK").getDisplayCountry(), 682));
        countryInfoList.add(new CountryInfo(new Locale("", "CR").getDisplayCountry(), 506));
        countryInfoList.add(new CountryInfo(new Locale("", "CI").getDisplayCountry(), 225));
        countryInfoList.add(new CountryInfo(new Locale("", "HR").getDisplayCountry(), 385));
        countryInfoList.add(new CountryInfo(new Locale("", "CU").getDisplayCountry(), 53));
        countryInfoList.add(new CountryInfo(new Locale("", "CW").getDisplayCountry(), 599));
        countryInfoList.add(new CountryInfo(new Locale("", "CY").getDisplayCountry(), 357));
        countryInfoList.add(new CountryInfo(new Locale("", "CZ").getDisplayCountry(), 420));
        countryInfoList.add(new CountryInfo(new Locale("", "DK").getDisplayCountry(), 45));
        countryInfoList.add(new CountryInfo(new Locale("", "DJ").getDisplayCountry(), 253));
        countryInfoList.add(new CountryInfo(new Locale("", "DM").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "DO").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "TL").getDisplayCountry(), 670));
        countryInfoList.add(new CountryInfo(new Locale("", "EC").getDisplayCountry(), 593));
        countryInfoList.add(new CountryInfo(new Locale("", "EG").getDisplayCountry(), 20));
        countryInfoList.add(new CountryInfo(new Locale("", "SV").getDisplayCountry(), 503));
        countryInfoList.add(new CountryInfo(new Locale("", "GQ").getDisplayCountry(), 240));
        countryInfoList.add(new CountryInfo(new Locale("", "ER").getDisplayCountry(), 291));
        countryInfoList.add(new CountryInfo(new Locale("", "EE").getDisplayCountry(), 372));
        countryInfoList.add(new CountryInfo(new Locale("", "ET").getDisplayCountry(), 251));
        countryInfoList.add(new CountryInfo(new Locale("", "FK").getDisplayCountry(), 500));
        countryInfoList.add(new CountryInfo(new Locale("", "FO").getDisplayCountry(), 298));
        countryInfoList.add(new CountryInfo(new Locale("", "FJ").getDisplayCountry(), 679));
        countryInfoList.add(new CountryInfo(new Locale("", "FI").getDisplayCountry(), 358));
        countryInfoList.add(new CountryInfo(new Locale("", "FR").getDisplayCountry(), 33));
        countryInfoList.add(new CountryInfo(new Locale("", "GF").getDisplayCountry(), 594));
        countryInfoList.add(new CountryInfo(new Locale("", "PF").getDisplayCountry(), 689));
        countryInfoList.add(new CountryInfo(new Locale("", "GA").getDisplayCountry(), 241));
        countryInfoList.add(new CountryInfo(new Locale("", "GM").getDisplayCountry(), 220));
        countryInfoList.add(new CountryInfo(new Locale("", "GE").getDisplayCountry(), 995));
        countryInfoList.add(new CountryInfo(new Locale("", "DE").getDisplayCountry(), 49));
        countryInfoList.add(new CountryInfo(new Locale("", "GH").getDisplayCountry(), 233));
        countryInfoList.add(new CountryInfo(new Locale("", "GI").getDisplayCountry(), 350));
        countryInfoList.add(new CountryInfo(new Locale("", "GR").getDisplayCountry(), 30));
        countryInfoList.add(new CountryInfo(new Locale("", "GL").getDisplayCountry(), 299));
        countryInfoList.add(new CountryInfo(new Locale("", "GD").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "GP").getDisplayCountry(), 590));
        countryInfoList.add(new CountryInfo(new Locale("", "GU").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "GT").getDisplayCountry(), 502));
        countryInfoList.add(new CountryInfo(new Locale("", "GG").getDisplayCountry(), 44));
        countryInfoList.add(new CountryInfo(new Locale("", "GN").getDisplayCountry(), 224));
        countryInfoList.add(new CountryInfo(new Locale("", "GW").getDisplayCountry(), 245));
        countryInfoList.add(new CountryInfo(new Locale("", "GY").getDisplayCountry(), 592));
        countryInfoList.add(new CountryInfo(new Locale("", "HT").getDisplayCountry(), 509));
        countryInfoList.add(new CountryInfo(new Locale("", "HM").getDisplayCountry(), 672));
        countryInfoList.add(new CountryInfo(new Locale("", "HN").getDisplayCountry(), 504));
        countryInfoList.add(new CountryInfo(new Locale("", "HK").getDisplayCountry(), 852));
        countryInfoList.add(new CountryInfo(new Locale("", "HU").getDisplayCountry(), 36));
        countryInfoList.add(new CountryInfo(new Locale("", "IS").getDisplayCountry(), 354));
        countryInfoList.add(new CountryInfo(new Locale("", "IN").getDisplayCountry(), 91));
        countryInfoList.add(new CountryInfo(new Locale("", "ID").getDisplayCountry(), 62));
        countryInfoList.add(new CountryInfo(new Locale("", "IR").getDisplayCountry(), 98));
        countryInfoList.add(new CountryInfo(new Locale("", "IQ").getDisplayCountry(), 964));
        countryInfoList.add(new CountryInfo(new Locale("", "IE").getDisplayCountry(), 353));
        countryInfoList.add(new CountryInfo(new Locale("", "IM").getDisplayCountry(), 44));
        countryInfoList.add(new CountryInfo(new Locale("", "IL").getDisplayCountry(), 972));
        countryInfoList.add(new CountryInfo(new Locale("", "IT").getDisplayCountry(), 39));
        countryInfoList.add(new CountryInfo(new Locale("", "JM").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "JP").getDisplayCountry(), 81));
        countryInfoList.add(new CountryInfo(new Locale("", "JE").getDisplayCountry(), 44));
        countryInfoList.add(new CountryInfo(new Locale("", "JO").getDisplayCountry(), 962));
        countryInfoList.add(new CountryInfo(new Locale("", "KZ").getDisplayCountry(), 7));
        countryInfoList.add(new CountryInfo(new Locale("", "KE").getDisplayCountry(), 254));
        countryInfoList.add(new CountryInfo(new Locale("", "KI").getDisplayCountry(), 686));
        countryInfoList.add(new CountryInfo(new Locale("", "XK").getDisplayCountry(), 381));
        countryInfoList.add(new CountryInfo(new Locale("", "KW").getDisplayCountry(), 965));
        countryInfoList.add(new CountryInfo(new Locale("", "KG").getDisplayCountry(), 996));
        countryInfoList.add(new CountryInfo(new Locale("", "LA").getDisplayCountry(), 856));
        countryInfoList.add(new CountryInfo(new Locale("", "LV").getDisplayCountry(), 371));
        countryInfoList.add(new CountryInfo(new Locale("", "LB").getDisplayCountry(), 961));
        countryInfoList.add(new CountryInfo(new Locale("", "LS").getDisplayCountry(), 266));
        countryInfoList.add(new CountryInfo(new Locale("", "LR").getDisplayCountry(), 231));
        countryInfoList.add(new CountryInfo(new Locale("", "LY").getDisplayCountry(), 218));
        countryInfoList.add(new CountryInfo(new Locale("", "LI").getDisplayCountry(), 423));
        countryInfoList.add(new CountryInfo(new Locale("", "LT").getDisplayCountry(), 370));
        countryInfoList.add(new CountryInfo(new Locale("", "LU").getDisplayCountry(), 352));
        countryInfoList.add(new CountryInfo(new Locale("", "MO").getDisplayCountry(), 853));
        countryInfoList.add(new CountryInfo(new Locale("", "MK").getDisplayCountry(), 389));
        countryInfoList.add(new CountryInfo(new Locale("", "MG").getDisplayCountry(), 261));
        countryInfoList.add(new CountryInfo(new Locale("", "MW").getDisplayCountry(), 265));
        countryInfoList.add(new CountryInfo(new Locale("", "MY").getDisplayCountry(), 60));
        countryInfoList.add(new CountryInfo(new Locale("", "MV").getDisplayCountry(), 960));
        countryInfoList.add(new CountryInfo(new Locale("", "ML").getDisplayCountry(), 223));
        countryInfoList.add(new CountryInfo(new Locale("", "MT").getDisplayCountry(), 356));
        countryInfoList.add(new CountryInfo(new Locale("", "MH").getDisplayCountry(), 692));
        countryInfoList.add(new CountryInfo(new Locale("", "MQ").getDisplayCountry(), 596));
        countryInfoList.add(new CountryInfo(new Locale("", "MR").getDisplayCountry(), 222));
        countryInfoList.add(new CountryInfo(new Locale("", "MU").getDisplayCountry(), 230));
        countryInfoList.add(new CountryInfo(new Locale("", "YT").getDisplayCountry(), 262));
        countryInfoList.add(new CountryInfo(new Locale("", "MX").getDisplayCountry(), 52));
        countryInfoList.add(new CountryInfo(new Locale("", "FM").getDisplayCountry(), 691));
        countryInfoList.add(new CountryInfo(new Locale("", "MD").getDisplayCountry(), 373));
        countryInfoList.add(new CountryInfo(new Locale("", "MC").getDisplayCountry(), 377));
        countryInfoList.add(new CountryInfo(new Locale("", "MN").getDisplayCountry(), 976));
        countryInfoList.add(new CountryInfo(new Locale("", "ME").getDisplayCountry(), 382));
        countryInfoList.add(new CountryInfo(new Locale("", "MS").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "MA").getDisplayCountry(), 212));
        countryInfoList.add(new CountryInfo(new Locale("", "MZ").getDisplayCountry(), 258));
        countryInfoList.add(new CountryInfo(new Locale("", "MM").getDisplayCountry(), 95));
        countryInfoList.add(new CountryInfo(new Locale("", "NA").getDisplayCountry(), 264));
        countryInfoList.add(new CountryInfo(new Locale("", "NR").getDisplayCountry(), 674));
        countryInfoList.add(new CountryInfo(new Locale("", "NP").getDisplayCountry(), 977));
        countryInfoList.add(new CountryInfo(new Locale("", "NL").getDisplayCountry(), 31));
        countryInfoList.add(new CountryInfo(new Locale("", "NC").getDisplayCountry(), 687));
        countryInfoList.add(new CountryInfo(new Locale("", "NZ").getDisplayCountry(), 64));
        countryInfoList.add(new CountryInfo(new Locale("", "NI").getDisplayCountry(), 505));
        countryInfoList.add(new CountryInfo(new Locale("", "NE").getDisplayCountry(), 227));
        countryInfoList.add(new CountryInfo(new Locale("", "NG").getDisplayCountry(), 234));
        countryInfoList.add(new CountryInfo(new Locale("", "NU").getDisplayCountry(), 683));
        countryInfoList.add(new CountryInfo(new Locale("", "NF").getDisplayCountry(), 672));
        countryInfoList.add(new CountryInfo(new Locale("", "KP").getDisplayCountry(), 850));
        countryInfoList.add(new CountryInfo(new Locale("", "MP").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "NO").getDisplayCountry(), 47));
        countryInfoList.add(new CountryInfo(new Locale("", "OM").getDisplayCountry(), 968));
        countryInfoList.add(new CountryInfo(new Locale("", "PK").getDisplayCountry(), 92));
        countryInfoList.add(new CountryInfo(new Locale("", "PW").getDisplayCountry(), 680));
        countryInfoList.add(new CountryInfo(new Locale("", "PS").getDisplayCountry(), 970));
        countryInfoList.add(new CountryInfo(new Locale("", "PA").getDisplayCountry(), 507));
        countryInfoList.add(new CountryInfo(new Locale("", "PG").getDisplayCountry(), 675));
        countryInfoList.add(new CountryInfo(new Locale("", "PY").getDisplayCountry(), 595));
        countryInfoList.add(new CountryInfo(new Locale("", "PE").getDisplayCountry(), 51));
        countryInfoList.add(new CountryInfo(new Locale("", "PH").getDisplayCountry(), 63));
        countryInfoList.add(new CountryInfo(new Locale("", "PL").getDisplayCountry(), 48));
        countryInfoList.add(new CountryInfo(new Locale("", "PT").getDisplayCountry(), 351));
        countryInfoList.add(new CountryInfo(new Locale("", "PR").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "QA").getDisplayCountry(), 974));
        countryInfoList.add(new CountryInfo(new Locale("", "RE").getDisplayCountry(), 262));
        countryInfoList.add(new CountryInfo(new Locale("", "RO").getDisplayCountry(), 40));
        countryInfoList.add(new CountryInfo(new Locale("", "RU").getDisplayCountry(), 7));
        countryInfoList.add(new CountryInfo(new Locale("", "RW").getDisplayCountry(), 250));
        countryInfoList.add(new CountryInfo(new Locale("", "BL").getDisplayCountry(), 590));
        countryInfoList.add(new CountryInfo(new Locale("", "SH").getDisplayCountry(), 290));
        countryInfoList.add(new CountryInfo(new Locale("", "KN").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "LC").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "MF").getDisplayCountry(), 590));
        countryInfoList.add(new CountryInfo(new Locale("", "PM").getDisplayCountry(), 508));
        countryInfoList.add(new CountryInfo(new Locale("", "VC").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "WS").getDisplayCountry(), 685));
        countryInfoList.add(new CountryInfo(new Locale("", "SM").getDisplayCountry(), 378));
        countryInfoList.add(new CountryInfo(new Locale("", "ST").getDisplayCountry(), 239));
        countryInfoList.add(new CountryInfo(new Locale("", "SA").getDisplayCountry(), 966));
        countryInfoList.add(new CountryInfo(new Locale("", "SN").getDisplayCountry(), 221));
        countryInfoList.add(new CountryInfo(new Locale("", "RS").getDisplayCountry(), 381));
        countryInfoList.add(new CountryInfo(new Locale("", "SC").getDisplayCountry(), 248));
        countryInfoList.add(new CountryInfo(new Locale("", "SL").getDisplayCountry(), 232));
        countryInfoList.add(new CountryInfo(new Locale("", "SG").getDisplayCountry(), 65));
        countryInfoList.add(new CountryInfo(new Locale("", "SX").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "SK").getDisplayCountry(), 421));
        countryInfoList.add(new CountryInfo(new Locale("", "SI").getDisplayCountry(), 386));
        countryInfoList.add(new CountryInfo(new Locale("", "SB").getDisplayCountry(), 677));
        countryInfoList.add(new CountryInfo(new Locale("", "SO").getDisplayCountry(), 252));
        countryInfoList.add(new CountryInfo(new Locale("", "ZA").getDisplayCountry(), 27));
        countryInfoList.add(new CountryInfo(new Locale("", "GS").getDisplayCountry(), 500));
        countryInfoList.add(new CountryInfo(new Locale("", "KR").getDisplayCountry(), 82));
        countryInfoList.add(new CountryInfo(new Locale("", "SS").getDisplayCountry(), 211));
        countryInfoList.add(new CountryInfo(new Locale("", "ES").getDisplayCountry(), 34));
        countryInfoList.add(new CountryInfo(new Locale("", "LK").getDisplayCountry(), 94));
        countryInfoList.add(new CountryInfo(new Locale("", "SD").getDisplayCountry(), 249));
        countryInfoList.add(new CountryInfo(new Locale("", "SR").getDisplayCountry(), 597));
        countryInfoList.add(new CountryInfo(new Locale("", "SJ").getDisplayCountry(), 47));
        countryInfoList.add(new CountryInfo(new Locale("", "SZ").getDisplayCountry(), 268));
        countryInfoList.add(new CountryInfo(new Locale("", "SE").getDisplayCountry(), 46));
        countryInfoList.add(new CountryInfo(new Locale("", "CH").getDisplayCountry(), 41));
        countryInfoList.add(new CountryInfo(new Locale("", "SY").getDisplayCountry(), 963));
        countryInfoList.add(new CountryInfo(new Locale("", "TW").getDisplayCountry(), 886));
        countryInfoList.add(new CountryInfo(new Locale("", "TJ").getDisplayCountry(), 992));
        countryInfoList.add(new CountryInfo(new Locale("", "TZ").getDisplayCountry(), 255));
        countryInfoList.add(new CountryInfo(new Locale("", "TH").getDisplayCountry(), 66));
        countryInfoList.add(new CountryInfo(new Locale("", "TG").getDisplayCountry(), 228));
        countryInfoList.add(new CountryInfo(new Locale("", "TK").getDisplayCountry(), 690));
        countryInfoList.add(new CountryInfo(new Locale("", "TO").getDisplayCountry(), 676));
        countryInfoList.add(new CountryInfo(new Locale("", "TT").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "TN").getDisplayCountry(), 216));
        countryInfoList.add(new CountryInfo(new Locale("", "TR").getDisplayCountry(), 90));
        countryInfoList.add(new CountryInfo(new Locale("", "TM").getDisplayCountry(), 993));
        countryInfoList.add(new CountryInfo(new Locale("", "TC").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "TV").getDisplayCountry(), 688));
        countryInfoList.add(new CountryInfo(new Locale("", "VI").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "UG").getDisplayCountry(), 256));
        countryInfoList.add(new CountryInfo(new Locale("", "UA").getDisplayCountry(), 380));
        countryInfoList.add(new CountryInfo(new Locale("", "AE").getDisplayCountry(), 971));
        countryInfoList.add(new CountryInfo(new Locale("", "GB").getDisplayCountry(), 44));
        countryInfoList.add(new CountryInfo(new Locale("", "US").getDisplayCountry(), 1));
        countryInfoList.add(new CountryInfo(new Locale("", "UY").getDisplayCountry(), 598));
        countryInfoList.add(new CountryInfo(new Locale("", "UZ").getDisplayCountry(), 998));
        countryInfoList.add(new CountryInfo(new Locale("", "VU").getDisplayCountry(), 678));
        countryInfoList.add(new CountryInfo(new Locale("", "VA").getDisplayCountry(), 379));
        countryInfoList.add(new CountryInfo(new Locale("", "VE").getDisplayCountry(), 58));
        countryInfoList.add(new CountryInfo(new Locale("", "VN").getDisplayCountry(), 84));
        countryInfoList.add(new CountryInfo(new Locale("", "WF").getDisplayCountry(), 681));
        countryInfoList.add(new CountryInfo(new Locale("", "EH").getDisplayCountry(), 212));
        countryInfoList.add(new CountryInfo(new Locale("", "YE").getDisplayCountry(), 967));
        countryInfoList.add(new CountryInfo(new Locale("", "ZM").getDisplayCountry(), 260));
        countryInfoList.add(new CountryInfo(new Locale("", "ZW").getDisplayCountry(), 263));
        Collections.sort(countryInfoList);
        return countryInfoList;
    }

    @Override
    protected void onPostExecute(List<CountryInfo> result) {
        if (listener != null) {
            listener.onLoadComplete(result);
        }
    }

    public interface Listener {
        void onLoadComplete(List<CountryInfo> result);
    }
}
