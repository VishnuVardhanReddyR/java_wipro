package com.example.java;

import java.util.Scanner;

public class TensReplace {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < intArray.length ; i++){
            intArray[i] = Integer.parseInt(sc.next());
        }
        int[] dup = new int[intArray.length];
        int l = 0;
        for(int i = 0; i < intArray.length;i++){
            if(intArray[i] != 10){
                dup[l++] = intArray[i];
            }
        }
        for (int i = 0; i < dup.length ;i++){
            System.out.print(dup[i] + "\t");
        }
    }
}
