package com.example.java;

import java.util.Scanner;

public class OddAfterEven {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < intArray.length ; i++){
            intArray[i] = Integer.parseInt(sc.next());
        }
        int[] dup = new int[intArray.length];
        int l = 0;
        for(int i = 0; i < intArray.length;i++){
            if(intArray[i] % 2 != 0){
                dup[l++] = intArray[i];
            }
        }
        int e = 0;
        for(int i = 0; i < intArray.length;i++){
            if(intArray[i] % 2 == 0){
                intArray[e++] = intArray[i];
            }
        }
        for (int i = e, j=0; i < intArray.length;i++,j++){
            intArray[i] = dup[j];
        }

        for (int i = 0; i < intArray.length;i++){
            System.out.print(intArray[i] + "\t");
        }
    }
}
