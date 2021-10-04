package com.phongth2004110017.tuan03.baitaplamthem;

public class TaikhoanTestDrive {
    public static void main(String[] args) {
        Taikhoan[] danhSachTaikhoan = new Taikhoan[3];

        Taikhoan taikhoan0 = new Taikhoan("lữ văn bố", "2684998", "1.000.000.000đ");
        Taikhoan taikhoan1 = new Taikhoan("quang văn vũ", "36255105", "2.000.000");
        Taikhoan taikhoan2 = new Taikhoan("tất đạt đa", "620235486", "0đ");

        danhSachTaikhoan[0] = taikhoan0;
        danhSachTaikhoan[1] = taikhoan1;
        danhSachTaikhoan[2] = taikhoan2;

        for(int i =0; i < danhSachTaikhoan.length; i++){
        danhSachTaikhoan[i].inThongTin();
       }
    }  
    
}
