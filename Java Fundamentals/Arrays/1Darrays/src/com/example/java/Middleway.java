package com.example.java;

import java.util.Scanner;

public class Middleway {
    public static void main(String[] args) {
        int[] FirstArray = new int[3];
        int[] SecondArray = new int[3];
        int[] midArray = new int[2];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < FirstArray.length ; i++){
            FirstArray[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i < SecondArray.length ; i++){
            SecondArray[i] = Integer.parseInt(sc.next());
        }
        midArray[0] = FirstArray[1];
        midArray[1] = SecondArray[1];
        System.out.println("[" + midArray[0] + "," + midArray[1] + "]");
    }
}
