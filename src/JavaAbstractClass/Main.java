/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAbstractClass;

/**
 *
 * @author cesaralducinruiz
 */
import java.util.*;

abstract class Book {

    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }

}

class MyBook extends Book {

    String title;

    @Override
    void setTitle(String s) {
        this.title = s;
    }

    String getTitle() {
        return title;
    }

}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook c = new MyBook();
        c.setTitle(title);
        System.out.println("The title is: " + c.getTitle());
        sc.close();

    }

}
