package com.phongth2004110017.msword;

import java.util.Scanner;

public class HangHoa {
    String loai;
    int mahang;
    String tenhanghoa;
    double gianhap;
    int soluongtonkho;
    String ngaynhapkho;
    public HangHoa next;

    Scanner sc = new Scanner(System.in);

    HangHoa(){
    }
    HangHoa(String l, int id, String name, double g, int s, String d){
          loai = l;
          mahang = id;
          tenhanghoa = name;
          gianhap = g;
          soluongtonkho = s;
          ngaynhapkho = d;
    }

    void nhapthongtin(){
        System.out.println("enter type: ");
        loai = sc.nextLine();
        System.out.println("enter ID: ");
        mahang = sc.nextInt();
        System.out.println("enter name : ");
        sc.nextLine();
        tenhanghoa = sc.nextLine();
        System.out.println("enter price: ");
        gianhap = sc.nextDouble();
        System.out.println("enter inventory quantity: ");
        soluongtonkho = sc.nextInt();
        System.out.println("date of entry into the warehouse: ");
        sc.nextLine();
        ngaynhapkho = sc.nextLine();

    }

    void inThongTin(){
        System.out.println("type: " + loai);
        System.out.println("ID: " + mahang);
        System.out.println("name: " + tenhanghoa);
        System.out.println("price: " + gianhap);
        System.out.println("invertory quantity: " + soluongtonkho);
        System.out.println("date of entry into the warehouse: " + ngaynhapkho);
    }

}
