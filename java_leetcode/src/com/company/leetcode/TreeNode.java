package com.company.leetcode;

import apple.laf.JRSUIUtils;

import java.util.LinkedList;
import java.util.Queue;

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

    //后序遍历
    static String postSerialize(TreeNode node){
        if (node==null) return "#!";
        StringBuilder sb = new StringBuilder();
        String left = postSerialize(node.left);
        sb.append(left);
        String right = postSerialize(node.right);
        sb.append(right);
        sb.append(Integer.toString(node.val)+'!');
        return sb.toString();
    }

    static void forePrint(TreeNode node){
        if (node==null) {
            System.out.print("null_");
            return;
        }
        System.out.print(Integer.toString(node.val)+"_");
        forePrint(node.left);
        forePrint(node.right);
    }

    static void levelPrint(TreeNode node){
        if (node == null){
            System.out.print("null_");
            return;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(node);
        while (!queue.isEmpty()){
            TreeNode n = queue.poll();
            System.out.print(Integer.toString(n.val)+"_");
            if (n.left != null){
                queue.offer(n.left);
            }
            if (n.right != null){
                queue.offer(n.right);
            }
        }
    }
}
