package com.phongth2004110017.kiemtragiuaky;

import java.util.Scanner;

public class Applelinkedlist {
    Apple head = null;
    Apple tail = null;
    Apple current = null;

    static Apple list = new Apple();
    Scanner sc = new Scanner(System.in);

    public void addHead() {
        Apple newNode = new Apple();
        newNode.nhapthongtin();
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addTail() {
        Apple newNode = new Apple();
        newNode.nhapthongtin();
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void inDanhSach() {
        Apple current = head;

        if (head == null) {
            System.out.println("Trống");
        } else {
            System.out.println("Các biến là:  ");
            while (current != null) {
                System.out.println(current.data);
                current.inthongtin();
                current = current.next;
            }
        }
    }

    public void removeTail() {
        Apple tam = head;
        if (head == null) {
            System.out.println("Trống");
            return;
        }
        while (tam != null) {
            if (tam.next == tail) {
                tail = tam;
                tail.next = null;
                return;
            }
            tam = tam.next;
        }
    }
}
