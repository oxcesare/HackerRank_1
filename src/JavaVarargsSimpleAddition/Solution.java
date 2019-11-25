/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaVarargsSimpleAddition;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Add {

    void add(int... n1) {
        int suma = 0;

        for (int i = 0; i < n1.length; i++) {
            suma += n1[i];
        }

        if(n1.length==2){
            System.out.println(n1[0]+"+"+n1[1]+"="+suma);
        }
        if(n1.length==3){
            System.out.println(n1[0]+"+"+n1[1]+"+"+n1[2]+"="+suma);
        }
        if(n1.length==4){
            System.out.println(n1[0]+"+"+n1[1]+"+"+n1[2]+"+"+n1[3]+"="+suma);
        }
        if(n1.length==5){
            System.out.println(n1[0]+"+"+n1[1]+"+"+n1[2]+"+"+n1[3]+"+"+n1[4]+"="+suma);
        }
        if(n1.length==6){
            System.out.println(n1[0]+"+"+n1[1]+"+"+n1[2]+"+"+n1[3]+"+"+n1[4]+"+"+n1[5]+"="+suma);
        }

    }

}

public class Solution {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            int n6 = Integer.parseInt(br.readLine());
            Add ob = new Add();
            ob.add(n1, n2);
            ob.add(n1, n2, n3);
            ob.add(n1,n2,n3,n4,n5);	
            ob.add(n1, n2, n3, n4, n5, n6);
            Method[] methods = Add.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
