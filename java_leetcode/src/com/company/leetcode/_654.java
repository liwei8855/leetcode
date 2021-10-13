package com.company.leetcode;

import java.util.Arrays;
import java.util.Stack;

//最大二叉树
public class _654 {
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,1,6,0,5};
        _654 o = new _654();
//        TreeNode node = o.constructMaximumBinaryTree(nums);
//        TreeNode.levelPrint(node);
        o.parentIndexs(nums);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums==null || nums.length==0) return null;
        TreeNode root = findRootNode(nums,0,nums.length);
        return root;
    }

    private TreeNode findRootNode(int[] nums,int l, int r){
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

    public void parentIndexs(int[] nums){
        if (nums==null || nums.length==0) return;
        int[] llist = new int[nums.length];
        int[] rlist = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            llist[i] = -1;
            rlist[i] = -1;
        }

        //一遍扫描找出数组中元素左边最大llist和右边最大rlist的数index
        Stack<Integer> stack = new Stack();
        for (int i=0;i<nums.length;i++){

            while (!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                Integer index = stack.pop();
                rlist[index] = i;
            }
            if (!stack.isEmpty()){
                llist[i] = stack.peek();
            }
            stack.push(i);
        }

        System.out.println(Arrays.toString(llist));
        System.out.println(Arrays.toString(rlist));

        //找出每个节点父节点
        int[] pList = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            if (llist[i]==-1 && rlist[i]==-1){
                pList[i] = -1;
                continue;
            }
            if (llist[i] == -1){
                pList[i] = rlist[i];
            } else if (rlist[i] == -1){
                pList[i] = llist[i];
            } else {
                pList[i] = llist[i]<rlist[i]?llist[i]:rlist[i];
            }
        }
        System.out.println(Arrays.toString(pList));
    }

}
