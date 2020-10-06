package com.example.java;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt(4) + 1;
            if (randomNum == 1)
                compartments[i] = new FirstClass();
            else if (randomNum == 2)
                compartments[i] = new Ladies();
            else if (randomNum == 3)
                compartments[i] = new General();
            else if (randomNum == 4)
                compartments[i] = new Luggage();
            compartments[i].notice();
        }
    }
}
