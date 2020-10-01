package com.example.java;

import java.util.Scanner;

public class searchKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = Integer.parseInt(sc.next());
        int[] intArray = new int[]{1,4,3,6,3};
        boolean flag = false;
        for(int i = 0; i < intArray.length;i++){
            if (intArray[i] == key ){
                System.out.println("the pos of " + key + " is " + i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("-1");
        }
    }
}
