package com.phongth2004110017.kiemtragiuakylan2;

import java.util.Scanner;

import com.phongth2004110017.tuan07.Sach;

public class BookLinkedList {
    Book head;
    Book tail;
    Book previous;
    Book current;
    Scanner sc = new Scanner(System.in);
    public BookLinkedList(){}

   Book nhapThongTin(){
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
  void add(){
      Book b = nhapThongTin();
      if(head==null){
          head= b;
          tail = b;
    }
    else{
        tail.next = b;
        tail = b;
    }
  }
    public void inthongtin(){
        current  = head;

        if(head == null){
            System.out.println("danh sách rỗng");
            return;
        }else{
            while(current != null){
                System.out.println("mã : "+ current.ma);
                System.out.println("đơn giá " + current.donGia);
                System.out.println("số lương:" +current.soluong);
                System.out.println("=====================");
                current =current.next;
            }
        }
    }
    public void themdau(){
        nhapThongTin();

    }
}
