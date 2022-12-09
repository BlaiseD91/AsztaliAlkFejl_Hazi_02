/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.elteltnapok;

/**
 *
 * @author Székel Balázs Csaba, BlaiseD91
 * @date 2022-12-06
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.NumberFormatException;
public class ElteltNapok {

    public static void main(String[] args) throws IOException{
        // Változók deklarálása
        String datumA, datumB;
        String datumAtomb[], datumBtomb[];
        int evA, evB, honapA, honapB, napA, napB, elteltNapok = 0;
        var br = new BufferedReader(new InputStreamReader(System.in));
        
        // Adatbekérés
        do {
            System.out.print("Add meg az első dátumot (YY-MM-DD): ");
            datumA = br.readLine();
            datumAtomb = datumA.split("-", 3);
            evA = Integer.parseInt(datumAtomb[0]);
            honapA = Integer.parseInt(datumAtomb[1]);
            napA = Integer.parseInt(datumAtomb[2]);
            if (evA < 1 || (honapA < 1 || honapA > 12) || (napA < 1 || napA > 31))
                System.out.println("A megadott dátum hibás, add meg újra helyesen!");
        } while (evA < 1 || (honapA < 1 || honapA > 12) || (napA < 1 || napA > 31));
        do {
            System.out.print("Add meg a második dátumot (YYYY-MM-DD): ");
            datumB = br.readLine();
            datumBtomb = datumB.split("-", 3);
            evB = Integer.parseInt(datumBtomb[0]);
            honapB = Integer.parseInt(datumBtomb[1]);
            napB = Integer.parseInt(datumBtomb[2]);
            if (evB < 1 || (honapB < 1 || honapB > 12) || (napB < 1 || napB > 31))
                    System.out.println("A megadott dátum hibás, add meg újra helyesen!");
        } while (evB < 1 || (honapB < 1 || honapB > 12) || (napB < 1 || napB > 31));
        
        // Dátum konvertálása napokká
        napA = napA + honapA*30 + evA*365;
        napB = napB + honapB*30 + evB*365;
        
        // Eltelt napok számának kiszámítása
        elteltNapok = Math.abs(napA-napB);
        
        // Kiíratás
        System.out.printf("%s és %s között eltelt napok száma %d nap", datumA, datumB, elteltNapok);
        
    }
}
