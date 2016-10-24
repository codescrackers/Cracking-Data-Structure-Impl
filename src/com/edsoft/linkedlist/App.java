package com.edsoft.linkedlist;

public class App {
    public static void main(String[] args) {
        LinkedListNode n = initList();
        printList(LinkedListUtil.removeDups(n));

    }

    private static LinkedListNode initList() {
        LinkedListNode head = new LinkedListNode(5);
        head.appendToTail(6);
        head.appendToTail(7);
        head.appendToTail(4);
        head.appendToTail(2);
        head.appendToTail(8);
        head.appendToTail(9);
        head.appendToTail(2);
        head.appendToTail(0);

        return head;
    }

    private static void printList(LinkedListNode head) {
        while (head != null) {
            System.out.println(head.getData());
            head = head.getNext();
        }
    }

	/* LinkedListNode h1 = head;
    while(h1.next != null){
        if(h1.data == h1.next.data){
            h1.next = h1.next.next;
        }
    }
    return head;*/
}
