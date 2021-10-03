package com.truonghoaiphong2004110017.tuan01;

import java.util.Scanner;

public class lap1bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.println("điểm: ");
        double diem = scanner.nextDouble();

       //xuất màn hình
       System.out.printf("họ và tên: %s ,điểm: %f  ",hoTen, diem);
        
    }
}
