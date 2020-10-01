package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numeric value: ");
        Integer num = sc.nextInt();
        if (num < 0){
            System.out.println("Negative");
        }
        else if (num == 0){
            System.out.println("Zero");
        }
        else {
            System.out.println("Positive");
        }
    }
}
