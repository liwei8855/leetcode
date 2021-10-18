package com.company.leetcode;

import com.sun.deploy.panel.TreeEditors;

public class _572 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(0);

        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);
        System.out.println(isSubtree(root,subRoot));
    }
//后序遍历序列化数组成唯一字符串 如果是子树 则字符串相同 root中包含子树
    static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String rootStr = TreeNode.postSerialize(root);
        String subStr = TreeNode.postSerialize(subRoot);
        System.out.println(rootStr);
        System.out.println(subStr);
        return rootStr.contains(subStr);
    }

}
