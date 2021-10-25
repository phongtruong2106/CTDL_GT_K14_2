package com.phongth2004110017.kiemtragiuaky;

public class Nodea {
     //nội dung 
     int data;

     //liên kết đến nút tiếp theo
     //tham chiếu
     Nodea next;//biến tham chiếu kiểu node
 
     public Nodea(){}//hàm tạo
 
     public Nodea(int d){
            data = d;
     }
     public Nodea(int d, Nodea n){
            data = d;
            next = n;
     }
}
