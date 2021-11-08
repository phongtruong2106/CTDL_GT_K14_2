package com.phongth2004110017.tuan09;

import java.util.Scanner;

public class Apple {
    String ID;
    int Khoiluong;
    String color;

    static Scanner sc = new Scanner(System.in);

    Apple() {
    }

    Apple(String i, int k, String c){
        ID = i;
        Khoiluong = k;
        color = c;
    }
    public void inThongTinApple() {
        System.out.println("===================");
        System.out.println("Mã id: " + ID);
        System.err.println("Khối Lượng: " + Khoiluong);
        System.out.println("Màu sắc: " + color);
    }
    public void nhapThongTinApple() {
        System.out.println("Mã id: ");
        ID = sc.nextLine();
        System.err.println("Khối Lượng: ");
        Khoiluong = sc.nextInt();
        System.out.println("Màu sắc: ");
        color = sc.nextLine();
    }
}
