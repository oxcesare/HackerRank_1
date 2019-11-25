/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day16ExceptionsStringtoInteger;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try {
            int n = Integer.parseInt(S);
            System.out.println(n);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
        
    }
}
