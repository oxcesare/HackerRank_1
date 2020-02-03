/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniMaxSum;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author cesaralducinruiz
 */
public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        int l = arr.length;
        long sumaUno = 0;
        long sumaDos = 0;
        long sumaTres = 0;
        long sumaCuatro = 0;
        long sumaCinco = 0;
        int x = 0;
        
        for (Integer i = 0; i < l; i++) {
            sumaUno = sumaUno + arr[i];
        }
        
        sumaUno = sumaUno - arr[0];

        for (int i = 0; i < l; i++) {
            sumaDos = sumaDos + arr[i];
        }
        
        sumaDos = sumaDos - arr[1];

         for (Integer i = 0; i < l; i++) {
            sumaTres = sumaTres + arr[i];
        }
        
        sumaTres = sumaTres - arr[2];

         for (Integer i = 0; i < l; i++) {
            sumaCuatro = sumaCuatro + arr[i];
        }
        
        sumaCuatro = sumaCuatro - arr[3];

         for (Integer i = 0; i < l; i++) {
            sumaCinco = sumaCinco + arr[i];
        }
        
        sumaCinco = sumaCinco - arr[4];

        
        long [] arrAll = {sumaUno,sumaDos,sumaTres,sumaCuatro,sumaCinco};
        
        long max = Arrays.stream( arrAll).max().getAsLong();
        long min = Arrays.stream( arrAll).min().getAsLong();
        
        System.out.print(min + " " + max);
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        //769082435 = 44
        //210437958 = 40 
        //673982045 = 30 *****Min
        //375809214 = 35
        //380564127 = 50 ***** Max 
        
        //1640793344 2199437821
        
        String[] arrItems ={"769082435", "210437958" ,"673982045", "375809214","380564127"};
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        //scanner.close();
    }
}
