package com.phongth2004110017.msword;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        KhoLinkedList qlkho = new KhoLinkedList();
        Scanner  sc = new Scanner(System.in);
        int key;
        do{
            System.out.println("_________________MENU_______________");
            System.out.println("1> enter information");
            System.out.println("2> print information");
            System.out.println("3> delete goods");
            System.out.println("4> repair information goods");
            System.out.println("5> search (type)");
            System.out.println("6> search (price)");
            System.out.println("7> search (date)");
            System.out.println("8> sort by entry price(td)");
            System.out.println("9> sort by date (gd)");
            System.out.println("10> statistical (total number of products)");
            System.out.println("11> statistical (total value of inventory)");
            System.out.println("12> statistical (quantity of each type of goods)");
            System.out.println("13> end(exit)");
            System.out.println(">>> function selection: ");

            key = sc.nextInt();
            switch(key){
                case 1: 
                System.out.println("1> enter information");
                qlkho.addFirst();
                break;
                case 2:
                System.out.println("2> print information");
                qlkho.in();
                
                break;
                case 3:
                System.out.println("3> delete goods");
                qlkho.removeFist();
                break;
                case 4:
                System.out.println("4> repair information goods");
                qlkho.sua();
                break;
                case 5:
                System.out.println("5> search (type)");
                String tim = sc.nextLine();
                if(qlkho.timloai(tim) != null){
                    System.out.println("product is in stock! ");
                } else {
                    System.out.println("not found");
                }
                break;
                case 6:
                System.out.println("6> search (price)");
                double timg = sc.nextDouble();
                if(qlkho.timgia(timg) != null){
                    System.out.println("product is in stock! ");
                }else {
                    System.out.println("not found");
                }
                break;
                case 7:
                System.out.println("7> search (date)");
                String timn = sc.nextLine();
                if(qlkho.timngaynhap(timn) != null){
                    System.out.println("product is in stock! ");
                }else {
                    System.out.println("not found");
                }
                break;
                case 8:
                System.out.println("8> sort by entry price(td)");
                qlkho.sapxeptd();
                case 9:
                System.out.println("9> sort by date (gd)");
                qlkho.sapxepgd();
                case 10:
                System.out.println("10> statistical (total number of products)");
                qlkho.thongketongsoluong();
                case 11:
                System.out.println("11> statistical (total value of inventory)");
                qlkho.thongketonggiatri();
                case 12:
                System.out.println("12> statistical (quantity of each type of goods)");
                qlkho.soluongtungloai();
                case 13:
                System.out.println("13> end(exit)");
                System.exit(0);
                break;
                    
            }
            System.out.println("- back to menu(1:yes,0:no): ");
            key = sc.nextInt();
            
            
        } while(key != 0);
    }
}
