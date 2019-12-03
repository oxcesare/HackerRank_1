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

    public static void calculateBit(BitSet bits1, BitSet bits2, String p, int index) {

        if (p.equals("AND")) {
            bits1.and(bits2);
        }
        if (p.equals("OR")) {
            bits1.or(bits2);
        }
        if (p.equals("XOR")) {
            bits1.xor(bits2);
        }
        if (p.equals("FLIP")) {
            bits1.flip(index);
        }
        if (p.equals("SET")) {
            bits1.set(index);
        }
        
      

        System.out.println(bits1.cardinality() + " " + bits2.cardinality());

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        BitSet bits1 = new BitSet(n);
        BitSet bits2 = new BitSet(n);
        BitSet bs1, bs2;

        for (int i = 0; i < m; i++) {

            String operacion = scanner.next();
            bs1 = (scanner.nextInt() == 1) ? bits1 : bits2;
            bs2 = (bs1 == bits1) ? bits2 : bits1;
            int index = scanner.nextInt();

            calculateBit(bs1, bs2, operacion, index);
        }

    }

}
