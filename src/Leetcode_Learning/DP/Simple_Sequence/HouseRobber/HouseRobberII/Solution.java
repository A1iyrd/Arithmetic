package Leetcode_Learning.DP.Simple_Sequence.HouseRobber.HouseRobberII;

public class Solution {
    public int rob(int[] nums) {
        int len=nums.length;
        if (len==1)
            return nums[0];
        int[] dp_From1=new int[len];
        int[] dp_FromN=new int[len];
        dp_From1[0]=nums[0];
        dp_FromN[len-1]=nums[len-1];
        int result=Math.max(dp_From1[0],dp_FromN[len-1]);

        for (int i=1,j=len-2;i<len-1;i++,j--){
            if (i==1&&j==1){
                result=Math.max(result,nums[i]);
                continue;
            }
            if (i==1){
                dp_From1[i]=nums[i];
                dp_FromN[j]=nums[j];
                continue;
            }
            if (i==2){
                dp_From1[i]=nums[i]+dp_From1[0];
                dp_FromN[j]=nums[j]+dp_FromN[len-1];
                result=Math.max(Math.max(dp_From1[i],dp_FromN[j]),result);
                continue;
            }
            dp_From1[i]=nums[i]+Math.max(dp_From1[i-2],dp_From1[i-3]);
            dp_FromN[j]=nums[j]+Math.max(dp_FromN[j+2],dp_FromN[j+3]);
            result=Math.max(Math.max(dp_From1[i],dp_FromN[j]),result);
        }
        return result;
    }
}
