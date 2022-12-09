/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.napokszama;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Székely Balázs Csaba
 * @date 2022-12-08
 */
public class NapokSzama {

    public static void main(String[] args) throws IOException {
        int ev, honap, napok = 0;
        var br = new BufferedReader(new InputStreamReader(System.in));
        
        do {
            System.out.print("Add meg az évet: ");
            ev = Integer.parseInt(br.readLine());
            System.out.print("Add meg a hónap számát: ");
            honap = Integer.parseInt(br.readLine());
        }while (ev == 0 || honap < 1 || honap > 12);
        
        switch (honap) {
            case 1: napok = 31; break;
            case 2: if(ev%4 == 0) napok = 29; else napok = 28; break;
            case 3: napok = 31; break;
            case 4: napok = 30; break;
            case 5: napok = 31; break;
            case 6: napok = 30; break;
            case 7: napok = 31; break;
            case 8: napok = 31; break;
            case 9: napok = 30; break;
            case 10: napok = 31; break;
            case 11: napok = 30; break;
            case 12: napok = 31; break;
            default: napok = 0;
        }
        System.out.printf("A megadott hónapban %d nap van.", napok);
    }
}
