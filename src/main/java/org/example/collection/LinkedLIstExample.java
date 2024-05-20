package org.example.collection;

class Node {
    Integer data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    public void add(Integer num) {
        if (head==null) {
            head = new Node(num);
        } else {
            Node temp = head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = new Node(num);
//            head.next = temp;
        }
    }

    public void printAll() {
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}

public class LinkedLIstExample {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);

        list.printAll();
    }

}
