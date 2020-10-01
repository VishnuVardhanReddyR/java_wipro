package com.example.java;

public class RmvDup {
    public static void main(String[] args) {
        int[] intArray = new int[]{100, 90, 97, 83, 85, 85, 45, 75, 90, 92, 83, 100, 90, 65};
        int[] dup = new int[intArray.length - 1];
        int l = 0;
        for(int i = 0; i < intArray.length;i++){
            boolean flag = false;
            for (int j =0; j <= l; j++){
                if(intArray[i] == dup[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                dup[l++] = intArray[i];
            }
        }
        for (int i = 0; i < l;i++){
            System.out.print(dup[i] + "\t");
        }
    }
}
