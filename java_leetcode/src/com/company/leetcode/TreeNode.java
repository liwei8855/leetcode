package com.company.leetcode;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    static void forePrint(TreeNode node){
        if (node==null) {
            System.out.print("null_");
            return;
        }
        System.out.print(node.val+"_");
        forePrint(node.left);
        forePrint(node.right);
    }
}
