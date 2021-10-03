package com.truonghoaiphong2004110017.tuan03.baitaplamthem;

public class Taikhoan {
    String tenChuTaiKhoan;
    String soTaiKhoan;
    String soDuTaiKhoang;

    public Taikhoan(){};

    public Taikhoan(String n, String st, String sd){
        tenChuTaiKhoan = n;
        soTaiKhoan = st;
        soDuTaiKhoang = sd;
    
    }
    void inThongTin(){
        System.out.println("tên chủ tài khoản: " + tenChuTaiKhoan + "\n" + "số tài khoản: " + soTaiKhoan + "\n" +"số dư tài khoản: " + soDuTaiKhoang);
    }
}
