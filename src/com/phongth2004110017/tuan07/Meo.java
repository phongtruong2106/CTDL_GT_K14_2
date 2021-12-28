package com.phongth2004110017.tuan07;

import java.util.Scanner;

public class Meo {
    String ten;
    int tuoi;
    String mausac;
    String giong;
    Meo next;

    static Scanner sc = new Scanner(System.in);
    public Meo(){}

    public Meo(String name,int age,String color,String sex){
        ten = name;
        tuoi = age;
        mausac = color;
        giong = sex;
    }
    public void Meo(String name,int age,String color,String sex){
        ten = name;
        tuoi = age;
        mausac = color;
        giong = sex;
    }

    public void inThongTin(){
        System.out.println("-------------------");
        System.out.println("Tên: "+ten);
        System.out.println("Tuổi: "+tuoi);
        System.out.println("Màu Sắc: "+mausac);
        System.out.println("Giới Tính: "+giong);
    }
    public void nhapthongtin(){
        System.out.println("nhập tên: ");
        ten = sc.nextLine();
        System.out.println("nhập tuổi: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("nhập màu: ");
        mausac = sc.nextLine();
        System.out.println("nhập giống: ");
        giong = sc.nextLine();
    }
}
