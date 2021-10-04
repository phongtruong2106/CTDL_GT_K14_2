package com.phongth2004110017.tuan04.baitaplamthem;

import java.util.Scanner;

public class NhanvienTestDrive {
    public static void main(String[] args) {
        //tạo danh sách Nhân viên
        NhanVien[] nhanvienList = new NhanVien[2];

        //nhập danh sách NHân viên từ bàn phím
        Scanner varInput = new Scanner(System.in);

        System.out.println("nhập danh sách nhân viên");

        for(int i = 0; i < nhanvienList.length; i++){
            System.out.println("nhập thông ton nhân viên thứ " + (i + 1));
            System.out.print("tên nhân viên: ");
            String tenNhanVien = varInput.nextLine();
            System.out.print("lương: ");
            String luong = varInput.nextLine();
            System.out.print("địa chỉ: ");
            String diaChi = varInput.nextLine();
            System.out.print("bộ phận làm việc: ");
            String boPhanLamViec = varInput.nextLine();
            System.out.print("ngày sinh: ");
            String ngaySinh = varInput.nextLine();
            
            varInput.nextLine();
            nhanvienList[i] = new NhanVien(tenNhanVien, luong, diaChi, boPhanLamViec, ngaySinh);
        }

        //in danh sách nhân viên
        System.out.println("==========in thông nhân viên ========");
        for(NhanVien nhanVien : nhanvienList){
            nhanVien.inThongTin();
        }
    }
}
