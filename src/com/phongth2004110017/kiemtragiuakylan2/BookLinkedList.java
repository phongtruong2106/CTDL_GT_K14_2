package com.phongth2004110017.kiemtragiuakylan2;

import java.util.Scanner;

import com.phongth2004110017.tuan07.Sach;

public class BookLinkedList {
    Book head;
    Book tail;
    Book previous;
    Book current;
    Scanner sc = new Scanner(System.in);

    public BookLinkedList() {
    }

    Book nhapThongTin() {
        System.out.println("nhập sách: ");
        sc.nextLine();
        String sach = sc.nextLine();
        System.out.println("nhâp mã: ");
        int ma = sc.nextInt();
        System.out.println("nhập số lượng: ");
        int soluong = sc.nextInt();
        System.out.println("nhập đơn giá: ");
        double dongia = sc.nextDouble();
        Book book = new Book(sach, ma, dongia, soluong);
        System.out.println("----------------------");
        return book;
    }

    void add() {
        Book b = nhapThongTin();
        if (head == null) {
            head = b;
            tail = b;
        } else {
            tail.next = b;
            tail = b;
        }
    }

    void inthongtin() {
        current = head;

        if (head == null) {
            System.out.println("danh sách rỗng");
            return;
        }
        System.out.println("danh sách book");
        while (current != null) {
            current.inThongTin();
            current = current.next;
        }
    }

    boolean tim(int Id) {
        current = head;
        boolean result = false;
        while (current != null) {
            if (current.equals(Id)) {
                result = true;
                return result;

            }
            current = current.next;
        }
        return result;
    }

    void Xoa(int Id) {
        if (true == tim(Id)) {
            if (current == head) {
                xoaHead();
            } else if (current == tail) {
                xoaTail();
            } else {
                xoaGiua();
            }
        } else {
            System.out.println("Không tìm thấy");
        }
    }

    void xoaHead() {
        head = head.next;
    }

    void xoaTail() {
        current = head;
        while (current != null) {
            if (current.next == tail) {
                tail = current;
                tail.next = null;
                return;
            }
            current = current.next;
        }
    }

    void xoaGiua() {
        timDangTruoc();
        current = current.next;
        previous.next = current;
    }

    void timDangTruoc() {
        previous = head;
        while (previous != null) {
            if (previous.next == current) {
                return;
            }
            previous = previous.next;
        }
    }

    void TimThongTin(int Id) {
        if (true == tim(Id)) {
            current.inThongTin();
        } else {
            System.out.println("không tìm thấy ");
        }
    }
}
