/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vavevibeszed;

/**
 *
 * @author Székely Balázs Csaba
 * @date 2022-12-11
 * 
 * Írjunk programot, amely beolvas egy ékezetes karakterek nélküli mondatot és kiírja a következőképen átalakítva: a szöveg magánhangzóit lecseréli az alábbi módon:
 *   a -> ava, e -> eve, i -> ivi, o -> ovo, u -> uvu
 *   Például: Ma szep idonk van. Visszaírja: Mava szevep ividovo vavan.
 */
import java.io.*;

public class VaveviBeszed {

    public static void main(String[] args) throws IOException {
        String szoveg; //eltároljuk a megadott szöveget
        String[][] atalakitas = {
            {"a", "ava"},
            {"e", "eve"},
            {"i", "ivi"},
            {"o", "ovo"},
            {"u", "uvu"}
        };//átalakítandó betűk és hogy mire alakítsuk át
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Bekérés
        System.out.println("Add meg az ékezetmentes szöveget, amit át szeretnél alakítani:");
        szoveg = br.readLine();
        
        // átalakítás
        for (int i = 0; i < atalakitas.length; i++) {
            szoveg = szoveg.replaceAll(atalakitas[i][0], atalakitas[i][1]);            
        }

        //Kiíratás
        System.out.println(szoveg);

    }
}
