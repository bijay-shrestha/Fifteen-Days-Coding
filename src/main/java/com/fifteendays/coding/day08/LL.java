package com.fifteendays.coding.day08;

import java.sql.SQLOutput;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    void add(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size +=1;
    }

    void display() {
        Node cur = head;
        while(cur != null) {
            System.out.print (cur.val + " -> ");
            cur = cur.next;
            head=head.next;
        }
    }

    private class Node{
        int val;
        Node next;

        Node(){
        }

        Node(int val){
            this.val = val;
        }

        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }

    }
}
