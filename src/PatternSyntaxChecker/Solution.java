/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatternSyntaxChecker;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author cesaralducinruiz
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            try {
                 Pattern p = Pattern.compile(pattern);
                 System.err.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
        in.close();
    }
}
