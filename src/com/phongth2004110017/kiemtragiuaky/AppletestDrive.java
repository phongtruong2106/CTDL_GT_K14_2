package com.phongth2004110017.kiemtragiuaky;

import java.util.ArrayList;
import java.util.Scanner;

public class AppletestDrive {
    static ArrayList<Apple> list = new ArrayList<Apple>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    //phương thức menu
    static void menu(){
        System.out.println("==============MENU=============");
        do{
            System.out.println("1> thêm táo vào kho ");
            System.out.println("2> tìm táo theo màu ");
            System.out.println("3> in danh sách táo");
            System.out.println("4> thoát");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1: 
                     nhap();
                     break;
                case 2: 
                     tim();
                     break;
                case 3:
                    xuat();
                    break;
                case 4: 
                    System.exit(0);
                    break;
                default: 
                    System.out.println("nhập không đúng! nhập lại: "); 
            }
       
        }while(true);
    }
   //phương thức nhập
   static void nhap(){
       while(true){
           Apple apple;
           apple = new Apple();

           apple.nhapthongtin();
           sc.nextLine();
           list.add(apple);

           System.out.println("nhập thêm (y/n)? : ");
           if(sc.nextLine().equals("n"))
           break;
       }
       xuat();
       sc.nextLine();
       menu();
   }
   //phương thức hiển thị
   static void xuat(){
       for(Apple apple : list){
           apple.inthongtin();
       }
   }
   //phương thức tìm kiếm
   static void tim(){
       System.out.print("nhập màu apple cần tìm: ");
       for(Apple apple : list){
           if(sc.nextLine().equals(apple.color)){
               apple.inthongtin();
           }
       }
   }
  
}
