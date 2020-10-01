package com.example.java;

public class TwoLarAndSmall {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 4, 3, 6, 3, 9, 8, 10, 9, 7};
        int max1 = intArray[0];
        int max2 = 0;
        for (int i = 1; i < intArray.length; i++) {
            if(intArray[i] > max1){
                max2 = max1;
                max1 = intArray[i];
            }
            else if(intArray[i] > max2){
                max2 = intArray[i];
            }
        }
        System.out.println("1st max is " + max1 + ", 2nd max is " + max2);
        int min2 = intArray[0];
        int min1 = 0;
        for (int i = 1; i < intArray.length; i++) {
            if(intArray[i] < min2){
                min1 = min2;
                min2 = intArray[i];
            }
            else if(intArray[i] < min1){
                min1 = intArray[i];
            }
        }
        System.out.println("1st min is " + min1 + ", 2nd min is " + min2);
    }
}
