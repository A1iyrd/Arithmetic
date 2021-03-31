package leetcode.Leetcode300;

import java.util.Arrays;

//给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
//子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。
//例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。

//输入：nums = [10,9,2,5,3,7,101,18]
//输出：4
//解释：最长递增子序列是 [2,3,7,101]，因此长度为 4 。

//输入：nums = [7,7,7,7,7,7,7]
//输出：1

//思路：动态规划（DP）

//此题做于2021.3.29日，我自己并没有做出来，只能给出别人的答案。

//时间复杂度（n^2）的解法:
//创建一个DP数组，初始化值设为1。
//遍历数组，进行比较，如果后面的值大于前面的值，在相对应的DP数组里加一
//例如nums={0,1,0,3,2,3} DP={1,1,1,1,1,1},result=1
//[1]>[0] , DP[1]=Max( [0]+1,[1] )=Max(2,1)=2 , DP={1,2,1,1,1,1}
//[3]>[0] , DP[3]=Max( [0]+1,[3] )=Max(2,1)=2 , DP={1,2,1,2,1,1}
//[3]>[1] , DP[3]=Max( [1]+1,[3] )=Max(3,2)=3 , DP={1,2,1,3,1,1}
//[3]>[2] , DP[3]=Max( [2]+1,[3] )=Max(2,3)=3 , DP={1,2,1,3,1,1}
//......
//DP的每个值，记录的就是当前的nums的下标值，大于前面的几个数，并对值进行记录。
//当后边的值又大于这个值，就会在这个值得DP上加。
public class Leetcode300 {
    public static void main(String[] args) {
        //10,9,2,5,3,7,101,18 4
        //0,1,0,3,2,3  4
        //7,7,7,7,7    1
        int[] nums=new int[]{0,1,0,3,2,3};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums) {
        int len=nums.length;
        if (len<2){
            return len;
        }
        int[] dp=new int[len];
        Arrays.fill(dp,1);
        int result=dp[0];
        for (int i=1;i<len;i++){
            for (int j=0;j<i;j++){
                if(nums[i]>nums[j])
                    dp[i]=Math.max(dp[j]+1,dp[i]);
            }
            result=Math.max(result,dp[i]);
        }
        return result;
//        int maxL = 0;
//        int[] dp = new int[nums.length];
//        for(int num : nums) {
//            // 二分法查找, 也可以调用库函数如binary_search
//            int lo = 0, hi = maxL;
//            while(lo < hi) {
//                int mid = lo+(hi-lo)/2;
//                if(dp[mid] < num)
//                    lo = mid+1;
//                else
//                    hi = mid;
//            }
//            dp[lo] = num;
//            if(lo == maxL)
//                maxL++;
//        }
//        return maxL;
    }
}
