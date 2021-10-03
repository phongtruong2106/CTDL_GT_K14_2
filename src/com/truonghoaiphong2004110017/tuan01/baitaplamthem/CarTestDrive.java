package com.truonghoaiphong2004110017.tuan01.baitaplamthem;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car;
        car = new Car();
        car.tenChuXe = "Trương hoai phong";
        car.dong = "CUB50";
        car.hangSanXuat = "Honda";
        car.giayPhep = "có";
        car.dungTichxang = "1,3-1,5 lít xăng cho 100km";

        car.inThongtinCar();
    }
}
