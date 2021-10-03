package com.truonghoaiphong2004110017.tuan03.baitaplamthem;

public class ComputerTestDrive {
    public static void main(String[] args) {
        Computer[] danhSachComputer = new Computer[2];

        Computer computer0 = new Computer("ROG", "2021", "Win10 pro", "Ryzen 7  4800H", "24.000.000đ", "24 thang");
        Computer computer1 = new Computer("HP", "2021", "Windows 10", "	10750H", "27.990.000₫", "24 thang");
        
        danhSachComputer[0] = computer0;
        danhSachComputer[1] = computer1;

        for(int i = 0; i < danhSachComputer.length; i++){
             danhSachComputer[i].inThongTin();
        }
    }
}
