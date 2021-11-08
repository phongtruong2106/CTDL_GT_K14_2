package com.phongth2004110017.kiemtragiuakylan2;

import java.util.Scanner;

public class Book {
    String book;
    int Id;
    double dongia;
    int soluong;
    
    Scanner nhap = new Scanner(System.in);
    //hàm tạo
    Book(){}

    Book(String sach, int ma, double g, int s){
        book = sach;
        Id = ma;
        dongia = g;
        soluong = s;
    }

    void nhapThongtin(){
        System.out.println("nhập sách: ");
        nhap.nextLine();
        book = nhap.nextLine();
        System.out.println("nhập mã: ");
        Id = nhap.nextInt();
        System.out.println("nhập đơn giá: ");
        dongia = nhap.nextDouble();
        System.out.println("nhập số lượng: ");
        soluong = nhap.nextInt();
        System.out.println("=======================");
    }
    void inThongTin(){
        System.out.println("sách: "+book);
        System.out.println("mã: "+Id);
        System.out.println("đơn giá: "+dongia);
        System.out.println("số lượng :"+soluong);
        System.out.println("=======================");
    }
}
