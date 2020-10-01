package com.example.java;

import java.util.Scanner;

public class nCopies {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        int n = string1.length();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n;i++){
            sb.append(string1.charAt(0));
            sb.append(string1.charAt(1));
        }
        System.out.println(sb);
    }
}
