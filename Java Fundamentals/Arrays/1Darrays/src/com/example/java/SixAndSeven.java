package com.example.java;

public class SixAndSeven {
    public static void main(String[] args) {
        int[] intArray = new int[]{100, 90, 97, 6, 85, 85, 45, 75, 90, 92, 83, 100, 7, 65};
        boolean flag = false;
        int temp1 = 0;
        int temp2 = 0;
        for(int i = 0; i < intArray.length;i++){
            if(intArray[i] == 6){
                for (int j = i +1 ; j < intArray.length; j++){
                    if (intArray[j] == 7){
                        temp1 = i;
                        temp2 = j;
                        flag = true;
                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < intArray.length;i++){
            if(!flag) {
                sum += intArray[i];
            }
            else{
                if(i >= temp1 && i <= temp2 ){
                    continue;
                }
                else{
                    sum += intArray[i];
                }
            }
        }
        System.out.println("sum is " + sum);
    }
}
