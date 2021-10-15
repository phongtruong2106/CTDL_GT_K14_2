package com.phongth2004110017.tuan04.lap4bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HoTenTestDrive {
    static Scanner sc = new Scanner(System.in);
    //tạo Arraylist
    static ArrayList<String> list = new ArrayList<String>();
    public static void main(String[] args) {
        menu();
    }
    //phương thức menu
    static void menu(){
        System.out.println("=============MENU============");
        do{ 
            System.out.println("1> nhập danh sách họ tên");
            System.out.println("2> xuất danh sách");
            System.out.println("3> xuất danh sách ngẫu nhiên");
            System.out.println("4> sắp xếp giảm dần");
            System.out.println("5> tìm và xóa họ tên");
            System.out.println("6> thoát");
            System.out.println("hãy chọn : ");
            int choice = sc.nextInt();
            sc.nextLine();
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
                      xuatngaunhien();
                      break;
                case 5:
                      timxoa();
                      break;
                case 6: 
                      System.exit(0);
                      break;
            default:
                  System.out.println("nhập không đúng! mời nhập lại: ");
            }

        }while(true);
    }
    //phương thức nhập
    static void nhap(){
        while(true){
            System.out.println("nhập họ và tên: ");
            String name = sc.nextLine();

            list.add(name);
            System.out.println("nhập thêm (y/n)? : ");
            if(sc.nextLine().equals("n"))
            break;

        }
    }
    //phương thức xuất
    static void xuat(){
        for(String hoten : list){
                System.out.println("họ tên: " + hoten);
        }
    }
    //phương thức săp xếp
    static void sapxep(){

        Collections.shuffle(list);
        xuat();
    }
    //phương thức xuất ngẫu nhiên
    static void xuatngaunhien(){
           //trộn danh sách và xuất ngẫu nhiên
          //trộn ngẫu nhiên
          Collections.shuffle(list);

          //xuất ngẫu nhiên

          xuat();
    }
    //phương thức tìm và xóa
    static void timxoa(){
        System.out.println("nhập tên cần tìm và xóa: ");
        String name = sc.nextLine();
        int i = 0;
        //dùng vòng lạp for each
        for(String hoten : list){
            if(hoten.equals(name)){
                list.remove(hoten);
                break;

            }
            i++;
        }
        xuat();
            sc.nextLine();
            sc.nextLine();
            menu();
    }
}
