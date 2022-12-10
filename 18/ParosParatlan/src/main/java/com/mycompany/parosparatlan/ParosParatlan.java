/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parosparatlan;

/**
 *
 * @author Székely Balázs Csaba
 * @date 2022-12-10
 * 
 * Írjunk függvényt, amely igaz értéked ad vissza, ha a paraméterként megadott szám páratlan, egyéb esetben hamis értéket!
 */
import java.io.*;

public class ParosParatlan {

    public static void main(String[] args) throws IOException {
        
        //paratlan teszt
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Adj meg egy számot: ");
        if(paratlan(Integer.parseInt(br.readLine())))
            System.out.println("A szám páratlan");
        else
            System.out.println("A szám páros");
    }
    
    public static boolean paratlan(int szam){
        if(szam % 2 != 0)
            return true;
        else
            return false;
    }
}
