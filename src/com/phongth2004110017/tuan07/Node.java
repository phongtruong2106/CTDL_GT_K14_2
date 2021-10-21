package com.phongth2004110017.tuan07;

public class Node {
     //nội dung 
     int data;

     //liên kết đến nút tiếp theo
     //tham chiếu
     Node next;//biến tham chiếu kiểu node
 
     public Node(){}//hàm tạo
 
     public Node(int d){
            data = d;
     }
     public Node(int d, Node n){
            data = d;
            next = n;
     }
    }
