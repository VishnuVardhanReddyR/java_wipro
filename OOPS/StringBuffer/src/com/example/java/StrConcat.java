package com.example.java;

import java.util.Scanner;

public class StrConcat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        String string2 = sc.next();

        string1=string1.toLowerCase();
        string2=string2.toLowerCase();
        StringBuffer sb = new StringBuffer();
        sb.append(string1);

        if (string1.charAt(string1.length() - 1 ) == string2.charAt(0)){
            sb.append(string2.substring(1,string2.length()));
        }
        else{
            sb.append(string2);
        }
        System.out.println(sb);
    }
}
