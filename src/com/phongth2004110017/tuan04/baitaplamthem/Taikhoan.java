package com.phongth2004110017.tuan04.baitaplamthem;

public class Taikhoan {
    String tenChuTaiKhoan;
    String soTaiKhoan;
    String soDuTaiKhoang;

    Taikhoan(){};

    Taikhoan(String n, String st, String sd){
        tenChuTaiKhoan = n;
        soTaiKhoan = st;
        soDuTaiKhoang = sd;
    
    }
    void inThongTin(){
        System.out.println("tên chủ tài khoản: " + tenChuTaiKhoan + "\n" + "số tài khoản: " + soTaiKhoan + "\n" +"số dư tài khoản: " + soDuTaiKhoang);
    }
}
