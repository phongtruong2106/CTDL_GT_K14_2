package com.phongth2004110017.kiemtragiuakylan2;

import java.util.Scanner;

public class Node {
    int ma;
    double soluong;
    String sach;
    int donGia;
    Book next;
    Scanner sc = new Scanner(System.in);

    Node(){}

    Node(int m, double sl, String s, int d){
        ma = m;
        soluong = sl;
        sach = s;
        donGia = d;

    }
    public void inThongTin(){
        System.out.println("-------------------");
        System.out.println("Tên: "+sach);
        System.out.println("Tuổi: "+donGia);
        System.out.println("Màu Sắc: "+ma);
        System.out.println("Giới Tính: "+soluong);
    }
}

