package Apple;

import java.util.Scanner;

public class AppleLinkedList {
    Node head = null;
    Node tail = null;
    Node current = null;

    public AppleLinkedList(){}

    boolean isEmpty(){
        boolean emtpy = true;
        if(head == null){
            return true;
        }else{
        emtpy = false;}
        return emtpy;
    }
    public void addHead(Apple apple) {
        if(isEmpty()){
            head = apple;
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
