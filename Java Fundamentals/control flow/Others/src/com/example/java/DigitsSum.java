package com.example.java;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int num = Integer.parseInt(number);
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int n = num % 10;
            num = num / 10;
            sum += n;
        }
        System.out.println(sum);
    }
}
