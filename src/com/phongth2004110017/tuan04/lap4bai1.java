package com.phongth2004110017.tuan04;

import java.util.ArrayList;
import java.util.Scanner;

public class lap4bai1 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String qd; //quy định nhập
       boolean yn = true;
       while(yn){
           System.out.println("nhập số: ");
           Double x = Double.parseDouble(sc.nextLine());//nhập số từ bàn phím
           //đưa số vừa nhập vào list
           list.add(x);
           //điều khiển vòng lặp
           qd = sc.nextLine();
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
           double tong = 0;
           for (Double n : list){
               System.out.println(n);
               tong += n;
           }
           System.out.println("tổng là : " + tong);
           sc.close();
        }
}
}
