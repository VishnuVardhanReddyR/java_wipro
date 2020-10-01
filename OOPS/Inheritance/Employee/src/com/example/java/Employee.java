package com.example.java;

public class Employee extends Person {
    private double annualSalary;
    private String joinedDate;
    private String insuranceNum;

    public Employee(String name,int age,double annualSalary,String joinedDate,String insuranceNum){
        this.name = name;
        this.age = age;
        this.annualSalary = annualSalary;
        this.joinedDate = joinedDate;
        this.insuranceNum = insuranceNum;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(String joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getInsuranceNum() {
        return insuranceNum;
    }

    public void setInsuranceNum(String insuranceNum) {
        this.insuranceNum = insuranceNum;
    }
}
