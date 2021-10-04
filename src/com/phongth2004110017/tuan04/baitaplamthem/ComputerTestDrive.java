package com.phongth2004110017.tuan04.baitaplamthem;

import java.util.Scanner;

public class ComputerTestDrive {
    public static void main(String[] args) {
        //tạo danh sách 
        Computer[] ComputerList = new Computer[3];
 
        //nhập danh sách từ bàn phím
 
        Scanner varInput = new Scanner(System.in);
 
        System.out.println("nhập danh sách Computer: ");
 
        for(int i = 0; i < ComputerList.length; i++){
            System.out.println("nhập thông tin Computer thứ " + (i + 1));
         System.out.print("nhà sản xuất: ");
         String nhaSanXuat = varInput.nextLine();
         System.out.print("năm sản xuất: ");
         String namSanXuat = varInput.nextLine();
         System.out.print("hệ điều hành: ");
         String heDieuHanh =varInput.nextLine();
         System.out.print("CPU : ");
         String CPU = varInput.nextLine();
         System.out.print("giá: ");
         String gia = varInput.nextLine();
         System.out.print("năm bảo hành: ");
         String namBaoHanh = varInput.nextLine();
 
         varInput.nextLine();
         ComputerList[i] = new Computer(nhaSanXuat, namSanXuat, heDieuHanh, CPU, gia, namBaoHanh);
          
        }
        //in thông tin danh sách
        for(Computer computer : ComputerList){
            computer.inThongTin();
        }
    }
}
