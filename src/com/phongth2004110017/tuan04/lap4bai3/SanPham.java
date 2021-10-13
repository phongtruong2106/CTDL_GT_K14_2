package com.phongth2004110017.tuan04.lap4bai3;

public class SanPham {
    String ten;
    Double gia;
    Double giamgia;
    Double thue;

 SanPham(){

    }
  SanPham(String t, Double g, Double gg, Double th){
        ten = t;
        gia = g;
        giamgia = gg;
        thue = th;
    }

   void inthongtin(){
        System.out.println("tên Sản phẩm: " + ten);
        System.out.println("giá sản phẩm: " + gia);
        System.out.println("giá giảm sản phẩm: " + giamgia);
        System.out.println("giá thuế sản phẩm: " + thue);
    }
}
