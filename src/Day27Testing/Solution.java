/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day27Testing;

import java.util.*;

public class Solution {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    static class TestDataEmptyArray {

        public static int[] get_array() {

            int[] arr = new int[0];

            return arr;
        }
    }

    static class TestDataUniqueValues {

        public static int[] get_array() {
            int[] arr = {7, 8};

            return arr;
        }

        public static int get_expected_result() {
            int min_idx = 0;
           
            return min_idx;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {

        public static int[] get_array() {
             int[] arr = {0,1};

            return arr;
        }

        public static int get_expected_result() {
                 int min_idx = 0;
           
            return min_idx;
        }
    }
    
}
