package com.example.java;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int n = Integer.parseInt(number);
        boolean flag = true;
        for(int i= 2; i < n; i++){
            if(n % i == 0) {
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println( n + " is a prime number");
        }
        else{
            System.out.println(n + " is not a prime number");
        }
    }
}
