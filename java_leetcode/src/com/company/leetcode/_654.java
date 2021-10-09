package com.company.leetcode;
//最大二叉树
public class _654 {
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,1,6,0,5};
        TreeNode node = constructMaximumBinaryTree(nums);
        TreeNode.forePrint(node);
    }

    static TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = findRootNode(nums,0,nums.length);
        return root;
    }

    static TreeNode findRootNode(int[] nums,int l, int r){
        if (l==r) return null;

        int maxIndex = l;
        for (int i=l+1;i<r;i++){
            if (nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }
        TreeNode node = new TreeNode();
        node.val = nums[maxIndex];
        node.left = findRootNode(nums,l,maxIndex);
        node.right = findRootNode(nums,maxIndex+1,r);
        return node;
    }

}
