package leetcode.Leetcode1262;


//给你一个整数数组 nums，请你找出并返回能被三整除的元素最大和。

//输入：nums = [3,6,5,1,8]
//输出：18
//解释：选出数字 3, 6, 1 和 8，它们的和是 18（可被 3 整除的最大和）

//输入：nums = [1,2,3,4,4]
//输出：12
//解释：选出数字 1, 3, 4 以及 4，它们的和是 12（可被 3 整除的最大和）。

//思路：动态规划


public class Leetcode1262 {
    public static void main(String[] args) {
        int[] nums=new int[]{3,6,5,1,8};
        System.out.println(maxSumDivThree(nums));
    }
    public static int maxSumDivThree(int[] nums) {
        int[] dp = {0, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int a : nums) {
            int[] dp2 = {0, 0, 0};
            for (int i = 0; i < 3; ++i)
                dp2[(i + a) % 3] = Math.max(dp[(i + a) % 3], dp[i] + a);
            dp = dp2;
        }
        return dp[0];
    }
}
