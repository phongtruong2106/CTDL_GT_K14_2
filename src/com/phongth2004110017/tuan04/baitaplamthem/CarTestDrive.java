package com.phongth2004110017.tuan04.baitaplamthem;

import java.util.Scanner;

public class CarTestDrive {
    public static void main(String[] args) {
        //tạo danh sách car 
        Car[] carList = new Car[2];

        //nhập danh sách CAR từ bàn phím
        Scanner varInput = new Scanner(System.in);

        System.out.println("điền thông tin CAR: ");

        for(int i = 0; i < carList.length; i++){
            System.out.println("thông tin CAR " + (i + 1));
            System.out.print("tên chủ xe: ");
            String tenChuXe = varInput.nextLine();
            System.out.print("hãng sản xuất: ");
            String hangSanXuat = varInput.nextLine();
            System.out.print("dòng: ");
            String dong = varInput.nextLine();
            System.out.print("giấy phép: ");
            String giayPhep = varInput.nextLine();
            System.out.print("dung tích xăng: ");
            String dungTichXang = varInput.nextLine();

            varInput.nextLine();
            carList[i] = new Car(tenChuXe, hangSanXuat, dong, giayPhep, dungTichXang);
        }

        //in thông tin Car
        
        System.out.println("=========in thông tin CAR========");
        for(Car car : carList){
            car.inThongTinCar();
        }

    }
}
