package com.leetCode.Adobe;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while (curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode h = new ListNode(1);
        h.next = new ListNode(2);
        h.next.next = new ListNode(3);

        ListNode retNode = reverseList(h);
    }
}
