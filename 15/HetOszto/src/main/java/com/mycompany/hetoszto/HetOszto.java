/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hetoszto;

/**
 *
 * @author Székely Balázs Csaba
 * @date 2022-12-10
 * 
 * Írd ki 100-tól kezdve a második 10 darab olyan számot, amelyiknek pontosan 7 osztója van (1-et és önmagát figyelmen kívül hagyva).
 */
public class HetOszto {

    public static void main(String[] args) {
        int minimum = 100;
 
        int[] talalatokTomb = new int[20];
        int talalatok = 0;
        
        do {
            int oszto = minimum / 2;
            int oszthato = 0;
            do {
                if (minimum % oszto == 0)
                    oszthato++;
                if (oszthato == 8)
                    break;
                oszto--;
            }while(oszto > 1);
            if (oszthato == 7){
                talalatokTomb[talalatok] = minimum;
                talalatok++;
            }
            minimum++;
        }while(talalatok != 20);
        
        System.out.println("A talált számok a következők:");
        
        for (int i = 9; i < talalatokTomb.length; i++) {
            System.out.println(talalatokTomb[i]);   
        }
        
        
    }
}
