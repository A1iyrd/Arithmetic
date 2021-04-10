package leetcode.Leetcode154;

public class Leetcode154 {
    public int findMin(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left!=right&&nums[left] >= nums[right]) {
            int mid = (left + right) / 2;
            if (nums[mid]>nums[left]){
                left=mid+1;
            }
            else {
                right=mid;
            }
        }
        return nums[left];
    }
}
