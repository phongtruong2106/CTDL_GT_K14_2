package com.phongth2004110017.tuan04.baitaplamthem;

import java.util.Scanner;

public class TaikhoanTestDrive {
    public static void main(String[] args) {
        NhanVien[] nhanvienList = new NhanVien[3];

        Scanner varInput = new Scanner(System.in);

        System.out.println("nhập danh sách Nhân viên");
        for(int i = 0; i < nhanvienList.length; i++){
            System.out.println("nhập thông tin Nhân viên thứ " + (i+ 1));
            System.out.print("tên nhân viên");
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
        System.out.println("=========in danh sách==========");
        for(NhanVien nhanvien : nhanvienList){
            nhanvien.inThongTin();
        }
    }
}
