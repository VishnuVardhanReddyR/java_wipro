package com.example.java;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("drawing square");
    }

    @Override
    public void erase() {
        System.out.println("erasing square");
    }
}
