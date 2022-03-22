package com.leetCode;

public class IsSymmetricBinaryTree {
    public boolean isSymmetric(Node root) {
        return root ==null || isSymmetricHelp(root.left, root.right);
    }

    public boolean isSymmetricHelp(Node right, Node left){
        if(right == null || left == null) return right==left;
        //return (right.left.val==left.right.val);
        if(left.data!= right.data) return false;
        return isSymmetricHelp(right.left, left.right) && isSymmetricHelp(right.right, left.left);
    }
}
