package Leetcode_Learning.Binary_Search_Tree.KthLargest;

import Leetcode_Learning.Binary_Search_Tree.TreeNode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

//脑瘫题目描述，建议别做
@Deprecated
public class KthLargest {
    public static void main(String[] args) {
        KthLargest kthLargest=new KthLargest(3,new int[]{4,5,8,3,2,1});
        System.out.println(kthLargest.add(1));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));

    }

    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<Integer>();
        for (int x : nums) {
            add(x);
        }
    }

    public int add(int val) {
        pq.offer(val);
        if (pq.size() > k) {
            pq.poll();
        }
        return pq.peek();
    }
}
