/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaStaticInitializerBlock;

import java.util.Scanner;

/**
 *
 * @author cesaralducinruiz
 *
 * A static initialization blocks allows more complex initialization
 *
 * A static initialization block also runs after the inline static initializers
 *
 * Initializing Fields
 */
public class Solution {

    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();

        if (B > 0 & H > 0) {
            flag = true;
        }else{
             System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }

}

