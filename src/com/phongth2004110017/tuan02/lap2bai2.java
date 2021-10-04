package com.phongth2004110017.tuan02;

import java.util.Scanner;

public class lap2bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        System.out.println("phương trình vừa nhập: " + a + "x2" +" + " + b + "x" + " + " + c + " = 0" );

        //xét a 
        String ketqua = "";
        double x1 , x2 , delta ;
        if(a == 0){
            double x = -c/b;
            System.out.println("phương trình bật nhất x = " + x);
        } else {
         //delta
         delta  = Math.pow(b, 2) - 4 * a * c;
         System.out.println("delta = " + delta);
        
         if (delta < 0){
            ketqua = "phuong trinh vo nghiem";
        } else if (delta == 0){
            x1 = x2 = -b/ (2*a);
            System.out.println("phương trình có nghiệm kép:  x1 = x2 = " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / ( 2 * a);
            x2 = (-b - Math.sqrt(delta)) / ( 2 * a);
            ketqua = "phương trình có 2 nghiệm x1 = " + x1 + " x2 = " + x2;
        }
         System.out.println(ketqua);
        }
       
    }
}
