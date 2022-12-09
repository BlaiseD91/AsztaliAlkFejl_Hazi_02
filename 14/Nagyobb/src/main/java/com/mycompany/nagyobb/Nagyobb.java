/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nagyobb;

/**
 *
 * @author Székely Balázs Csaba
 * @date 2022-12-09
 * 
 * Írd ki, hogy melyik a legnagyobb szám a [100;100000] intervallumból, amelyiknek az utolsó számjegye nagyobb, mint az előtte lévő számjegyek összege.
 */
public class Nagyobb {

    public static void main(String[] args) {
        
        int felsoHatar = 100000, alsoHatar = 100; //intervallumhatárok
        int szam = 0; //tároljuk el a megtalált számot
        
        //keresőciklus
        do {
            System.out.println(felsoHatar);
            felsoHatar --;
            if (felsoHatar == 2000){
                szam = felsoHatar;
                break;
            }
            
        }while((felsoHatar >= alsoHatar));
        
        //A megtalált érték kiírása
        System.out.println(szam);
    }
}
