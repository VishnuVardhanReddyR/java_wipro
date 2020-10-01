package com.example.java;

import java.util.Scanner;

public class HalfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        int n = string1.length();

        if (n % 2 == 0) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < n/2;i++){
                sb.append(string1.charAt(i));
            }
            System.out.println(sb);
        }
        else {
            System.out.println("null");
        }
    }
}
