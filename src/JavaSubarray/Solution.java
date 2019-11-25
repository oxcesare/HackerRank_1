/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSubarray;

import java.io.*;
import java.util.*;

/**
 *
 * @author cesaralducinruiz
 *
 * 5 - 1, -2, 4,-5, 1
 *
 */
public class Solution {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] m = new int[n];

        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        }

        for (int i = 0; i < m.length; i++) {
            System.out.println("Valores de i " + i);
            for (int j = 0, p = m.length+1; j < p; j++, p--) {
                System.out.println("Valores de j " + j);
            }
        }

    }
}
