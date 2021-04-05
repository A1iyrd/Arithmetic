package Leetcode_Learning.Binary_Search_Tree.ContainsNearbyAlmostDuplicate;

import java.util.TreeSet;

public class Soluution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i) {
            // Find the successor of current element
            Long s = set.ceiling((long)nums[i]);
            if (s != null && s <= nums[i] + t) return true;

            // Find the predecessor of current element
            Long g = set.floor((long)nums[i]);
            if (g != null && nums[i] <= g + t) return true;

            set.add((long)nums[i]);
            if (set.size() > k) {
                set.remove((long)nums[i - k]);
            }
        }
        return false;
    }
}
