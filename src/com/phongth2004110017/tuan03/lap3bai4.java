package com.phongth2004110017.tuan03;

import java.util.Scanner;

public class lap3bai4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập số lượng sinh viên muốn nhập: ");
        int n = sc.nextInt();
        String[] ten =new String[n];

        //nhập tên sinh viên
        for(int i = 0; i< ten.length; i++){
             System.out.println("nhập thông tin sinh viên thứ " + (i +1));
             System.out.print("họ và tên: ");
             ten[i] = sc.nextLine();
             sc.nextLine();
            }
       //nhập điểm
       double diem[] = new double[n];
       for(int i = 0 ; i< diem.length; i++){
           System.out.println("nhập thông tin sinh viên thứ " + (i+1));
           System.out.println("nhập điểm: ");
           diem[i] = sc.nextDouble();
       }
       //xét học lực
       for(int i =0; i<n ; i++){
        if(diem[i] >= 5 && diem[i] < 6.5){
            System.out.printf("\nSinh viên thứ %d: ", i+1);
            System.out.printf("%s | %f => học lực trung bình", ten[i], diem[i]);
        } else
        if(diem[i] >= 7.5 && diem[i] <9){
            System.out.printf("\nSinh viên thứ %d: ", i+1);
            System.out.printf("%s | %f => học lực khá", ten[i], diem[i]);
        } else
        if(diem[i] >= 9){
            System.out.printf("\nSinh viên thứ %d: ", i+1);
            System.out.printf("%s | %f => học lực giỏi", ten[i], diem[i]);
        } else {
            System.out.printf("\nSinh viên thứ %d: ", i+1);
            System.out.printf("%s | %f => học lực yếu", ten[i], diem[i]);
        }
        
        }
           sc.close(); 
        }
}
