/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMD5;

import java.io.*;
import java.util.*;
import java.security.*;
import java.math.*;

public class Solution {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) throws Exception {
        try {
            String s = sc.next();
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(s.getBytes(), 0, s.length());
            System.out.println(new BigInteger(1, m.digest()).toString(16));
        } catch (Exception e) {
            e.getMessage();
        }

    }
}
