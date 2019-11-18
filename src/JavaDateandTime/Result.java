/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDateandTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author cesaralducinruiz
 */
public class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2015, Calendar.JANUARY, 1);

        Scanner in = new Scanner(System.in);
        String[] firstMultipleInput = new String[3];

        int month = 10; //Integer.parseInt(firstMultipleInput[0]);

        int day = 1; //Integer.parseInt(firstMultipleInput[1]);

        int year = 2018;//Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        in.close();

    }

    public static String findDay(int month, int day, int year) {

        LocalDate dt = LocalDate.of(year, month, day);
        DayOfWeek dayOf = dt.getDayOfWeek();
        String res = dayOf.toString();

        return res;
    }
}
