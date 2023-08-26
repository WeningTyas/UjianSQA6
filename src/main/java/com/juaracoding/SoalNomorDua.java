package com.juaracoding;

public class SoalNomorDua {
    public static void SoalNomorDua(){
        int angka = 9;
        for (int i = 1; i <= angka; i++) {
            for (int j = i; j <= angka; j++) {
                if (j % 2 == 1){
                    System.out.print(j);
                } else {
                    System.out.print("_");
                }
            }
            angka--;
            System.out.println();
        }
    }
}
