package com.example.java;

public class AsciiToChar {
    public static void main(String[] args) {
        int[] intArray = new int[]{100,90,97,83,75};
        for(int i = 0; i < intArray.length;i++){
            System.out.print((char) intArray[i] + "\t");
        }
    }
}
