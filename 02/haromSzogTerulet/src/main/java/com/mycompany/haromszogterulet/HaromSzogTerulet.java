/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.haromszogterulet;

/**
 *
 * @author Székely Balázs Csaba
 * @date 2022-12-05
 */
import java.io.*;

public class HaromSzogTerulet {
    
    public static void main(String[] args) throws IOException {
        double oldal, magassag;
        var br = new BufferedReader(new InputStreamReader(System.in));
        
        
        System.out.print("Add meg az oldal hosszát (cm): ");
        oldal = Double.parseDouble(br.readLine());
        System.out.print("Add meg az oldalhoz tartozó magasságot (cm): ");
        magassag = Double.parseDouble(br.readLine());
        double terulet = oldal*magassag/2;
        System.out.printf("A háromszög területe %.2f cm2", terulet);
    }
}
