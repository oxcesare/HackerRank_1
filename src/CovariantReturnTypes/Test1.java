/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CovariantReturnTypes;

/**
 *
 * @author cesaralducinruiz
 */
public class Test1 {

    public static void main(String[] args) {

        String[] arregloCadenas = {"·$%&/()$", "$", "%%", "%%"};
        exampleSplit(arregloCadenas);

    }

    public static void exampleSplit(String[] args) {

        String[] tokens = args[0].split(args[0]);

        for (String token : tokens) {
            System.out.println("tokens:" + " " + token);
        }
    }

}
