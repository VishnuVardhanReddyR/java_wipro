package com.example.java;

public class Apple extends Fruit {
    public Apple(){
        super("Apple","sweet",'M');
    }

    @Override
    public void fruitDes(String name, String taste) {
        super.fruitDes(name, taste);
    }
}
