package com.phongth2004110017.kiemtragiuaky;

import java.util.Scanner;

public class AppleLinkedListTestDrive {
    public static void main(String[] args) {
         Applelinkedlist linkedList = new Applelinkedlist();
    Scanner sc = new Scanner(System.in);

    do {
        System.out.println("==========================");
        System.out.println("1) Add head  ");
        System.out.println("2) Add Tail  ");
        System.out.println("3) in danh sách ");
        System.out.println("4) kết thức ");

        System.out.print("chọn chức năng: ");
        int choice = sc.nextInt();
        switch (choice) {

        case 1:
            linkedList.addHead();
            break;
        case 2:
            linkedList.addTail();
            break;
        case 3:
            linkedList.inDanhSach();
            break;
        case 4:
            System.exit(0);
            break;
        }
    } while (true);
}
    }
   


