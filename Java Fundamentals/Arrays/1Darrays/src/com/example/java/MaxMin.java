package com.example.java;

public class MaxMin {
    public static void main(String[] args) {
        int[] intArray = new int[]{1,4,3,6,3};
        int max = intArray[0];
        for(int i = 1; i < intArray.length;i++){
            if (intArray[i] > max ){
                max = intArray[i];
            }
        }
        System.out.println("max is " + max);
        int min = intArray[0];
        for(int i = 1; i < intArray.length;i++){
            if (intArray[i] < min ){
                min = intArray[i];
            }
        }
        System.out.println("min is " + min);
    }
}
