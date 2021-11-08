package com.phongth2004110017.tuan07;

import java.util.Scanner;

public class QuanLySach {
    public QuanLySach(){}
    Sach head;
    Sach tail;
    Sach current;
    Sach previous;
    Scanner sc = new Scanner(System.in);
    Sach nhapthongtin() { 
        System.out.println("nhập thể loại: ");
        sc.nextLine();
        String theloai = sc.nextLine();
        System.out.println("nhập số lượng: ");
        int soluong = sc.nextInt();
        System.out.println("nhập giá: ");
        int gia = sc.nextInt();
        Sach sach = new Sach(soluong, theloai, gia);
        return sach;
    }

    void add() {
        Sach sach = nhapthongtin();
        if (head == null) {
            head = sach;
            tail = sach;
        } else {
            tail.next = sach;
            tail = sach;
        }
    }

    void inthongtin() {
        current = head;
        if(head == null) {
            System.out.println("danh sách rỗng");
            return;
        }
        System.out.println("các book trong danh sách");
        while (current != null) {
            current.inThongTin();
            current = current.next; // liên kết phần tử tiếp theo
        }
    }

    boolean timkiem(String theloai) {
        current = head;
        boolean result = false;
        while (current != null) {
            if (current.theloai.equals(theloai)) {
                result = true;
                return result;
            }
            current = current.next;
        }
        return result;
    }

    void TimThongTin(String theloai) {
        if (true == timkiem(theloai)) {
            current.inThongTin();
        } else {
            System.out.println("không tìm thấy ");
        }
    }

    void timHangTruoc() {
        previous = head;
        while (previous != null) {
            if (previous.next == current) {
                return;
            }
            previous = previous.next;
        }
    }

    void themHangTruoc() {
        timHangTruoc();
        Sach sach = nhapthongtin();
        previous.next = sach;
        previous.next.next = current;
    }

    void addHead() {
        Sach sach = nhapthongtin();
        sach.next = head;
        head = sach;
    }

    void tìmSachVaThemHangTruoc(String theloai) {
        if (true == timkiem(theloai)) {
            if (current == head) {
                addHead();
            } else {
                themHangTruoc();
            }
        } else {
            System.out.println("không tìm thấy");
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
        timHangTruoc();
        current = current.next;
        previous.next = current;
    }

    void xoa(String theloai) {
        if (true == timkiem(theloai)) {
            if (current == head) {
                xoaHead();
            } else if (current == tail) {
                xoaTail();
            }

            else {
                xoaGiua();
            }
        } else {
            System.out.println("không tìm thấy");
        }

    }

    void sua(String theloai) {
        if (true == timkiem(theloai)) {

        } else {
            System.out.println("không tìm thấy");
        }
    }

}
