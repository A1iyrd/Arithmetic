package Leetcode_Learning.DP.Simple_Sequence.ClassicLIS.LongestIncreaseSub;

import java.util.Arrays;

public class Solution {
    public int lengthOfLIS(int[] nums) {

        int len=nums.length;
        if (len<2)
            return len;
        int[] dp=new int[len];
        Arrays.fill(dp,1);
        int result=dp[0];
        for (int i=1;i<len;i++){
            for (int j=0;j<i;j++){
                if(nums[i]>nums[j])
                    dp[i]=Math.max(dp[i],dp[j]+1);
            }
            result=Math.max(result,dp[i]);
        }
        return result;
    }
}
