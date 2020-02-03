/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10BinaryNumbers;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String f = Integer.toBinaryString(n);
        int contador = 0;
        int i = 0;
        int t = 0;
        int[] integers = null;

        if (f.length() > 4) {
            integers = new int[f.length() - 1];
        } else {
            integers = new int[f.length()];
        }
        
        /*
           
           5 
          binary representation is 1010 =  2 (1) 
        
          7  
          binary representation is 1110 =  3 (1) 
        
        
        */

        while (i < f.length()) {

            char c = f.charAt(i);
            String x = String.valueOf(c);

            if (x.equals("1")) {
                contador++;
            } else {
                integers[t] = contador;
                contador = 0;
                t++;
            }
            /* Pregunto si es el final del arreglo para que 
               considere todas las posiciones
            
            
             */
            if (i == f.length() - 1) {
                t++;
                integers[t] = contador;
            }
            i++;

        }

        int max = Arrays.stream(integers)
                .max()
                .getAsInt();

        System.out.println(max);

        scanner.close();
    }
}
