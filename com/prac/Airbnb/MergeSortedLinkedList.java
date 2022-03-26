package com.leetCode.Airbnb;


import java.util.LinkedList;

public class MergeSortedLinkedList {

    public ListNode sort(ListNode listNode){
        if(listNode==null) return null;
        ListNode mid = getMiddle(listNode);
        ListNode midOfNext = mid.next;
        ListNode left  = sort(mid);
        ListNode right = sort(midOfNext);
        ListNode retNode = merge( left, right);
        return  retNode;
    }

    private ListNode getMiddle(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head.next;
        while(fastNode!= null && fastNode.next!= null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        return slowNode;
    }

    private ListNode merge(ListNode left, ListNode right) {

        ListNode result = null;
        if(left==null) return right;
        if(right==null)return left;

        if(left.val<= right.val){
            result = left;
            result.next = merge(left.next, right);
        }else{
            result = right;
            result.next = merge(left,right.next);
        }
        return result;
    }
}
