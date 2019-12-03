/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day25RunningTimeAndComplexity;

import java.io.*;
import java.util.*;

/**
 *
 * @author cesaralducinruiz
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int t = 0;

        for (int i = 0; i < c; i++) {

            int d = sc.nextInt();

            if (d > 1) {
                for (int j = 1; j < d; j++) {
                    if (d % j == 0) {
                        t++;
                        System.out.println("dos");
                    }else{
                        System.out.println("dos-dos");
                    }
                }
                if (t <= 2) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not prime");
                }
                t = 0;
            }else{
                System.out.println("Not prime");
            }

        }

    }
}
