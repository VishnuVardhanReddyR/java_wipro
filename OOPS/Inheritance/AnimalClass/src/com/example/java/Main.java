package com.example.java;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        animal.eat("grass");
        animal.sleep("on land");
        bird.eat("nuts");
        bird.sleep("in nest");
        bird.fly();
    }
}
