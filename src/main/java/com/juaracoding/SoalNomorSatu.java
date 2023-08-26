package com.juaracoding;

public class SoalNomorSatu {
    public static void SoalNomorSatu() {
        int angka = 100;
        for (int i = 1; i <= angka; i++) {
            if (i % 3 == 0){
                System.out.print("BIZZ");
            }
            if (i % 5 == 0){
                System.out.print("BUZZ");
            }
            if (i % 3 != 0 && i % 5 != 0){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
