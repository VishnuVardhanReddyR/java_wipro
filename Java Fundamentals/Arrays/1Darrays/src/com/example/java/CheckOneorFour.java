package com.example.java;

import java.util.Scanner;

public class CheckOneorFour {
    public static void main(String[] args) {
        int[] intArray = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < intArray.length ; i++){
            intArray[i] = Integer.parseInt(sc.next());
        }
        boolean flag = true;
        for (int i=0; i < intArray.length;i++){
            if(intArray[i] != 4 && intArray[i] != 1){
                System.out.println("false");
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("true");
        }
    }
}
