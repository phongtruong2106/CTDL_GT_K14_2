package com.phongth2004110017.tuan05.baitaplamthem;


public class SVDV { //lớp SVDV lưu trữ thông tin của sinh viên bao gồm hoten, diemTB

    private String ten;
    private double diemTB;

    //tạo hàm  dựng 
    public SVDV(){
        this.ten = null;
        this.diemTB = 0;
    }
    //hàm dựng khởi tạo giá trị cho tên và điểm trung bình
    public SVDV(String ten, double diemTB) {
        this.ten = ten;
        this.diemTB = diemTB;
    }

    public double getdiemTB(){
        return diemTB;
    }
    public void setdiemTB(double diemTB){
        this.diemTB = diemTB;
    }
    public void setten(String ten){
        this.ten = ten;
    }
    public String getten(){
        return this.ten;
    }
}
