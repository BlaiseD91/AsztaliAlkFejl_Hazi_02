/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.homerseklet;

/**
 *
 * @author Székely Balázs Csaba
 * @date 2022-12-08
 */
public class Homerseklet {

    public static void main(String[] args) {
        int celsius = 32;
        String fahr = "Fahrenheit", cels = "Celsius", kelv = "Kelvin";
        double fahrenheit, kelvin;
        
        System.out.println("Hőmértéklet:");
        System.out.printf("%10s: ", cels);
        do {
            System.out.printf("%+6d | ", celsius);
            celsius --;
        }while (celsius >= -9);
        celsius = 32;
        System.out.printf("\n%10s: ", fahr);
        do {
            fahrenheit = 1.8*celsius + 32;
            System.out.printf("%+6.1f | ", fahrenheit);
            celsius --;
        }while (celsius >= -9);
        celsius = 32;
        System.out.printf("\n%10s: ", kelv);
        do {
            kelvin = celsius+273.15;
            System.out.printf("%+6.1f | ", kelvin);
            celsius --;
        }while (celsius >= -9);
    }
}
