package com.leetCode;

import java.util.Stack;

public class PathSumOfBinaryTree {
    int sum = 0;
    public boolean hasPathSum(Node root, int targetSum) {
        if(root == null )  return false;
        if(root.left==null && root.right==null) return targetSum-root.data == 0 ;
        return hasPathSum(root.left, targetSum-root.data) || hasPathSum(root.right, targetSum-root.data);
    }
    public boolean hasPathSumItr(Node root, int targetSum){
        if (root == null) return false;
        Stack<Node> stack = new Stack<>();
        Stack<Integer> intStack = new Stack<>();
        stack.push(root);
        intStack.push(targetSum- root.data);

        while (!stack.isEmpty()){
            Node currNode = stack.pop();
            int sum = intStack.pop();
            if(currNode.left== null && currNode.right== null && sum == 0){
                return true;
            }
            if(currNode.left!= null){
                stack.push(currNode.left);
                intStack.push(sum- currNode.left.data);
            }
            if(currNode.right!= null){
                stack.push(currNode.right);
                intStack.push(sum- currNode.right.data);
            }
        }
        return false;
    }
}
