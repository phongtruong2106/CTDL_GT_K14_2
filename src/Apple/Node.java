package Apple;

import java.util.Scanner;

public class Node {
    int data;
    Node next;
    Scanner sc = new Scanner(System.in);

    public Node() {
    }

    public Node(int d) {
        data = d;
    }

    public Node(int d, Node n) {
        data = d;
        next = n;
    }

    public void nhapThongTin() {
        System.out.println("nhập Node: ");
        data = sc.nextInt();
        System.out.println("nhập khối lượng: ");
        data = sc.nextInt();
    }
}
