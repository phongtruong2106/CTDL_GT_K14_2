package com.phongth2004110017.tuan03;

import java.util.Arrays;
import java.util.Scanner;

public class lap3bai3 {
    public static void main(String[] args) {
        int mang[] = new int[5]; //cấp phát cái mảng có tham số

        //nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        //dùng vòng lặp for
        for(int i = 0; i < mang.length; i++){
            System.out.println("nhập phần tử thứ  " + (i + 1));
            mang[i] = scanner.nextInt();
        }
        System.out.println("phần tử mảng: " + Arrays.toString(mang));
        
        //sắp xếp mảng
        Arrays.sort(mang);
      
        System.out.println("phần tử sau khi sắp xếp: " + Arrays.toString(mang));
        //phần tử nhỏ nhất
        int min = mang[0];
        for(int i = 1; i < mang.length; i++){
            min = Math.min(min, mang[i]); 
            System.out.println("phần tử nhỏ nhất: " + min);
        }

        //tính trung bình , tổng
        int sum = 0, count = 0;
        for(int i = 0; i < mang.length; i++){
            if(mang[i] % 3 == 0){
                sum += mang[i];
                count++;
            }
        }
        float avg = (float) sum /count;
        System.out.println("giá trị trung bình:" + avg);
    }
}
