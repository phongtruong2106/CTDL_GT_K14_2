package com.phongth2004110017.tuan03.baitaplamthem;

public class Book {
    String gia;
    String nhaXuatBan;
    String giaBan;
    int soLuong;
    String Loai;

    public Book(){};

    public Book(String g, String n, String gb, String l, int s) {

        gia = g;
        nhaXuatBan = n;
        giaBan = gb;
        Loai = l;
        soLuong = s;

    }
    void inThongtin(){
        System.out.println("giá: " + gia + " "+ "nhà xuất bản: " +  nhaXuatBan + " " + " giá bán: " + giaBan +" "+ " loại: " + Loai + " " + " số lượng: " +soLuong);
    }
}
