/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CovariantReturnTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author cesaralducinruiz
 */
class Flower {

    public String whatsYourName() {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {

    @Override
    public String whatsYourName() {
        return "Jasmine";
    }

}

class Lotus extends Flower {

    @Override
    public String whatsYourName() {
        return "Lotus";

    }
}

class Lily extends Flower {
     @Override
    public String whatsYourName() {
        return "Lily";

    }
}

class Region {

    public Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {

    public Jasmine yourNationalFlower() {
        return new Jasmine();
    }

}

class AndhraPradesh extends Region {

    public Lily yourNationalFlower() {
        return new Lily();
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}
