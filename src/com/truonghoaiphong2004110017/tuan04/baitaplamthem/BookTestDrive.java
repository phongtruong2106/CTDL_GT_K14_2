package com.truonghoaiphong2004110017.tuan04.baitaplamthem;

import java.util.Scanner;

public class BookTestDrive {
    public static void main(String[] args) {
        //tạo 1 danh sách book
        Book[] bookList = new Book[2];
        
        //nhập danh sách từ bàn phím
        Scanner varInput = new Scanner(System.in);

        System.out.println("nhập vào thông tin sách: ");

        for(int i = 0; i < bookList.length; i++){
            System.out.println("nhập sách thứ : " + (i + 1));
            System.out.print("giá : ");
            String gia = varInput.nextLine();
            System.out.print("nhà xuất bản: ");
            String nhaXuatBan = varInput.nextLine();
            System.out.print("giá bán: ");
            String giaBan = varInput.nextLine();
            System.out.print("loại: ");
            String Loai = varInput.nextLine();
            System.out.print("số lượng: ");
            int soLuong = varInput.nextInt();
            varInput.nextLine();
            bookList[i] = new Book(gia, nhaXuatBan, giaBan, Loai, soLuong);


        }
            //in danh sách book 
            System.out.println("========in danh sách book=======");
            for(Book book : bookList){
                book.inThongtin();

       
        }
    }
    
}
