package Leetcode_Learning.Binary_Search_Tree.Verify;

import java.util.Stack;

public class Verify {
    public static void main(String[] args) {
//        TreeNode treeNode=new TreeNode(5,new TreeNode(1),new TreeNode(4,new TreeNode(3),new TreeNode(6)));
//        System.out.println(isValidBST(treeNode));
        TreeNode treeNode=new TreeNode(1,null,new TreeNode(1));
        System.out.println(isValidBST(treeNode));
    }
    public static boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        long min=Long.MIN_VALUE;
        while(stack!=null||root!=null){
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
    private static int DFS(TreeNode root){
        int result=0;
        if (root.left!=null&&root.left.val<root.val)
            result+=DFS(root.left);
        if (root.left.val>=root.val||root.right.val<=root.val)
            return 1;
        if (root.right!=null&&root.right.val>root.val)
            result+=DFS(root.right);
//        if (root.left!=null&&root.left.val>=root.val)
//            return 1;
//        if (root.right!=null&&root.right.val<=root.val)
//            return 1;
//
//        if (root.left!=null)
//            result+=DFS(root.left);
//        if (root.right!=null)
//            result+=DFS(root.right);
        return result;
    }
}
class TreeNode{
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
}