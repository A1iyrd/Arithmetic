package Leetcode_Learning.Binary_Search_Tree.BSTIterator;

import Leetcode_Learning.Binary_Search_Tree.TreeNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BSTIterator {
    //第一种解，很简单易懂
//    private int idx;
//    private List<Integer> arr;
//    public BSTIterator(TreeNode root) {
//        idx=0;
//        arr=new ArrayList<Integer>();
//        inorderTraversal(root,arr);
//    }
//    public int next() {
//        return arr.get(idx++);
//    }
//
//    public boolean hasNext() {
//        return idx<arr.size();
//    }
//    private void inorderTraversal(TreeNode root,List<Integer> arr){
//        if(root==null)
//            return;
//        inorderTraversal(root.left,arr);
//        arr.add(root.val);
//        inorderTraversal(root.right,arr);
//    }
    //第二种解,第二种解法和Verify的做法很像
    private TreeNode cur;
    private Deque<TreeNode> stack;
    public BSTIterator(TreeNode root){
        cur=root;
        stack=new LinkedList<TreeNode>();
    }
    public int next(){
        while (cur!=null){
            stack.push(cur);
            cur=cur.left;
        }
        cur=stack.pop();
        int ret=cur.val;
        cur=cur.right;
        return ret;
    }
    public boolean hasNext(){
        return cur!=null||!stack.isEmpty();
    }

}