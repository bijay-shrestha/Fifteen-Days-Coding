package com.fifteendays.coding.day07;

public class ListNodeTriggerer {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next = new ListNode(6);
        listNode.next.next.next.next.next.next = new ListNode(7);
        listNode.next.next.next.next.next.next.next = new ListNode(8);
        listNode.next.next.next.next.next.next.next.next = new ListNode(9);

        int length = 0;
        ListNode current = listNode;
        while (current != null) {
            length++;
            current = current.next;
        }

        System.out.println(length);

    }
}
