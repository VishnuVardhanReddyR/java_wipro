package com.example.java;

public class AvgSum {
    public static void main(String[] args) {
        int[] intArray = {1,4,3,6,3};
        int sum = 0;
        for(int i = 0; i < 5;i++){
            sum += sum + intArray[i];
        }
        int avg = sum / 5;
        System.out.println("sum is " + sum + ", avg is " + avg);
    }
}
