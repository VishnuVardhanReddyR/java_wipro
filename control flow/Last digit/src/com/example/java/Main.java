package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num1 = sc.nextInt();
        Integer num2 = sc.nextInt();
        lastDigit(num1,num2);
    }
    public static void lastDigit(int a, int b){
        int num1 = a % 10;
        int num2 = b % 10;
        if(num1 == num2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
