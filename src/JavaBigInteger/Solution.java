/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBigInteger;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        BigInteger  a = sc.nextBigInteger();
        BigInteger  b = sc.nextBigInteger();
        sc.close();
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        
    }

}
