package com.phongth2004110017.tuan07;

import java.util.Scanner;

public class MylinklistTestDrive {
    static QuanLySach quanLySach = new QuanLySach();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    static void menu() {
        System.out.println("======================");
        System.out.println("1> thêm vào danh sách");
        System.out.println("2> in danh sách");
        System.out.println("3> tìm sách ");
        System.out.println("4> thêm sách");
        System.out.println("5> xoa sách");
        System.out.println("6> sửa thông tin");
        String choice = sc.nextLine();
        switch (choice) {
        case "1":
            themSach();
            break;
        case "2":
            inthongtin();
            break;
        case "3":
            timSach();
            break;
        case "4":
            themsach();
            break;
        case "5":
            xoasach();
            break;
        case "6":
            sua();
            break;
        default: {
            System.out.println("không hợp lệ! nhập lại: ");
            ENTERđetieptuc();
            menu();
            break;
        }

        }
    }

    static void ENTERđetieptuc() {
        System.out.println("nhấn ENTER để tiếp tục!");
        sc.nextLine();
    }

    static void themSach() {
        while (true) {
            quanLySach.add();
            System.out.println("thêm sách ((có)y/(không)n): ");
            if (sc.nextLine().equals("n")) {
                break;
            }
        }
        ENTERđetieptuc();
        menu();
    }

    static void inthongtin() {
        quanLySach.inthongtin();
        ENTERđetieptuc();
        menu();

    }

    static void timSach() {
        System.out.println("nhập thể loại cần tìm: ");
        String theloai = sc.nextLine();
        quanLySach.TimThongTin(theloai);
        ENTERđetieptuc();
        menu();
    }

    static void themsach() {
        System.out.println("nhập tên sách cần thêm:");
        String theloai = sc.nextLine();
        quanLySach.tìmSachVaThemHangTruoc(theloai);
        ENTERđetieptuc();
        menu();
    }

    static void xoasach() {
        System.out.println("nhập tên sách cần xóa: ");
        String theloai = sc.nextLine();
        quanLySach.xoa(theloai);
        ENTERđetieptuc();
        menu();
    }

    static void sua() {

    }
}
