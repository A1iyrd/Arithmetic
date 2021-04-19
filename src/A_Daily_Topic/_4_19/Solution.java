package A_Daily_Topic._4_19;

import java.util.Arrays;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int left=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=val)
                nums[left++]=nums[i];
        }
        return left;
    }
}
