package com.phongth2004110017.tuan03;

import java.util.Arrays;
import java.util.Scanner;

public class lap3bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số phần tử muốn nhập: ");   
        int n = sc.nextInt();
        int mang[] = new int[n];

        //dùng vòng lặp for
        for(int i = 0; i < mang.length; i++){
            System.out.println("nhập phần tử mảng thứ : " + (i+1));
            mang[i] = sc.nextInt();
        }
        //săp xếp
        Arrays.sort(mang);
        System.out.println("phần tử sau khi sắp xếp" + Arrays.toString(mang)); //Arrays.tostring xuất phần tử
        //xuất phần tử nhỏ nhất 
        int Min = mang[0];
        //dùng vòng lặp for each
        for(int x : mang){
                Math.min(Min, x);
        }
        System.out.println("phần tử nhỏ nhất: " + Min);
        //tính và xuất
        int sum = 0, count =0;
        for(int i = 0; i < mang.length ; i++){
            if(mang[i] % 3 == 0){
                sum += mang[i];
                count++;
            }
        float t = (float) sum/count;
        System.out.println("giá trung bình: " + t);
        }
    }
}
