package com.truonghoaiphong2004110017.tuan03.baitaplamthem;

public class BookTestDrive {
    public static void main(String[] args) {
        Book[] danhSachBook = new Book[3];

        Book book0 = new Book("12000đ", "KIM ĐỒNG", "12000đ", "Truyện tranh", 1);
        Book book1 = new Book("54000đ", "YAGIRI", "54000đ", "tiểu thuyết", 1);
        Book book2 = new Book("6000đ", "BGD", "6000đ", "giáo dục", 1);

        danhSachBook[0] = book0;
        danhSachBook[1] = book1;
        danhSachBook[2] = book2;

       for(int i = 0; i < danhSachBook.length; i++){
           danhSachBook[i].inThongtin();
       }
    } 
}
