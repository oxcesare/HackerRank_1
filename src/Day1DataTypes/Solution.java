/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1DataTypes;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        int secondInteger =12; //""scan.nextInt();
        double secondDouble =4.0;// scan.nextDouble();
        String seconString = scan.nextLine();
        seconString = scan.nextLine();
        
        System.out.println((i+secondInteger));
        System.out.println((d+secondDouble));        
        System.out.println(s.concat(seconString));

        scan.close();
    }
}