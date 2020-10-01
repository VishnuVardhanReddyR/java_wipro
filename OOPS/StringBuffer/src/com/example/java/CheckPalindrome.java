package com.example.java;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int n = string.length();
        boolean flag = true;
        for(int i = 0;i < (int) n/2;i++){
            if(string.charAt(i) != string.charAt(n-1-i)){
                flag = false;
            }
        }
        if(flag){
            System.out.println(string + " is palindrome");
        }
        else{
            System.out.println(string + " is not a palindrome");
        }
    }
}
