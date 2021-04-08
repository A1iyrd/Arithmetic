package Leetcode_Learning.DP.Simple_Sequence.HouseRobber.HouseRobber;

public class Solution {
    public int rob(int[] nums) {
        int len=nums.length;
        if (len==0)
            return 0;
        int result=nums[0];
        int[] dp=new int[len];
        dp[0]=nums[0];
        for (int i=1;i<len;i++){
            if (i==1) {
                dp[i] = Math.max(nums[i], nums[0]);
                result=Math.max(result,dp[i]);
                continue;
            }
            if (i==2) {
                dp[i] = Math.max(nums[i] + nums[0], nums[i - 1]);
                result=Math.max(result,dp[i]);
                continue;
            }
            dp[i]=dp[i]+Math.max(nums[i-2],nums[i-3]);
            result=Math.max(result,dp[i]);
        }
        return result;
    }
}
