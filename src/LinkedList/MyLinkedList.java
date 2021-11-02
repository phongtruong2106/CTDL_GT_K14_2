package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String>  linkedlist = new LinkedList<>();

        //thêm phần tử 
        linkedlist.add("gà");
        linkedlist.add("bò");
        linkedlist.add("chó");
        System.out.println("linked list: " + linkedlist);

        //thêm phần tử có số chỉ
        //có thể thêm  các phần tử  Linked list bằng cách sử dụng  các chỉ số

        linkedlist.add(0, "gà");
        linkedlist.add(1, "chó");
        linkedlist.add(2, "bò");
        System.out.println("linked list: " + linkedlist);

        //thêm phần tử từ linked list này sang  linked list khác
        //sử dụng hàm addall();

        LinkedList<String> animals = new LinkedList<>();
        animals.add("heo");

        //chuyển tất cả từn linkedlist sáng animals
        animals.addAll(linkedlist);
        System.out.println("animals : " + animals);

        //thêm phần tử : sử dụng hàm listterator

        ArrayList<String> animal = new ArrayList<>();

        //sử dụng  listterator
        ListIterator<String> listIterate = animal.listIterator();
        listIterate.add("gà");
        listIterate.add("chó");

        System.out.println("linked list : " + animal);

        ////truy cập tới các phần tử trong linkedlist
        ///sử dụng hàm get();

        String str = linkedlist.get(1);
        System.out.println("linked list: " + str);

        ///sử dụng hàm iterator
        Iterator<String> iterate = linkedlist.iterator();  
        System.out.println("linked list: " );   
        
        while(iterate.hasNext()){ // hàm hasNext() trả về true nếu có ơhaanf tử tiếp theo
             System.out.print(iterate.next()); //trả về phần tử tiếp theo
             System.out.print(", ");
        }

        ///sử dụng hàm listIterator()
        System.out.print("linkedlist : ");

        while(listIterate.hasNext()){ // trả về true nếu có phần tử tiếp theo
            System.out.print(listIterate.next()); // trả về phần tử tiếp theo 
            System.out.print(", ");
        }

        System.out.print("\nReverse Linked list : ");
        while(listIterate.hasPrevious()){ // trở về phần tử trước
            System.out.print(listIterate.previous());
            System.out.print(", ");
        }
    }
}
