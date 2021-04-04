package Leetcode_Learning.Binary_Search_Tree.Insert;

import Leetcode_Learning.Binary_Search_Tree.TreeNode;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),new TreeNode(7));
        System.out.println(insertIntoBST(treeNode,5));
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
