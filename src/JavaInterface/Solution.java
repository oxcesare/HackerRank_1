/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInterface;

import java.util.Scanner;

/**
 *
 * @author cesaralducinruiz
 */

interface AdvancedArithmetic {
    
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {
        int divisor=0;
        
        for (int i = 1; i < n; i++) {
            if(n % i ==0){
                System.out.println("Entraron "+ i);
                divisor += i; 
            }
        }
        return divisor+n;
    }
    
}
public class Solution {
     public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
     
     static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
