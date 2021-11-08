package com.phongth2004110017.kiemtragiuakylan2;

import java.util.Scanner;

public class BookTestDriver {
    public static void main(String[] args) {
        KhoSach qlbook = new KhoSach();
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("================MENU=============");

            System.out.println("1> nhập danh sách Book");
            System.out.println("2> Xuất danh sách Book");
            System.out.println("3> tìm theo mau");
            System.out.println("4> thoát");
            System.out.println("-----------------------");

            System.out.println("chọn chức năng: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    qlbook.nhapVaoDanhSach();
                    break;
                case 2:
                    qlbook.xuatDanhSach();
                    break;
                case 3: 
                    qlbook.TimTheoDONGIA();
                case 4:
                     System.out.println("kết thúc!");
                     System.exit(0);
                     break;
            }
            System.out.println("quay về menu (y/n): ");
            sc.nextLine();
        }while(sc.nextLine().equals("y"));
    }
}
