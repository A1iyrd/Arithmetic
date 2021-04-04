package Leetcode_Learning.Binary_Search_Tree.Verify;

import Leetcode_Learning.Binary_Search_Tree.TreeNode;

import java.util.Stack;

public class Verify {
    public static void main(String[] args) {
//        TreeNode treeNode=new TreeNode(5,new TreeNode(1),new TreeNode(4,new TreeNode(3),new TreeNode(6)));
//        System.out.println(isValidBST(treeNode));
        TreeNode treeNode=new TreeNode(1,null,new TreeNode(1));
        System.out.println(isValidBST(treeNode));
    }
    //第一种解法
    public static boolean isValidBST(TreeNode root) {
        //中序遍历
        Stack<TreeNode> stack=new Stack<>();
        long min=Long.MIN_VALUE;
        while(!stack.empty()||root!=null){
            while(root!=null){
                stack.add(root);
                root=root.left;
            }
            root=stack.pop();
            if(root.val<=min)
                return false;
            min=root.val;
            root=root.right;
        }
        return true;
    }

    //第二种解法
    public static boolean DFS(TreeNode root){
        return DFSImpl(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private static boolean DFSImpl(TreeNode root,long lower,long upper){
        if (root==null)
            return true;
        if(root.val<=lower||root.val>=upper)
            return false;
        return DFSImpl(root.left,lower,root.val)&&DFSImpl(root.right,root.val,upper);
    }
}
