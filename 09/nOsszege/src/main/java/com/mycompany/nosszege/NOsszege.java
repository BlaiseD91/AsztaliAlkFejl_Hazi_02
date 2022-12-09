/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nosszege;

import java.io.*;

/**
 *
 * @author Székely Balázs Csaba
 * @date 2022-12-08
 */
public class NOsszege {

    public static void main(String[] args) throws IOException {
        int szam, n = 1, eredmeny = 0;
        var br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Hány számot szeretnél összeadni? ");
        szam = Integer.parseInt(br.readLine());
        
        do {
            eredmeny += n;
            n++; 
        }while(n <= szam); 
        System.out.printf("Ha a megadott számig összeadjuk a számokat, akkor az eredmény %d", eredmeny);
    }
}
