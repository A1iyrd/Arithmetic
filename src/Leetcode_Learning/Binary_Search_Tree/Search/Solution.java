package Leetcode_Learning.Binary_Search_Tree.Search;

import Leetcode_Learning.Binary_Search_Tree.TreeNode;

import java.util.Stack;

public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode cur=new TreeNode();
        Stack<TreeNode> stack=new Stack<>();

        while (root!=null||!stack.isEmpty()){
            while(root!=null){
                if (root.val==val)
                    return root;
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            root=root.right;
        }
        return null;

    }
}

