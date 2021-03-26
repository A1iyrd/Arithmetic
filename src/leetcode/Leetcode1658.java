package leetcode;

import java.util.Arrays;

public class Leetcode1658 {
    public static void main(String[] args) {
        int[] nums={3,2,20,1,1,3};
        System.out.println(minOperations(nums,10));
    }
    public static int minOperations(int[] nums, int x) {
        int maxPart = -1;
        int sum = Arrays.stream(nums).sum();
        int currentSum = 0;
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (right < nums.length) {
                currentSum += nums[right++];
            }
            while (currentSum > sum - x && left < nums.length) {
                currentSum -= nums[left++];
            }
            if (currentSum == sum - x) {
                maxPart = Math.max(maxPart, right - left);
            }
        }
        return maxPart == -1 ? -1 : nums.length - maxPart;
    }
}
