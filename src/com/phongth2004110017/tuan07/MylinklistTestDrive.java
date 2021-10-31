package com.phongth2004110017.tuan07;

public class MylinklistTestDrive {
    public static void main(String[] args) {
        Mylinklists mylinklists = new Mylinklists();
        System.out.println("các phần tử ban đầu: ");
        mylinklists.add(2);
        mylinklists.add(5);
        mylinklists.add(9);
        
        mylinklists.print();
    //thêm phần tử
    System.out.println("danh sách dc thêm");
    mylinklists.push(7);
    mylinklists.print();
    //xóa phần tử đầu

    System.out.println("xóa phần tử");
    mylinklists.removeHead();
    mylinklists.print();

    //xóa phần tử cuối 

    System.out.println("danh sách còn lại");
    mylinklists.removeTail();
    mylinklists.print();
    }
    
    

}
