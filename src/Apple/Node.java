package Apple;

import java.util.Scanner;

public class Node {
    Apple data;

    Node next;
    public Node() {
        data = null;
        next = null;
    }

    public Node(Apple apple) {
        data = apple;
        next = null;
    }

    public Node(Apple apple, Node node) {
      data = apple;
      next = node;
    }

    public void nhapThongTin() {
    }
}