/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAnagrams;

import java.util.Scanner;

/**
 *
 * @author cesaralducinruiz
 */
public class Solution {

    static boolean isAnagram(String a, String b) {
        boolean res = false;
        
        

        return res;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
