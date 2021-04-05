package Leetcode_Learning.Binary_Search_Tree.IsBalanced;

import Leetcode_Learning.Binary_Search_Tree.TreeNode;

import java.util.Stack;

public class Solution {
    //这是我自己的代码，逻辑上我自己觉得没有问题，但是不对。
//    private int min=Integer.MAX_VALUE;
//    private int max=0;
//    public boolean isBalanced(TreeNode root) {
//        int len=0;
//        Stack<TreeNode> stack=new Stack<>();
//        while (!stack.isEmpty()||root!=null){
//            while (root!=null){
//                stack.push(root);
//                root=root.left;
//                len++;
//            }
//            min=Math.min(min,len);
//            max=Math.max(max,len);
//
//            root=stack.pop();
//
//            len--;
//            root=root.right;
//
//        }
//        if (max-min<=1)
//            return true;
//        return false;
//    }

    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode root) {
        if (root == null) return 0;
        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
