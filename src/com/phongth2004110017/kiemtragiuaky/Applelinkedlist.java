package com.phongth2004110017.kiemtragiuaky;

public class Applelinkedlist {
    Nodea head = null;
    Nodea tail = null;

    public Applelinkedlist(){}
    
    //xây dựng thêm hàm
    void add(int data){
        //tạo 1 note mới
        Nodea newNode = new Nodea(data);

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
         Nodea cur =head;

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
    Nodea newNode = new Nodea(new_data); 
  
    /*  Làm cho node tiếp theo của node mới trở thành node head
     (tức là làm cho con trỏ next của node mới trỏ đến node head) */
    newNode.next = head; 
  
    /* 4. Làm cho node head trỏ đến node mới */
    head = newNode; 
    }
}
