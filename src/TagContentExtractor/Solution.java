/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TagContentExtractor;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        String regex = "<(.+)>([^<]+)</\\\\1>";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        int count = 0;
        Scanner in = new Scanner(System.in);
        boolean found = false;
        int testCases = Integer.parseInt(in.nextLine());

        int x = 0;

        while (testCases > 0) {
            String line = in.nextLine();
            Matcher m = p.matcher(line);

            while (m.find()) {
                System.out.println(m.group(2));
                count++;

            }

            if (count == 0) {
                System.out.println("None");
            }

            //Write your code here
            testCases--;
        }
    }
}
