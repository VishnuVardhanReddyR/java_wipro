package com.example.java;

public class LargestEle {
    public static void main(String[] args) {
        try {
            int[][] intArray = new int[3][3];
            intArray[0][0] = Integer.parseInt(args[0]);
            intArray[0][1] = Integer.parseInt(args[1]);
            intArray[0][2] = Integer.parseInt(args[2]);
            intArray[1][0] = Integer.parseInt(args[3]);
            intArray[1][1] = Integer.parseInt(args[4]);
            intArray[1][2] = Integer.parseInt(args[5]);
            intArray[2][0] = Integer.parseInt(args[6]);
            intArray[2][1] = Integer.parseInt(args[7]);
            intArray[2][2] = Integer.parseInt(args[8]);
            System.out.println("The given array is: ");
            for(int i = 0; i < intArray.length;i++){
                System.out.println(intArray[i][0] + " " + intArray[i][1] + " " + intArray[i][2]);
            }

            int max = 0;
            for(int i = 0; i < intArray.length;i++){
                for (int j=0; j < intArray.length;j++){
                    if(intArray[i][j] > max){
                        max = intArray[i][j];
                    }
                }
            }
            System.out.println("The biggest number in the given array is " + max);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("please enter 9 integer numbers");
        }
    }
}
