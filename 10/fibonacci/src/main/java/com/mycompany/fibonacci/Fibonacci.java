/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fibonacci;

import java.io.*;
/**
 *
 * @author sSzékely Balázs Csaba
 * @date 2022-12-08
 */
public class Fibonacci {

    public static void main(String[] args) throws IOException {
        int elemszam = 0, elozoElozoSzam = 0, elozoSzam = 1, elem = 1, aktualisSzam = 0;
        
        var br = new BufferedReader(new InputStreamReader(System.in));
        
        do {
            System.out.print("Hány elemig írjam ki a Fibonacci-sorozatot? ");
            elemszam = Integer.parseInt(br.readLine());
            if (elemszam < 1)
                System.out.println("Az elemzámnak legalább 1-nek kell lennie!");
        }while (elemszam < 1);
        do {
            System.out.printf("%d. elem: %d \n",elem, aktualisSzam);
            elem ++;
            
            if (elem > 3 && elem <= elemszam){
                elozoElozoSzam = elozoSzam;
                elozoSzam = aktualisSzam;
            }
            if ( elem <= elemszam)
                aktualisSzam = elozoSzam + elozoElozoSzam;
        }while (elem <= elemszam);
    }
}
