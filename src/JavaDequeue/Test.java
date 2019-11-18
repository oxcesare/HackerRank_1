/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDequeue;

import java.util.*;

/**
 *
 * @author Supaada-q214
 *
 * 6 3
 * 5 3 5 2 3 2
 */
public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            arr[i] = num;
        }

        int[] arrMax = new int[arr.length];
        int auxF = n;
        for (int i = 0; i < arr.length; i++) {

            if (m <= arr.length) {

                set = new HashSet<>();

                for (int k = i; k < m; k++) {

                    set.add(arr[k]);
                }
                arrMax[i] = set.size();

                set.clear();
                m++;
            } else {

            }

        }

        int max = Arrays.stream(arrMax)
                .max()
                .getAsInt();

        System.out.println(max);

    }

}
