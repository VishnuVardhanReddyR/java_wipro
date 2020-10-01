package com.example.java;

import java.util.Scanner;

public class IgnoreX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        int n = string1.length();
        StringBuffer sb = new StringBuffer();
        if ( string1.charAt(0) == 'x' && string1.charAt(string1.length() - 1) == 'x'){
            for (int i = 1; i < n-1;i++){
                sb.append(string1.charAt(i));
            }
        }
        else if (string1.charAt(0) == 'x'){
            for (int i = 1; i < n;i++){
                sb.append(string1.charAt(i));
            }
        }
        else if (string1.charAt(string1.length() - 1) == 'x'){
            for (int i = 0; i < n-1;i++){
                sb.append(string1.charAt(i));
            }
        }
        else{
            for (int i = 0; i < n;i++){
                sb.append(string1.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
