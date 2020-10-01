package com.example.java;
import java.util.Scanner;

public class FloydsFormat {
	public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int number =Integer.parseInt(reader.next());

        for(int i=1;i<=number;i++)
        {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");

            }
            System.out.print("\n");

        }
    }
}
