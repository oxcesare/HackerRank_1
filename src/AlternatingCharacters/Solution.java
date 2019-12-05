/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlternatingCharacters;

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

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

        int b = 1;
        int l = s.length();
        char d = 0;
        String a = "";
        String e = "";
        int remover = 0;

        List<String> listaLetras = new ArrayList<String>();

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            a = String.valueOf(c);
            if ((i + 1) == l) {
                break;
            } else {
                d = s.charAt(i + 1);
                e = String.valueOf(d);
            }

            if (a.equals(e)) {
                remover++;
            } else {
                listaLetras.add(a);
            }
        }

        b = remover;
        return b;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = 1; // scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = "AAABBB";//scanner.nextLine();

            int result = alternatingCharacters(s);

            System.out.println(String.valueOf(result));

        }

        scanner.close();
    }
}
