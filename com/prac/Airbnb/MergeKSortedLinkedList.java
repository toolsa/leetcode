package com.leetCode.Airbnb;

import java.util.PriorityQueue;

/*
* You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6

*/
public class MergeKSortedLinkedList {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (ListNode lst: lists) {
            while(lst!= null){
                minHeap.add(lst.val);
                lst = lst.next;
            }
        }

        ListNode head = new ListNode(-1);
        ListNode curr = head;
        while(!minHeap.isEmpty()){
            curr.next = new ListNode(minHeap.remove());
            curr = curr.next;
        }
        return head.next;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}