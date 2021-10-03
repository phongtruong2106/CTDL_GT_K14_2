package com.truonghoaiphong2004110017.tuan04.baitaplamthem;

public class Book {
    String gia;
    String nhaXuatBan;
    String giaBan;
    int soLuong;
    String Loai;

    Book(){};
    Book(String g, String n, String gb, String l, int s) {

        gia = g;
        nhaXuatBan = n;
        giaBan = gb;
        soLuong = s;
        Loai = l;

    }

    void inThongtin(){
        System.out.println("giá: " + gia + "nhà xuất bản: " +  nhaXuatBan + " giá bán: " + giaBan + " loại: " + Loai + " số lượng: " +soLuong);
    }
}
