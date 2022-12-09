/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.szamvagynem;

/**
 *
 * @author Székely Balázs Csaba
 * @date 2022-12-09
 * 
 * Vizsgáljuk meg, hogy egy beolvasott karakterlánc első karaktere szám-e. A maradék karakterekből írjunk ki annyit amennyit az első karakter jelez.
 */
import java.io.*;

public class SzamVagyNem {

    public static void main(String[] args) throws IOException {
        String karakterLanc;
        var br = new BufferedReader(new InputStreamReader(System.in));
        
        //beolvasás
        System.out.println("Add meg a karakterláncot:");
        karakterLanc = br.readLine();
        
        //számmá konvertálás
        int db = (int) karakterLanc.charAt(0)-48;
        
        //kiíratás
        if ((db>=0) && (db<=9)) {
            if (karakterLanc.length()-1>=db){
                for (int i = 1; i < 1+db; i++)
                    System.out.print(karakterLanc.charAt(i));
            }
            else
                System.out.println("A karakterláncod hossza kisebb, mint az elején lévő szám!");
        }
        else
            System.out.println("Az első karakter nem szám!");
        
        
        
        //Teszt
        /*System.out.println(karakterLanc);
        System.out.println(db);*/
    }
}
