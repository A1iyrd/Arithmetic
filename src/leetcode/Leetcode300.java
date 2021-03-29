package leetcode;

import java.util.Arrays;

public class Leetcode300 {
    public static void main(String[] args) {
        //10,9,2,5,3,7,101,18 4
        //0,1,0,3,2,3  4
        //7,7,7,7,7    1
        int[] nums=new int[]{0,1,0,3,2,3};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums) {
//        int len=nums.length;
//        if (len<2){
//            return len;
//        }
//        int[] dp=new int[len];
//        Arrays.fill(dp,1);
//        int result=dp[0];
//        for (int i=1;i<len;i++){
//            for (int j=0;j<i;j++){
//                if(nums[i]>nums[j])
//                    dp[i]=Math.max(dp[j]+1,dp[i]);
//            }
//            result=Math.max(result,dp[i]);
//        }
//        return result;
        int maxL = 0;
        int[] dp = new int[nums.length];
        for(int num : nums) {
            // 二分法查找, 也可以调用库函数如binary_search
            int lo = 0, hi = maxL;
            while(lo < hi) {
                int mid = lo+(hi-lo)/2;
                if(dp[mid] < num)
                    lo = mid+1;
                else
                    hi = mid;
            }
            dp[lo] = num;
            if(lo == maxL)
                maxL++;
        }
        return maxL;
    }
}
