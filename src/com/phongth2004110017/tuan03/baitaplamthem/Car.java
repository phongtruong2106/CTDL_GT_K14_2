package com.phongth2004110017.tuan03.baitaplamthem;

public class Car {
    String tenChuXe;
    String hangSanXuat;
    String dong;
    String giayPhep;
    String dungTichxang;

    public Car(){};

    public Car(String n ,String h ,String d ,String g ,String dt){
        tenChuXe = n;
        hangSanXuat = h;
        dong = d;
        giayPhep = g;
        dungTichxang = dt;
    }
    void inThongTinCar(){
        System.out.println("tên chủ xe: " + tenChuXe + "\n" + "hảng sản xuất: " + hangSanXuat + "\n" + "dòng: " + dong + "\n" + "giấy phép: " + giayPhep + "\n" + "dung tích xăng: " + dungTichxang);
    }
}
