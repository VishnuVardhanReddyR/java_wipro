package com.example.java;

public class Fruit {
    String name;
    String taste;
    char size;
    public Fruit(String name,String taste, char size){
        this.name = name;
        this.taste = taste;
        this.size = size;
    }
    public void fruitDes(String name,String taste){
        System.out.println(name + " is " + taste + " in taste" );
    }
}
