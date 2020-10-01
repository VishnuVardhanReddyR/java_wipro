package com.example.java;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] intArray = new int[]{100,90,97,83,75};
        Arrays.sort(intArray);
        for(int i = 0; i < intArray.length;i++){
            System.out.print( intArray[i] + "\t");
        }
    }
}
