/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaStringsIntroduction;

import java.util.*;

/**
 *
 * @author cesaralducinruiz
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A ="java";// sc.next();
        String B ="java";// sc.next();
        int suma = A.length() + B.length();
        String res = "";
        
        System.out.println(suma+ " ");

        int compara = A.compareTo(B);
        if (compara<0) {
            res = "NO";
            System.out.println(res+" ");
        } else {
            res = "SI";
            System.out.println(res+" ");
        }

        
        String a = ""; 
        String b = "";
        for (int i = 0; i < A.length(); i++) {
            String aux2 = "";
            
            char f ='\u0000';
            if (i == 0) {
                /* Obtengo la primera y la pongo en mayuscula */
                f = A.charAt(i);
                String aux = String.valueOf(f);
                aux2 = aux.toUpperCase();                
                b= a.concat(aux2);
                System.out.print(b);
            } else {
                f = A.charAt(i);
                String aux3 = String.valueOf(f);                
                System.out.print(aux3);
            }

        }
        
        a="";
        b="";
        
        
        for (int i = 0; i < B.length(); i++) {
            String aux2 = "";
            
            char f = '\n';
            if (i == 0) {
                /* Obtengo la primera y la pongo en mayuscula */
                f = B.charAt(i);
                String aux = String.valueOf(f);
                aux2 = aux.toUpperCase();                
                b= a.concat(aux2);
                System.out.print(" " +b);
            } else {
                f = B.charAt(i);
                String aux3 = String.valueOf(f);                
                System.out.print(aux3);
            }

        }
        
        
        
        //System.out.print(a);

        /* Enter your code here. Print output to STDOUT. */
    }
}
