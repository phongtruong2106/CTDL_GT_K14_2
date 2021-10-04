package com.phongth2004110017.tuan03.baitaplamthem;

public class Computer {
    String nhaSanXuat;
    String namSanXuat;
    String heDieuHanh;
    String CPU;
    String gia;
    String namBaoHanh;

    public Computer(){};

    public Computer(String n, String d, String h, String c, String g, String nd){
        nhaSanXuat = n;
        namBaoHanh = d;
        heDieuHanh = h;
        CPU = c;
        gia = g;
        namBaoHanh = nd;
    }
    void inThongTin(){
        System.out.println("nhà sản xuất: " + nhaSanXuat + "\n" + "năm bảo hành: " + namBaoHanh + "\n" + "hệ điều hành: " + heDieuHanh + "\n" + "CPU: " + CPU + "\n" + "giá: " + gia + "\n" + "năm bảo hành: " + namBaoHanh);
    }
}
