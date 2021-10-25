package com.phongth2004110017.kiemtragiuaky;

public class Applelinkedlist {
    Applel head = null;
    Applel tail = null;

    public Applelinkedlist(){}
    
    //xây dựng thêm hàm
    void add(int ID, int khoiluong, String color){
        //tạo 1 note mới
        Applel newApplel = new Applel(ID, khoiluong, color, newApplel);


        if(head == null){//thêm nút vào danh sách rỗng
            head = newApplel;
            tail = newApplel;
        }else{//ds không rỗng //thêm đuôi vào danh sách
            tail.next = newApplel;
            tail = newApplel;
        }
    }

    void remve(){

    }
    void print(){
         Applel cur =head;

         if(head==null){
             System.out.println("danh sách rỗng");
             return;
         }
         System.out.println("các nút trong danh sách");
         while(cur != null){
             System.out.println(cur.ID);
             System.out.println(cur.khoiluong);
             System.out.println(cur.color);

             cur = cur.next; //liên kết phần tử tiếp theo
         }
    }
    void find(){

    }
     //chèn thêm node mới vào phần đầu của ds
    void push(int new_data) {
        Object new_ID_;
    /* Cấp phát bộ nhớ cho node mới
           Truyền giá trị vào cho node mới*/
    Applel newApplel = new Applel(new_data); 
  
    /*  Làm cho node tiếp theo của node mới trở thành node head
     (tức là làm cho con trỏ next của node mới trỏ đến node head) */
    newApplel.next = head; 
  
    /* 4. Làm cho node head trỏ đến node mới */
    head = newApplel; 
    }
}
