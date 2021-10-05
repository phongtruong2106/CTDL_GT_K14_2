package com.phongth2004110017.tuan04;

import java.util.ArrayList;
import java.util.Scanner;



public class sothuc {
    private ArrayList<Double> list = new ArrayList<>();// khai báo 1 ArrayList để lưu trữ só thực 
    //định nghĩa phương thức nhập
    public void nhap(){

        //nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        String qd; //quy định nhập
        boolean yn = true;
        while(yn){
            System.out.println("nhập số: ");
            Double x = Double.parseDouble(scanner.nextLine());//nhập số từ bàn phím
            //đưa số vừa nhập vào list
            list.add(x);
            //điều khiển vòng lặp
            qd = scanner.nextLine();
            switch(qd){
                case "y":
                    yn = true;
                    break;
                case "n":
                    yn = false;
                    break;
                default:
                    System.err.println("hãy nhập lại số");
            }
        }
    }
    //định nghĩa hàm xuất
    public void xuat(){
        System.out.println("danh dách các phần tử vừa nhập");
        double tong = 0;
       for(Double x : list)//lấy ra từng phần tử trong list
       {
               tong = tong + x;
              System.out.println(x);
       }
       System.out.println("tổng là: " + tong);
    }
}
