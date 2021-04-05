package Leetcode_Learning.Binary_Search_Tree.LowestCommonAncestor;

import Leetcode_Learning.Binary_Search_Tree.TreeNode;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if( (p.val<root.val&&q.val>root.val)||(p.val>root.val&&q.val<root.val)||root.val==p.val||root.val==q.val)
            return root;

        if (p.val<root.val)
            root=lowestCommonAncestor(root.left,p,q);
        else
            root=lowestCommonAncestor(root.right,p,q);
        return root;
    }
}
