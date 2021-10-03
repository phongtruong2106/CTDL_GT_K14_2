package com.truonghoaiphong2004110017.tuan01.baitaplamthem;

public class BookTestDrive {
    public static void main(String[] args) {
        Book book;
        book = new Book();
        book.gia = "12000đ";
        book.nhaXuatBan = "Kim Đồng";
        book.giaBan = "12000đ";
        book.soLuong = 1;
        book.Loai = "truyện tranh";
        
        book.inThongTin();
    }
}
