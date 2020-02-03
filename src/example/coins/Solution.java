/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.coins;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import javax.swing.text.html.HTMLEditorKit;

/**
 *
 * @author cesaralducinruiz
 */
class Result {

    /*
     * Complete the 'getWays' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. LONG_INTEGER_ARRAY c
     */
    public static long getWays(int n, List<Long> c) {
        // Write your code here
        long x = 1;

        System.out.println("n" + n);
        System.out.println("c size()" + c.size());
        
        long sumaElementos =0;
        for (Long long1 : c) {
            sumaElementos = sumaElementos + long1;
        }

        System.out.println("suma total de las monedas"+ " " +sumaElementos);
        return x;

    }

}

public class Solution {

    public static void main(String[] args) throws IOException {

        String[] firstMultipleInput = {"10", "4"};

        //bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Long> c = new ArrayList<>();
        c.add(Long.parseLong("2"));
        c.add(Long.parseLong("5"));
        c.add(Long.parseLong("3"));
        c.add(Long.parseLong("6"));

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = Result.getWays(n, c);

        System.out.println("ways" + " " + ways);

    }

}
