/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2Operators;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author cesaralducinruiz
 */
public class Solution {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip = 0.00D;
        double tax = 0;
        double totalCost = 0;
        int v1=100;
        float axuTip = (float)tip_percent/v1;
        float auxTax = (float)tax_percent/v1;
        tip = (double)meal_cost * (double)axuTip;
        tax = (double)meal_cost * auxTax;
        totalCost = meal_cost + tip + tax;
        System.out.println("" + Math.round(totalCost));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = 12.00D;// scanner.nextDouble();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = 20;// scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = 8;// scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        //scanner.close();
    }
}
