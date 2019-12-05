/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day26NestedLogic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author cesaralducinruiz
 */
public class Solution {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        int day = 23; //sc.nextInt();
        int month = 12 - 1;// sc.nextInt();
        int year = 1234;// sc.nextInt();

        int dayFin = 19;// sc.nextInt();
        int monthFin = 9;// sc.nextInt();
        int yearFin = 2468;// sc.nextInt();

        int onTime = 0; //Lo regreso en tiempo
        int onlyFine = 15; // Se paso de dias pero en el mismo mes
        int onTimeMonth = 500; //se paso de mes pero el mismo año
        int onYear = 0; // se paso del año 

        GregorianCalendar Finicial = new GregorianCalendar(year, month, day);

        GregorianCalendar Ffinal = new GregorianCalendar(yearFin, monthFin, dayFin);

        int dayDif = Finicial.get(Calendar.DAY_OF_MONTH) - Ffinal.get(Calendar.DAY_OF_MONTH);

        int monthDif = Finicial.get(Calendar.MONTH) - Ffinal.get(Calendar.MONTH);

        int t = Finicial.get(Calendar.MONTH);
        System.out.println("t" + t);

        int c = Ffinal.get(Calendar.MONTH);
        System.out.println("c" + c);

        int yearDif = Finicial.get(Calendar.YEAR) - Ffinal.get(Calendar.YEAR);

        System.out.println("Diferencia de dias" + dayDif);

        System.out.println("Diferencia de meses" + monthDif);

        System.out.println("Diferencia de años" + yearDif);

        if (yearFin > year) {
            onTime = 0;
            System.out.println(onTime);
        } else {
            if (dayDif <= 0 && monthDif <= 0 && yearDif <= 0) {
                onTime = 0;
                System.out.println(onTime);
            } else if (dayDif > 0 && monthDif <= 0) {
                onlyFine = onlyFine * dayDif;
                System.out.println(onlyFine);
            } else if (monthDif > 0 && yearDif <= 0) {
                onTimeMonth = onTimeMonth * monthDif;
                System.out.println(onTimeMonth);
            } else if (yearDif > 0) {
                onYear = 10000;
                System.out.println(onYear);
            }

        }

    }

}
