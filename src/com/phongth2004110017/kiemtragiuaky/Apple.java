package com.phongth2004110017.kiemtragiuaky;

import java.util.Scanner;

public class Apple {
    int ID;
    int khoiluong;
    String color;
    
    public Apple(){};
    
    Apple(int i, int k, String c){
        ID = i;
        khoiluong = k;
        color = c;
    }
    Scanner sc = new Scanner(System.in);
    public Apple next;
    public char[] data;

    public void nhapthongtin(){
      
        System.out.print("nhập mã ID: ");
        ID = sc.nextInt();
        System.out.print("nhập khối lượng: ");
        khoiluong = sc.nextInt();
        System.out.print("nhập màu: ");
        color = sc.nextLine();
        sc.nextLine();
    }

    void inthongtin(){
        System.out.println("mã ID: " + ID);
        System.out.println("khối lượng: " + khoiluong);
        System.out.println("màu : " + color);
    }
}
