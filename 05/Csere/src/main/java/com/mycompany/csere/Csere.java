/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.csere;

/**
 *
 * @author Székely Balázs Csaba
 * @date 2022-12-09
 * 
 * Cseréljük ki két változó értékét! Oldjuk meg úgy, hogy ne használjunk segédváltozót!
 */
public class Csere {

    public static void main(String[] args) {
        int a = 10, b = 20;
        
        System.out.println("a változó értéke: " + a);
        System.out.println("b változó értéke: " + b);
        
        a = a + b; //a = 30
        b = a - b; // b = 10
        a = a - b; // a = 20
        
        System.out.println("a változó értéke a csere után: " + a);
        System.out.println("b változó értéke a csere után: " + b);
    }
}
