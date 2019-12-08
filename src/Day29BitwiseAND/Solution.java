/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day29BitwiseAND;

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

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = 1;// scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            //  String[] nk = scanner.nextLine().split(" ");

            int n = 311;  //Integer.parseInt(nk[0]);

            int k = 277;  //Integer.parseInt(nk[1]);

            //System.out.println(n & k);
            mayorNumber(n, k);
        }

        //scanner.close();
    }

    public static int mayorNumber(int n, int k) {

        int m = 0;
        int l = n;       
        int[] arr = new int[1000000];
        int[] arr2 = new int[1000000];
        int c = 0;
        int d = 0;
        int e = 0;
        int aux = 0;

        for (int i = 1; i < l + 1; i++) {
            //System.out.println("i" + i);
            for (int j = i + 1; j < l + 1; j++) {
                //System.out.println("j" + j);
                //System.out.println("A&B" + " " + (i & j));
                e = (i & j);
                if (e < k) {
                    //System.out.println("elementos menores a k"+e);
                    arr2[c]=e;
                    c++;
                }
            }
        }
        
        int max = Arrays.stream(arr2).max().getAsInt();
        System.out.println(max);
       
        return max;
    }
}
