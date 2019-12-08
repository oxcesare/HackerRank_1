/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day28RegExPatternsandIntrotoDatabases;

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

    public static void ordenEmails(List<String> names) {

        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);

        List<String> listNames = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            Matcher matcher = pattern.matcher(emailID);
            if (matcher.find()) {
                listNames.add(firstName);
            }

        }

        ordenEmails(listNames);

        scanner.close();
    }
}
