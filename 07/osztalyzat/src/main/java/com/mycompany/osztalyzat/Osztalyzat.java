/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.osztalyzat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author szeke
 */
public class Osztalyzat {

    public static void main(String[] args) throws IOException {

        var br = new BufferedReader(new InputStreamReader(System.in));   
        System.out.print("Add meg az osztályzatot: ");
        int jegy = Integer.parseInt(br.readLine());
        
        String ertek;
        
        switch (jegy) {
            case 1: ertek = "Elégtelen"; break;
            case 2: ertek = "Elégséges"; break;
            case 3: ertek = "Közepes"; break;
            case 4: ertek = "Jó"; break;
            case 5: ertek = "Jeles"; break;
            default: ertek = "";
        }
        System.out.println(ertek);
    }
}
