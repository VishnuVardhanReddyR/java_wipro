package com.example.java;

public class Orange extends Fruit {
    public Orange(){
        super("Orange","sour",'M');
    }

    @Override
    public void fruitDes(String name, String taste) {
        super.fruitDes(name, taste);
    }
}
