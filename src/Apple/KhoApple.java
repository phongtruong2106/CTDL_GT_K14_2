package Apple;

import java.util.ArrayList;
import java.util.Scanner;

public class KhoApple {
    static ArrayList<Apple> dsApple = new ArrayList<>();
    static Scanner bienNhap = new Scanner(System.in);
        
    public void nhapVaoDanhSach(){
        while(true){

            Apple apple = new Apple();
            apple.nhapThongTinApple();
            
            bienNhap.nextLine();
            dsApple.add(apple);

            System.out.println("Nhập thêm táo: (y/n) ?");
            if(bienNhap.nextLine().equals("n"))
            break;
        }
    }
    
    public void xuatDanhSach(){
        for(Apple apple: dsApple){
            apple.inThongTinApple();
        }
    }

    public void timTheoMau(){
        System.out.println("Màu cần tìm là: ");
        for(Apple apple: dsApple){
            if(bienNhap.nextLine().equals(apple.color))
            apple.inThongTinApple();
        }
    }
}
