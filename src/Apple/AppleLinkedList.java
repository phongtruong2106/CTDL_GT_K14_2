package Apple;

import java.util.Scanner;

public class AppleLinkedList {
    Node head = null;
    Node tail = null;
    Node current = null;

    static Node list = new Node();
    Scanner sc = new Scanner(System.in);

    public void addHead() {
        Node newNode = new Node();
        newNode.nhapThongTin();
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addTail() {
        Node newNode = new Node();
        newNode.nhapThongTin();
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void inDanhSach() {
        Node current = head;

        if (head == null) {
            System.out.println("Trống");
        } else {
            System.out.println("Các biến là:  ");
            while (current != null) {
                System.out.println(current.data);
                current.inThongTinApple();
                current = current.next;
            }
        }
    }

    public void removeTail() {
        Node tam = head;
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
