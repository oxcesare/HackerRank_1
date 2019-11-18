/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaEndoffile;

import java.io.*;
import java.util.*;

/**
 *
 * @author cesaralducinruiz
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;

        while (in.hasNextLine()) {
            i++;
            System.out.println(i + " " + in.nextLine());
        }

    }
}
