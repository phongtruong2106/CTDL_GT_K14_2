package com.phongth2004110017.msword;

public class Node {
    HangHoa hangHoa;
    Node next;

    public Node() {
        hangHoa = null;
        next = null;

    }

    public Node(HangHoa newHangHoa) {
         hangHoa = newHangHoa;
         next = null;
    }

    public Node(HangHoa newHangHoa, Node node){
        hangHoa = newHangHoa;
        next = node;
    }
}
