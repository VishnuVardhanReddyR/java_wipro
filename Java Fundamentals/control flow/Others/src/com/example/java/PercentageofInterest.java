package com.example.java;

public class PercentageofInterest {
    public static void main(String[] args){
        Integer age = Integer.parseInt(args[1]);
        if(args[0].equals("Female")){
            if(age >= 1 || age <= 58){
                System.out.println("Percentage of interest is 8.2%");
            }
            else if(age >= 59 || age <= 100){
                System.out.println("Percentage of interest is 9.2%");
            }
        }
        else if(args[0].equals("male")){
            if(age >= 1 || age <= 58){
                System.out.println("Percentage of interest is 8.4%");
            }
            else if(age >= 59 || age <= 100){
                System.out.println("Percentage of interest is 10.5%");
            }
        }
    }
}
