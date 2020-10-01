package com.example.java;

import java.util.Scanner;

public class StarElimination {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();

        String[] strs = string1.split(".[\\*]+.");    // * cannot be given directly so we give it as [\\*]
                                                            // to remove the left,right characters of star we keep
                                                            // . at front and +. at end
        StringBuffer sb = new StringBuffer();

        for (String x : strs) {
            sb.append(x);
        }
        System.out.println(sb);
    }
}
