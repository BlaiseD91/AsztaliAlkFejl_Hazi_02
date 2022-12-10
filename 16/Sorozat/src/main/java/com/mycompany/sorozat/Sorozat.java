/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sorozat;

/**
 *
 * @author Székely Balázs Csaba
 * @date 2022-12-10
 * 
 * Írd ki annak a sorozatnak a 15. elemét, amelyet úgy kapsz meg, hogy minden következő elemet az előző szám számjegyeinek kétszereséből állítod elő! (1, 2, 4, 8, 16, 212, 424, 848, 16816)
 */
public class Sorozat {

    public static void main(String[] args) {
        final int DB_SZAM =  13; //elemszám, ha később több kellene
        long[] szamok = new long[DB_SZAM]; //itt tároljuk a találatokat
        long szam = 1; //1-től kezdünk
        int megvanDb = 0;
        
        //számok előállítása
        szamok[megvanDb] = szam;
        megvanDb++;
        do {
            String szamStr = Long.toString(szam);
            int hossz = szamStr.length();
            String segedStr = "";
            long segedSzam;
            for (int i = 0; i < hossz; i++) {
                segedSzam = 2 * ((long) szamStr.charAt(i)-48);
                segedStr = segedStr + String.valueOf(segedSzam);
            }
            szam = Long.parseLong(segedStr);

            szamok[megvanDb] = szam;
            megvanDb++;
        }while(megvanDb != DB_SZAM);
        
        //Kiíratás
        System.out.println(szamok[szamok.length-1]);
    }
}
