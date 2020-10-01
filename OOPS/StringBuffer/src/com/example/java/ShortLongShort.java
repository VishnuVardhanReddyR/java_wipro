package com.example.java;

import java.util.Scanner;

public class ShortLongShort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        String string2 = sc.next();
        StringBuffer sb = new StringBuffer();
        if (string1.length() > string2.length()) {
            sb.append(string2);
            sb.append(string1);
            sb.append(string2);
        }
        else {
            sb.append(string1);
            sb.append(string2);
            sb.append(string1);
        }
        System.out.println(sb);
    }
}
