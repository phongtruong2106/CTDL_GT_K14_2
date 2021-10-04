package com.phongth2004110017.tuan01;

import java.util.Scanner;

public class lap2bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" a = ");
        double a = scanner.nextInt();
        System.out.print(" b = ");
        double b = scanner.nextInt();
        
        System.out.print("phương trình vừa nhập : " + a + "x" +  " + " + b + " = 0");

        //xét giá trị a và b
        if(a == 0){
            if(b == 0){
                System.out.println("phương trình vô số nghiệm");
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        } else {
            double x = -b/a;
            System.out.println(" phương trình có nghiệm x = " + x);
        }
    }
}
