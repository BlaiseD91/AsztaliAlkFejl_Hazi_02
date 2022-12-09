/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.masodperc;

/**
 *
 * @author Székely Balázs Csaba
 * @date 2022-12-05
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Masodperc {

    public static void main(String[] args) throws IOException {
        int nap, ora, perc, masodperc;
        var br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Add meg a napok számát: "); nap = Integer.parseInt(br.readLine());
        System.out.print("Add meg az órák számát: "); ora = Integer.parseInt(br.readLine());
        System.out.print("Add meg a percek számát: "); perc = Integer.parseInt(br.readLine());
        System.out.print("Add meg a másodpercek számát: "); masodperc = Integer.parseInt(br.readLine());
        
        if (nap > 0)
            masodperc += nap*24*60*60;
        if (ora > 0)
            masodperc += ora*60*60;
        if (perc > 0)
            masodperc += perc*60;
        
        System.out.println("Az általad megadott időpont " + masodperc + " másodperc");
    }
}
