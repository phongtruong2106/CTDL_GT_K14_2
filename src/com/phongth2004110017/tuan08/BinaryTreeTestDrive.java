package com.phongth2004110017.tuan08;

public class BinaryTreeTestDrive {
    public static void main(String[] args) {
        BinaryTree binaryTree = BinaryTree.createBinaryTree();
        BinaryTree.breadthFirst(binaryTree.root);

        System.out.println("duyệt theo thứ tự bao gồm việc truy cập đầu tiên vào cây con bên trái, sau đó đến nút gốc và cuối cùng là cây con bên phải");
        BinaryTree.traverseInOrder(binaryTree.root);

        System.out.println(" \n Đặt trước các lượt truy cập duyệt qua nút gốc, sau đó đến cây con bên trái và cuối cùng là cây con bên phả");
        BinaryTree.traversePreOrder(binaryTree.root);

        System.out.println(" \n Duyệt theo thứ tự sau truy cập vào cây con bên trái, cây con bên phải và nút gốc ở cuối");
        BinaryTree.traversePostOrder(binaryTree.root);

        
    }

}
