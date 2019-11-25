/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaRegex2DuplicateWords;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "/* Write a RegEx matching repeated words here. */";
        /* Insert the correct Pattern flag here.*/
        Pattern p = Pattern.compile(regex, 1);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            String[] strWords = input.split("\\s+");

            LinkedHashSet<String> lhSetWords
                    = new LinkedHashSet<String>(Arrays.asList(strWords));

            StringBuilder sbTemp = new StringBuilder();
            int index = 0;

            for (String s : lhSetWords) {

                if (index > 0) {
                    sbTemp.append(" ");
                }

                sbTemp.append(s);
                index++;
            }

            input = sbTemp.toString();


            /* Check for subsequences of input that match the compiled pattern
            
            
            Matcher m = p.matcher(input);
            
            while (m.find()) {
                input = input.replaceAll(regex, input);
            }*/
            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
