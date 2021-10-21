package com.phongth2004110017.tuan07;

public class Mylinklists {
    Node head = null;
    Node tail = null;

    public Mylinklists(){}
    
    //xây dựng thêm hàm
    void add(int data){
        //tạo 1 note mới
        Node newNode = new Node(data);

        if(head == null){//thêm nút vào danh sách rỗng
            head = newNode;
            tail = newNode;
        }else{//ds không rỗng //thêm đuôi vào danh sách
            tail.next = newNode;
            tail = newNode;
        }
    }

    void remve(){

    }
    void print(){
         Node cur =head;

         if(head==null){
             System.out.println("danh sách rỗng");
             return;
         }
         System.out.println("các nút trong danh sách");
         while(cur != null){
             System.out.println(cur.data);
             cur = cur.next; //liên kết phần tử tiếp theo
         }
    }
    void find(){

    }
     //chèn thêm node mới vào phần đầu của ds
    void push(int new_data) {
        /* Cấp phát bộ nhớ cho node mới
           Truyền giá trị vào cho node mới*/
    Node newNode = new Node(new_data); 
  
    /*  Làm cho node tiếp theo của node mới trở thành node head
     (tức là làm cho con trỏ next của node mới trỏ đến node head) */
    newNode.next = head; 
  
    /* 4. Làm cho node head trỏ đến node mới */
    head = newNode; 
    }
}
