package com.phongth2004110017.tuan09;

import java.util.Scanner;

public class Node {
    String data;
    Node next;
    String ID;
    String color;
    String khoiluong;
    Scanner sc = new Scanner(System.in);

    public Node() {
    }

    public Node(String d, String i, String k, String c) {
        data = d;
        ID = i;
        khoiluong = k;
        color = c;
        next = null;
    }

    public Node(String d, String i, String k, String c ,Node n) {
        data = d;
        next = n;
        ID = i;
        khoiluong = k;
        color = c;
        next = n;
    }

    public void nhapThongTin() {
        System.out.println("nhập Node: ");
        data = sc.nextLine();
        System.out.println("nhập khối lượng: ");
        data = sc.nextLine();
        System.out.println("nhập màu: ");
        data = sc.nextLine();
    }

    public void inThongTinApple() {
        System.out.println("===================");
        System.out.println("Mã id: " + ID);
        System.err.println("Khối Lượng: " + khoiluong);
        System.out.println("Màu sắc: " + color);
        System.out.println();
    }
}
