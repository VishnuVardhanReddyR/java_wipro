package com.example.java;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        int rev = 0;
        while(num != 0){
            int n = num % 10;
            num = num / 10;
            rev = (rev * 10) + n;
        }
        System.out.println(rev);
    }
}
