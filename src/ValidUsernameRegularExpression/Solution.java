/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValidUsernameRegularExpression;

import java.util.Scanner;

class UsernameValidator {

    /*
     * Write regular expression here.
    
       String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
       String pattern = num + "." +  num + "." +  num + "." + num;
     */
    public static final String regularExpression = "([A-Za-z][A-Za-z0-9_]{7,29})";
}

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
