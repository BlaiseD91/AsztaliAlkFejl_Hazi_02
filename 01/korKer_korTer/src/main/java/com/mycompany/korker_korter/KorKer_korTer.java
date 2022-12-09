/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.korker_korter;
import java.io.*;
/**
 *
 * @author Székely Balázs Csaba
 * @date 2022-12-05
 */
public class KorKer_korTer {

    public static void main(String[] args) throws IOException {
        double R;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Add meg a kör sugarát (cm): ");
        R = Double.parseDouble(br.readLine());
        
        System.out.printf("A kör kerülete: %.2f cm\n", (Math.PI*2*R));
        System.out.printf("A kör területe: %.2f cm2", (Math.PI*R*R));
    }
}
