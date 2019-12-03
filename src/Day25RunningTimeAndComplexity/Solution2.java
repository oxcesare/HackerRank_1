/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day25RunningTimeAndComplexity;

import java.util.Scanner;

/**
 *
 * @author cesaralducinruiz
 */
public class Solution2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int t = 0;
        int j=1;

        for (int i = 0; i < c; i++) {

            int d = sc.nextInt();

            if (d > 1) {
                while(d%j==0){
                    t++;
                }
                
                String x = t <= 2 ?"Prime": "Not prime";
            } else {
                System.out.println("Not prime");
            }

        }

    }

}
