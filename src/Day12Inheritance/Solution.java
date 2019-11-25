/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day12Inheritance;

import java.util.*;

class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                + "\nID: " + idNumber);
    }

}

class Student extends Person {

    private int[] testScores;


    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    
    Heraldo Memelli 8135627
2
100 80

     */
    // Write your method here
    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
        this.testScores = testScores;

    }

    char calculate() {

        char value = '\u0000';
        int nScores = testScores.length;
        int sumaScores = 0;
        int scoreFinal = 0;
        String grade = "";

        for (int i = 0; i < testScores.length; i++) {
            sumaScores += testScores[i];
        }

        scoreFinal = sumaScores / nScores;

        if (scoreFinal >= 90 && scoreFinal <= 100) {
            grade = "O";
            value = grade.charAt(0);
        } else if (scoreFinal >= 80 && scoreFinal < 90) {
            grade = "E";
            value = grade.charAt(0);
        } else if (scoreFinal >=70 && scoreFinal < 80) {
            grade = "A";
            value = grade.charAt(0);
        } else if (scoreFinal >= 55 && scoreFinal < 70) {
            grade = "P";
            value = grade.charAt(0);
        } else if (scoreFinal >= 40 && scoreFinal <55) {
            grade = "D";
            value = grade.charAt(0);
        } else {
            grade = "T";
            value = grade.charAt(0);
        }

        return value;
    }

}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
