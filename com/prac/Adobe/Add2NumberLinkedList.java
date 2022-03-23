package com.leetCode.Adobe;

import java.math.BigInteger;

public class Add2NumberLinkedList {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String firstNum = extracted(l1);
        String secondNum = extracted(l2);
        BigInteger sum = new BigInteger(firstNum).add(new BigInteger(secondNum));
        ListNode head = null;
        char[] sumArray = String.valueOf(sum).toCharArray();
        for (int i = sumArray.length - 1; i >= 0; i--) {
            int ch = Character.getNumericValue(sumArray[i]);
            if (head == null) {
                head = new ListNode(ch);
            } else {
                ListNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new ListNode(ch);
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        l1.next = new ListNode(6);
        l1.next.next = new ListNode(4);
        //[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(0);
        l2.next.next = new ListNode(0);
        l2.next.next.next = new ListNode(0);
        l2.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(1);
        //l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
       // l2.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);




        addTwoNumbers(l1,l2);
    }


    private static String extracted(ListNode l1) {
        String firstNum = "";
        //StringBuilder stringBuilder = new StringBuilder();
        while (l1 != null){
            firstNum+=String.valueOf(l1.val);
            l1 = l1.next;
        }
        StringBuilder stringBuilder = new StringBuilder(firstNum);
        return stringBuilder.reverse().toString();
    }

}
class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}