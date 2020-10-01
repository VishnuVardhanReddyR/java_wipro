package com.example.java;

public class Calculator {

    public static int intPower(int num1, int num2){
        int power = (int) Math.pow(num1, num2);
        return power;
    }
    public Double doublePower(double num1, int num2){
        double power = (double) Math.pow(num1, num2);
        return power;
    }

    public static void main(String[] args){
        Calculator cal = new Calculator();
        System.out.println("intPower " + cal.intPower(10,2) + ", doublePower " + cal.doublePower(2.5,2));
    }
}
