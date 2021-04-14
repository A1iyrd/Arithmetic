package Leetcode_Learning.DP.Interval.Other.BrustBalloons;

public class Solution {
    public int maxCoins(int[] nums) {
        int[] nums_New=new int[nums.length+2];
        nums_New[0]=1;
        nums_New[nums_New.length-1]=1;
        for(int i=1;i<nums_New.length-1;i++){
            nums_New[i]=nums[i-1];
        }
        int[][] dp=new int[nums_New.length][nums_New.length];
        for (int c=1;c<nums.length;c++){
            for(int i = 1;i+c-1 <= nums.length;++i){
                int j = i+c-1;
                int ans=dp[i][j];
                for(int k=i;k<=j;++k){
                    ans=Math.max(ans,nums[i-1]*nums[k]*nums[j+1]+dp[i][k-1]+dp[k+1][j]);
                }
            }
        }
        return dp[0][nums.length];
    }
}
