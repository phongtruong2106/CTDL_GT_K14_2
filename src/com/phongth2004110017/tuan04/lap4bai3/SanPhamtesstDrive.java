package com.phongth2004110017.tuan04.lap4bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SanPhamtesstDrive {
    static Scanner sc = new Scanner(System.in);
    //tạo Arraylist 
    static ArrayList<SanPham> sanpham = new ArrayList<>();
    static public void main(String[] args) {
          menu();
          
    }
    //phương thức menu
     static  void menu() {
        System.out.println("===============MENU=============");
    do{
        System.out.println("1) nhập danh sách sản phẩm: ");
        System.out.println("2) xuất danh sách sản phẩm: ");
        System.out.println("3) sắp xếp danh sách sản phẩm: ");
        System.out.println("4) tìm và xóa sản phẩm: ");
        System.out.println("5) xuất giá trung bình của sản phẩm: ");
        System.out.println("6) thoát ");
        System.out.println("hãy chọn : ");
        int choice = sc.nextInt();
        switch(choice){
            case 1: 
                 nhap();
                 break;
            case 2:
                 xuat();
                 break;
            case 3: 
                 sapxep();
                 break;
            case 4:
                 timvaxoa();
                 break;
            case 5:
                 giaTB();
                 break;
            case 6:
                 System.exit(0);
                 break;
            default: 
            System.out.println("nhập không đúng mời nhập lại: ");
        }
    }while(true);
    }
         //phương thức nhập
     static void nhap(){
        while(true){
            SanPham sanPham = new SanPham();
            System.out.print("Nhập tên sản phẩm: ");
            sanPham.ten = sc.nextLine();
            System.out.print("Nhập giá sản phẩm: ");
            sanPham.gia = sc.nextDouble();
            System.out.print("nhập giá giảm: ");
            sanPham.giamgia = sc.nextDouble();
            System.out.print("nhập thuế: ");
            sanPham.thue = sc.nextDouble();

            sanpham.add(sanPham);
            sc.nextLine();
            System.out.print("Nhập thêm (y/n)?: ");
            if(sc.nextLine().equals("n"))
                break;
            
          }      
          xuat();
          sc.nextLine();
          menu();  
    }
    //phương thức hiển thị
     static void xuat(){
         for(SanPham sanPham : sanpham){
             sanPham.inthongtin();
             System.out.println();
         }
    }
    //phương thức sắp xếp
    static  void sapxep(){
     Collections.sort(sanpham, new Comparator<SanPham>(){

          @Override
          public int compare(SanPham o1, SanPham o2) {
               // TODO Auto-generated method stub
               return o1.giamgia.compareTo(o2.giamgia);
          }
          
     });
     xuat();
     sc.nextLine();
     sc.nextLine();
     menu();
    }
    //phương thức tìm và xóa
    static void timvaxoa(){
        System.out.println("nhập tên sản phẩm cần tìm xóa: ");
        sc.nextLine();
        String nhap = sc.nextLine();
        int i = 0;
        //dùng vòng lặp for each
        for(SanPham sanPham : sanpham){
             if(sanPham.ten.equals(nhap)){
                  sanpham.remove(i);
                  break;
             }
             i++;

        }
        xuat();
        sc.nextLine();
        sc.nextLine();
        menu();
    }
    //phương thức giá trung bình
    static void giaTB(){
         int i = 0;
         double t = 0;
         //vòng lặp for each
         for(SanPham sanPham : sanpham){
              t = t + sanPham.gia - sanPham.giamgia - sanPham.thue;
              i++;
         }
         System.out.println("giá trung bình: " + t/i);
         sc.nextLine();
         sc.nextLine();
         menu();
    }
}
