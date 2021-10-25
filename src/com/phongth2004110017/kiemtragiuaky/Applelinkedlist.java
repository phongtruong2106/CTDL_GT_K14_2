package com.phongth2004110017.kiemtragiuaky;

public class Applelinkedlist {
    Applel head = null;
    Applel tail = null;

    public Applelinkedlist(){}

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
    void clearAll(){
        head = tail = null ;
    }

    void addt (int ID, int khoiluong, String color){
        // Tạo 1 Node mới 
        Applel newApplel = new Applel(ID, khoiluong, color);
        // Kiểm tra xem danh sách 
        if(head == null ){// thêm 1 nút vào dánh sách rỗng
            // Nếu danh sách rỗng thì cả head và tail đều trỏ tới newNode
            head = newApplel ;
            tail = newApplel ;
        }else { // danh sách không rỗng
            // newNode sẽ được thêm và sau tail
            // THÀNH PHẦN LIÊN KẾT CỦA TAIL SẼ LIÊN KÉT ĐẾN
              tail.next = newApplel ;
            // newNode sẽ trở thành tail mới.
              tail = newApplel ;
        }
    }

     //chèn thêm node mới vào phần đầu của ds
    void addFirst (int ID, int khoiluong, String color){
         // Tạo 1 Node mới 
         Applel newNode = new Applel(ID ,khoiluong, color);
         // Kiểm tra xem danh sách 
         if(head == null ){// thêm 1 nút vào dánh sách rỗng
             // Nếu danh sách rỗng thì cả head và tail đều trỏ tới newNode
             head = newNode ;
             tail = newNode ;
         }else { // danh sách không rỗng
             // newNode sẽ được thêm và head
             // THÀNH PHẦN LIÊN KẾT CỦA TAIL SẼ LIÊN KÉT ĐẾN
               newNode.next = head  ;
             // newNode sẽ trở thành head mới.
               head = newNode ;
         }
    }
    void removeHead (){
        head = head.next ;
    }
    void removeTail(){
        Applel temp = head ;
        while(temp != null){
            if(temp.next ==tail){
                temp.next=null ;
                tail = temp ;
                break ;
            }
            temp = temp.next ;
        }
    
}
}
