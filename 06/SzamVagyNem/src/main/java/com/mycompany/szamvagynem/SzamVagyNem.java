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
        
        
        //Teszt
        System.out.println(karakterLanc);
    }
}
