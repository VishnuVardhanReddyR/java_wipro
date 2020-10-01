package com.example.java;

import java.util.Scanner;

public class NoFirstLastChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        int n = string1.length();
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < n-1;i++){
            sb.append(string1.charAt(i));
        }
        System.out.println(sb);
    }
}
