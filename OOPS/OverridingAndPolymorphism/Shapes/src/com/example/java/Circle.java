package com.example.java;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("drawing circle");
    }

    @Override
    public void erase() {
        System.out.println("erasing circle");
    }
}
