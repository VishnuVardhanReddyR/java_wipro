package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple());
        fruits.add(new Orange());

        for (Fruit f : fruits){
            System.out.println(f.name + " of size " + f.size + " tastes " + f.taste);
            f.fruitDes(f.name,f.taste);
        }
    }
}
