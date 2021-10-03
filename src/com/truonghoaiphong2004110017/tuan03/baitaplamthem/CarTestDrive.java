package com.truonghoaiphong2004110017.tuan03.baitaplamthem;

public class CarTestDrive {
    public static void main(String[] args) {
        Car[] danhSachCar = new Car[2];
        Car car0 = new Car("Lưu Văn Can", "CUB", "Honda", "yes", "1,3-1,5 lít xăng cho 100km");
        Car car1 = new Car("điêu thị thuyền", "wave", "Honda", "yes", "1 lít ");

        danhSachCar[0] = car0;
        danhSachCar[1] = car1;

        for(int i = 0; i < danhSachCar.length; i++){
            danhSachCar[i].inThongTinCar();
        }
    }
}
