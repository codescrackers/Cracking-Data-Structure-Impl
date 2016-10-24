package com.edsoft.linkedlist;

public class LinkedListNode {
    private LinkedListNode next;
    private int data;

    public LinkedListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public void appendToTail(int data) {
        LinkedListNode end = new LinkedListNode(data);
        LinkedListNode n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public LinkedListNode deleteNode(LinkedListNode head, int data) {
        LinkedListNode n = head;
        if (n.data == data) {
            return head.next; /* moved head */
        }
        while (n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }




    public static LinkedListNode sumLists(int number1, int number2) {

        LinkedListNode h1 = new LinkedListNode(number1 % 10);
        LinkedListNode h2 = new LinkedListNode(number2 % 10);
        LinkedListNode h3 = null;
        LinkedListNode h1Head = h1;
        LinkedListNode h2Head = h2;
        LinkedListNode h3Head = null;
        number1 *= 10;
        number2 *= 10;
        while ((number1 % 10 != 0) && (number2 % 10 != 0)) {
            h1.next = new LinkedListNode(number1);
            h2.next = new LinkedListNode(number2);
            h1 = h1.next;
            h2 = h2.next;
            number1 *= 10;
            number2 *= 10;
        }
        int bolum = (h1Head.data + h2Head.data) / 10;
        int mod = (h1Head.data + h2Head.data) % 10;
        h3 = new LinkedListNode(mod);
        h3Head = h3;
        h1Head = h1Head.next;
        h2Head = h2Head.next;
        while ((h1Head.next != null) && (h2Head.next != null)) {

        }
        return null;

    }
}
