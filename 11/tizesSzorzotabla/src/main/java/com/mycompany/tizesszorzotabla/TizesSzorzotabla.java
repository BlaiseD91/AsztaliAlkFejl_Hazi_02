/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tizesszorzotabla;


/**
 *
 * @author Székely Balázs Csaba
 * @date 2022-12-08
 */
public class TizesSzorzotabla {

    public static void main(String[] args) {
        int szorzo = 1, szorzando = 1;
        System.out.println("10x10-es szorzótábla");
        
        System.out.println("  X |  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 | 10 |");
        do {
            System.out.printf("%3d |", szorzo);
            do {
                System.out.printf("%3d |", szorzando*szorzo);
                szorzando++;
            }while (szorzando <= 10);
            System.out.println("");
            szorzo++;
            szorzando = 1;
        }while (szorzo <= 10);
    }
}
