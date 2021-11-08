package com.phongth2004110017.kiemtragiuakylan2;

import java.util.Scanner;

public class BookLInkedListTestDrive {
    static BookLinkedList bookLinkedList = new BookLinkedList();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    static void menu() {
        System.out.println("======================");
        System.out.println("1> thêm vào danh sách");
        System.out.println("2> in danh sách");
        System.out.println("3> xoa sách");
        System.out.println("4> tìm sách");
        String choice = sc.nextLine();
        switch (choice) {
        case "1":
            themSach();
            break;
        case "2":
            inthongtin();
            break;
        case "3":
            xoasach();
            break;
            case "4":
            timsach();
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
            bookLinkedList.add();
            System.out.println("thêm sách ((có)y/(không)n): ");
            if (sc.nextLine().equals("n")) {
                break;
            }
        }
        ENTERđetieptuc();
        menu();
    }

    static void inthongtin() {
        bookLinkedList.inthongtin();
        ENTERđetieptuc();
        menu();

    }

    static void xoasach() {
        System.out.println("nhập tên sách cần xóa: ");
        int Id = sc.nextInt();
        bookLinkedList.Xoa(Id);
        ENTERđetieptuc();
        menu();
    }
    static void timsach(){
        System.out.println("nhập thể loại cần tìm: ");
        int Id = sc.nextInt();
        bookLinkedList.TimThongTin(Id);
        ENTERđetieptuc();
        menu();
    }
}
