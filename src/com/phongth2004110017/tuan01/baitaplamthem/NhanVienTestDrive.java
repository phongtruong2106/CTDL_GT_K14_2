package com.phongth2004110017.tuan01.baitaplamthem;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        Nhanvien nhanvien;
        nhanvien = new Nhanvien();
        nhanvien.tenNhanVien = "Trương Hoài Phong";
        nhanvien.ngaySinh = "21/6/2002";
        nhanvien.diaChi = "Tiền Giang";
        nhanvien.boPhanLamViec = "developer";
        nhanvien.luong = " 7.000.000vnđ";
        
        nhanvien.inThongTin();
   }
}
