package com.example.java;

public class RevArray {
    public static void main(String[] args) {
        try {
                int[][] intArray = new int[2][2];
                intArray[0][0] = Integer.parseInt(args[0]);
                intArray[0][1] = Integer.parseInt(args[1]);
                intArray[1][0] = Integer.parseInt(args[2]);
                intArray[1][1] = Integer.parseInt(args[3]);
                System.out.println("The given array is: ");
                for(int i = 0; i < intArray.length;i++){
                    System.out.println(intArray[i][0] + " " + intArray[i][1]);
                }
                System.out.println("The reverse array is: ");
                for(int i = intArray.length - 1; i >= 0;i--){
                    System.out.println(intArray[i][1] + " " + intArray[i][0]);
                }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("please enter 4 integer numbers");
        }
    }
}
