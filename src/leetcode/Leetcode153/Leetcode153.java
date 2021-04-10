package leetcode.Leetcode153;

public class Leetcode153 {
    public int findMin(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (nums[left] > nums[right]) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[left]) {
                left=mid+1;
            }
            else if (nums[right]>nums[mid]){
                right=mid;
            }
        }int result = nums[left];
        return result;

    }
}
