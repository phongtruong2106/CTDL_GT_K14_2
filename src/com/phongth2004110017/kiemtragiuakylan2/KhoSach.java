package com.phongth2004110017.kiemtragiuakylan2;

import java.util.ArrayList;
import java.util.Scanner;

public class KhoSach {
  static ArrayList<Book> inventory = new ArrayList<>();
   static Scanner sc = new Scanner(System.in);
   
   public void nhapVaoDanhSach(){
       while(true){
           Book book = new Book();
           book.nhapThongtin();
           sc.nextLine();
           inventory.add(book);

           System.out.println("nhập thêm sách(y/n): ");
           if(sc.nextLine().equals("n"))
           break;
       }
   }

   public void xuatDanhSach(){
       for(Book book : inventory){
           book.inThongTin();
       }
   }
   //tìm danh sách theo mã
   public void TimTheoDONGIA(){
       System.out.println("nhập mã cần tìm: ");
       for(Book book: inventory){
           if(sc.nextLine().equals(book.dongia))
           book.inThongTin();
       }
   }

}
