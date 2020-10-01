package com.example.java;

public class Main {

    public static void main(String[] args) {
	    Employee emp = new Employee("Ram", 24,45000.65,"1st oct 2020","4k5JDK4");
        System.out.println("Employee name             : " + emp.getName());
        System.out.println("Employee age              : " + emp.getAge());
        System.out.println("Employee salary(annually) : " + emp.getAnnualSalary());
        System.out.println("Employee joined Date      : " + emp.getJoinedDate());
        System.out.println("Employee insurance number : " + emp.getInsuranceNum());
    }
}
