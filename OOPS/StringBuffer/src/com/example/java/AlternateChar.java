package com.example.java;

import java.util.Scanner;

public class AlternateChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        String string2 = sc.next();
        int n = string1.length();
        StringBuffer sb = new StringBuffer();

        if (string1.length() > string2.length()) {
            for (int i = 0; i < string1.length();i++){
                if( i >= string2.length()){
                    sb.append(string1.charAt(i));
                }
                else {
                    sb.append(string1.charAt(i));
                    sb.append(string2.charAt(i));
                }
            }
        }
        else {
            for (int i = 0; i < string2.length();i++){
                if( i >= string1.length()){
                    sb.append(string2.charAt(i));
                }
                else {
                    sb.append(string1.charAt(i));
                    sb.append(string2.charAt(i));
                }
            }
        }
            System.out.println(sb);
    }
}
