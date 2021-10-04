package com.phongth2004110017.tuan04.baitaplamthem;

public class Car {
    String tenChuXe;
    String hangSanXuat;
    String dong;
    String giayPhep;
    String dungTichxang;

   Car(){};
   Car(String n ,String h ,String d ,String g ,String dt){
        tenChuXe = n;
        hangSanXuat = h;
        dong = d;
        giayPhep = g;
        dungTichxang = dt;
    }
 void inThongTinCar(){
        System.out.println("tên chủ xe: " + tenChuXe  + "hảng sản xuất: " + hangSanXuat + "dòng: " + dong +  "giấy phép: " + giayPhep + "dung tích xăng: " + dungTichxang);
    }
}
