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
        int szam; //tároljuk el a megtalált számot
        String tesztStr;
        int osszeg;
        int utolsoSzamjegy, egeszresz;
        int kitevo;
        
        
        //keresőciklus
        do {
            osszeg = 0;
            tesztStr = Integer.toString(felsoHatar);
            utolsoSzamjegy = (int) (tesztStr.charAt(tesztStr.length()-1)-48);
            kitevo = tesztStr.length()-1;
            szam = felsoHatar;
            do {
                egeszresz = szam / ((int)Math.pow(10.0, kitevo));
                kitevo--;
                szam = szam % ((int)Math.pow(10.0, kitevo+1));
                osszeg = osszeg + egeszresz;
            }while (szam > 9 || kitevo != 0);
            
            if(osszeg < utolsoSzamjegy)
                break;
            
            felsoHatar --;   
        }while((felsoHatar >= alsoHatar));
        
        //A megtalált érték kiírása
        System.out.println(felsoHatar);
        
        
        
    }
}
