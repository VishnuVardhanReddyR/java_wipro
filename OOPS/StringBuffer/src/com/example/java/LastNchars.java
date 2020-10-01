package com.example.java;

import java.util.Scanner;

public class LastNchars {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        int n = Integer.parseInt(sc.next());
        int start = string1.length() - n;
        StringBuffer sb = new StringBuffer();
        for (int i = start; i < string1.length();i++){
            sb.append(string1.charAt(i));
        }
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < n;i++){
            sb1.append(sb);
        }
            System.out.println(sb1);
    }
}
