package com.example.java;

import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args){
        for(int n = 10; n <= 99;n++) {
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(n + "\t");
            }
        }
    }
}
