package com.example.java;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("drawing Triangle");
    }

    @Override
    public void erase() {
        System.out.println("erasing Triangle");
    }
}
