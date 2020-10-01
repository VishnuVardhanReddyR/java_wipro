package com.example.java;


public class changeCase {
    public static void main(String[] args){
        char alphabet = 'P';
        if( alphabet > 90){
            System.out.println(Character.toUpperCase(alphabet));
        }
        else{
            System.out.println(Character.toLowerCase(alphabet));
        }
    }
}
