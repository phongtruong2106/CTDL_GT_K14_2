package com.truonghoaiphong2004110017.tuan01;

import java.util.Scanner;

public class lap1bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("cạnh: ");
        double canh = scanner.nextDouble();
        double thetich = Math.pow(canh, 3);

        //xuất màn hình
        System.out.println("thể tích lập phương : " + thetich);
        
    }
}
