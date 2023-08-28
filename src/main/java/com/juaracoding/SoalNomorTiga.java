package com.juaracoding;

public class SoalNomorTiga {
    public static void SoalNomorTiga() {
//    public static void main(String[] args) {
        String[] data = {
                ":T1:202112SOAL3",
                ":T2:SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY.DT",
                ":T1:202111SOAL3",
                ":T2:SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY.DT",
                ":T1:202110SOAL3",
                ":T2:SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS SKILL TEST ESSAY.DT"
            };

        for (int i = 0; i < data.length; i++) {
            //dipisah dulu T1 & T2
            if (data[i].startsWith(":T1:")){
                System.out.println(data[i]);
            } else {
                String isiT2 = data[i].substring(4, data[i].length());
                //isi T2nya dibagi per 18 char
                String[] substring = new String[(isiT2.length() + 17) / 18];
                // isi masing2 trailnya
                for (int j = 0, k = 0; j < isiT2.length(); j += 18, k++) {
                    substring[k] = isiT2.substring(j, Math.min(j + 18, isiT2.length()));
                }
                System.out.println(":T2:" + substring[2] + substring[3] + substring[4] + substring[0] + substring[1]);
            }
        }
    }
}
/*
i = datanya
j = bagi per 18, ada 5 trail
k = isi 18 charnya
*/
