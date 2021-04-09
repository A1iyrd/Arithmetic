package Leetcode_Learning.Binary_Search_Tree.SortedArrayToBST;

import Leetcode_Learning.Binary_Search_Tree.TreeNode;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {

        return DFS(nums,0,nums.length-1);
    }
    public TreeNode DFS(int[] nums,int left,int right) {
        if (left > right) {
            return null;
        }

        // 总是选择中间位置左边的数字作为根节点
        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = DFS(nums, left, mid - 1);
        root.right = DFS(nums, mid + 1, right);
        return root;

    }
}
