/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBitSet;

import java.io.*;
import java.util.*;

/**
 *
 * @author cesaralducinruiz
 *
 * System.out.println(b1.cardinality()+" "+b2.cardinality());
 */
public class Solution {

    public static void calculateBit(int n, int m, String p, int t) {

        BitSet bits1 = new BitSet(n);
        BitSet bits2 = new BitSet(m);

        if (p.equals("AND")) {
            if (t == 1) {
                bits1.and(bits2);
            } else {
                bits2.and(bits1);
            }
        }
        if (p.equals("SET")) {
            if (t == 1) {
                bits1.set(m);
            } else {
                bits2.set(m);
            }
        }
        if (p.equals("FLIP")) {
            if (t == 1) {
                bits1.flip(m);
            } else {
                bits2.flip(m);
            }
        }
        if (p.equals("OR")) {
            if (t == 1) {
                bits1.or(bits2);
            } else {
                bits2.or(bits1);
            }
        }

        System.out.println(bits1.cardinality() + " " + bits2.cardinality());

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int t = scanner.nextInt();

        for (int i = 0; i < c; i++) {
            String operacion = scanner.next();
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            calculateBit(n, m, operacion, t);
        }

    }

}
