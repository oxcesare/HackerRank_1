/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPriorityQueue;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;


/*
 * Create the Student and Priorities classes here.
 */
class Student {

    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

}

class Priorities {

    private final static Scanner scan = new Scanner(System.in);

    List<Student> getStudents(List<String> events) {
        List<Student> studentsFinal = new ArrayList<>();
        PriorityQueue<Student> studenOrder = new PriorityQueue<>(
                Comparator.comparing(Student::getCgpa).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getId)
        );

        for (String eventos : events) {
            if (eventos.equals("ENTER")) {
                String name = scan.next();
                double cgpa = scan.nextFloat();
                int id = scan.nextInt();
                Student student = new Student(id, name, cgpa);
                studenOrder.add(student);
            } else if (eventos.equals("SERVED")) {
                studenOrder.poll();
            }
        }
        scan.close();

        for (Student student : studenOrder) {
            studentsFinal.add(student);
        }

        return studentsFinal;

    }

}

public class Solution {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
