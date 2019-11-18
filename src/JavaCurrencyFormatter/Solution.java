/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCurrencyFormatter;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 *
 * @author cesaralducinruiz
 */
public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);        
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);        
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        
        System.out.println("US: " + us.format(payment).toString());
        System.out.println("India: " + india.format(payment).toString());
        System.out.println("China: " + china.format(payment).toString());
        System.out.println("France: " + france.format(payment).toString());
    }
    
    
}
