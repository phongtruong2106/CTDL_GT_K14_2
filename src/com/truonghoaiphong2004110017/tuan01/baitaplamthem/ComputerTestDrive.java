package com.truonghoaiphong2004110017.tuan01.baitaplamthem;

public class ComputerTestDrive {
    public static void main(String[] args) {
        Computer computer;
        computer = new Computer();
        computer.nhaSanXuat = "ROG";
        computer.heDieuHanh = "Win10 pro";
        computer.namSanXuat = "2021";
        computer.CPU = "Ryzen 7  4800H";
        computer.gia = "24.000.000đ";
        computer.namBaoHanh = "24 thang";

        computer.inThongTin();
    }
}
