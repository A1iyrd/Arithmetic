package Leetcode_Learning.DP.Simple_Sequence.ClassicLIS.LongestIncreaseSub_Num;

import java.util.Arrays;

//我一开始的思路是对的，用二维数组或两个数组，但是两个数组之间的关系没有找到，导致没有写出来

//下面的答案是官方给出的答案，我理解了后照葫芦画瓢写了一遍
//这道DP题如果不看解析我觉得我做不出来，就今天来说。写上日子记录。今天是2021.4.6日
//dp[j]+1>dp[i]证明第一次找到，dp[j]+1==dp[i]代表已经不是第一次找到

public class Solution {
    public int findNumberOfLIS(int[] nums) {
        int len=nums.length;
        if (len<2)
            return len;
        int[] dp=new int[len];
        int[] counts=new int[len];
        Arrays.fill(dp,1);
        Arrays.fill(counts,1);
        for (int i=1;i<len;i++){
            for (int j=0;j<i;j++){
                if (nums[i]>nums[j]){

                    if (dp[j]+1>dp[i]){
                        dp[i]=Math.max(dp[j]+1,dp[i]);
                        counts[i]=counts[j];
                    }
                    else if(dp[j]+1==dp[i]){
                        counts[i]+=counts[j];
                    }
                }

            }
        }
        int max=0;
        for (int i:dp){
            if (i>max)
                max=i;
        }
        int result=0;
        for (int i=0;i<len;i++){
            if (dp[i]==max)
                result+=counts[i];
        }
        return result;
    }
}
