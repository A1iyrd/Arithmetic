package Leetcode_Learning.DP.Simple_Sequence.HouseRobber.HouseRobberII;

public class Solution {
    public int rob(int[] nums) {
        int len=nums.length;
        if (len==1)
            return nums[0];
        int[] dp_1=new int[len];
        int[] dp_Not1=new int[len];
        dp_1[0]=nums[0];
        dp_Not1[0]=dp_Not1[0];
        int result=Math.max(dp_1[0],dp_Not1[0]);
        if (len==3){
            result=Math.max(result,nums[2]);
        }
        for (int i=3;i<len;i++){
            int max_sub2=0;
            int max_sub3=0;
            if (i==len-1){
                dp_Not1[i]=nums[i]+Math.max(dp_Not1[i-2],dp_Not1[i-3]);
                result=Math.max(dp_Not1[i],result);
            }
            if (dp_1[i-2]+dp_1[i-3]==Math.max(dp_1[i-2]+dp_1[i-3],dp_Not1[i-2]+dp_Not1[i-3])){
                dp_1[i]=nums[i]+dp_1[i-2]+dp_1[i-3];
                result=Math.max(dp_1[i],result);
            }
            else {
                dp_Not1[i] = nums[i] + dp_1[i - 2] + dp_1[i - 3];
                result=Math.max(dp_Not1[i],result);
            }
        }
        return result;
    }
}
