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

/**
 *
 * @author cesaralducinruiz
 */
public class DuplicateWordsRegex {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        for (int i = 0; i < numSentences; i++) {

            String input = in.nextLine();

            /* Check for subsequences of input that match the compiled pattern
            
             */
            Matcher m = p.matcher(input);

            while (m.find()) {
//                input = input.replaceAll(m.group(), m.group(1));
            }
            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }

}
