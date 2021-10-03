package com.truonghoaiphong2004110017.tuan03.baitaplamthem;

public class Nhanvien {
    String tenNhanVien;
    String luong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;  

    public Nhanvien(){};

    public Nhanvien(String n, String l, String d, String b, String ns){
           tenNhanVien = n;
           luong = l;
           diaChi = d;
           boPhanLamViec = b;
           ngaySinh = ns;
    }
    void inThongTin(){
        System.out.println("tên nhân viên: " + tenNhanVien + "\n" + " lương: " + luong + " \n " + " địa chỉ: " + diaChi + " \n "+ " bộ phận làm việc: " + boPhanLamViec + " \n " + " ngày sinh: " + ngaySinh);
    }
}
