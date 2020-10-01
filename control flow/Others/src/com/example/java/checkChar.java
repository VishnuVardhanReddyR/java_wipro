package com.example.java;

public class checkChar {
    public static void main(String[] args){
        char ch = '*';
        if(Character.isAlphabetic(ch)){
            System.out.println("Alphabetic");
        }
        else if(Character.isDigit(ch)){
            System.out.println("Number");
        }
        else{
            System.out.println("Special character");
        }
    }
}
