package com.edsoft.linkedlist;

/**
 * Created by yusuf on 24.10.2016.
 */
public class LinkedListUtil {

    public static LinkedListNode removeDups(LinkedListNode head) {
        LinkedListNode h1 = head;
        LinkedListNode h2 = head;
        while (h1.getNext() != null) {
            while (h2.getNext() != null) {
                if (h1.getData() == h2.getNext().getData()) {
                    h2.setNext(h2.getNext().getNext());
                } else {
                    h2 = h2.getNext();
                }
            }
            h1 = h1.getNext();
            h2 = h1;
        }
        return head;
    }

    /**
     * K dan son elemana kadar olanı yazdırır
     *
     * @param head
     * @param index
     * @return
     */
    public static LinkedListNode kthToLast(LinkedListNode head, int index) {
        int count = -1;
        LinkedListNode h1 = head;
        LinkedListNode h2 = head;
        while (h1.getNext() != null) {
            if (count == index) {
                h2 = h2.getNext();
                count = -1;
            } else {
                count++;
            }
            h1 = h1.getNext();
        }
        return h2;
    }

    /**
     * Linkli listede ortanca elemanı silen fonksiyon
     *
     * @param head
     * @return
     */
    public static LinkedListNode deleteMiddleNode(LinkedListNode head) {
        LinkedListNode h1 = head.getNext().getNext();
        LinkedListNode h2 = head;
        while ((h1.getNext() != null) && (h1.getNext().getNext() != null)) {
            h2 = h2.getNext();
            h1 = h1.getNext().getNext();
        }
        h2.setNext(h2.getNext().getNext());
        return head;
    }
}
