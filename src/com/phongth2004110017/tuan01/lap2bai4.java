package com.phongth2004110017.tuan01;

import java.util.Scanner;

public class lap2bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chon;
        // vòng lặp for
        for(;;){
            System.out.println(">>1 . giải phương trình bật nhất ");
            System.out.println(">>2 . giải phương trình bật hai");
            System.out.println(">>3 . tính tiền điện");
            System.out.println(">>4 . thoát");

            do{
                System.out.print("bấm số để chọn(1.2.3.4) : ");
                chon = scanner.nextInt(); 
            } while ((chon < 1) || (chon > 4));

            switch (chon) {
                case 1:
                System.out.println("bạn chọn chức năng (giải phương trình bật nhất)");
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
                break;
                case 2: 
                System.out.println("bạn chọn chức năng (giải phương trình bật hai)");
                break;
                case 3: 
                System.out.println("bạn chọn chức năng (tính tiền điện)");
                System.out.println("Số điện : "); 
                 double soDien = scanner.nextDouble();
                if( soDien <= 50){  
                    System.out.println(" thanh toán : " +(soDien * 1000));
                } else {
                    System.out.println("số tiền phải trả : " + (50 * 1000 + (soDien - 50) * 1200));
                }

                break;
                case 4:
                System.out.println("bạn chọn chức năng (thoát)");
                System.exit(0);
                break;
            }
        }
    }
}
