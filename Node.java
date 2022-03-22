package com.leetCode;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    Node(int data, Node right, Node left){
        this.data = data;
        this.right = right;
        this.left = left;
    }

}