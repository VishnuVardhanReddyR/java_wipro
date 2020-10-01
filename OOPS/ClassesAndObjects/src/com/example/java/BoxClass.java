package com.example.java;

public class BoxClass {
    int width,height,depth;

    public BoxClass(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public int volume(int width, int height, int depth){
        int vol;
        vol = width * height * depth;
        return vol;
    }
    public static void main(String[] args) {
        BoxClass box = new BoxClass(5,10,15);
        System.out.println("volume of the box is " + box.volume(box.width,box.height, box.depth));
    }
}
