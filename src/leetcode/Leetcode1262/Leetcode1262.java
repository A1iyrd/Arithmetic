package leetcode.Leetcode1262;


//思路：动态规划
//dp[0]={0.MIN.MIN}
//dp[0]保存的是相加后%3=0的数，dp[1]保存的是相加后%3=1的数，dp[2]保存的是相加后%3=2的数
//如果余数为0,dp[0]=(dp[0],dp[0]+nums[i]),dp[1]=(dp[1],dp[1]+nums[i]),dp[2]=(dp[2],dp[2]+nums[i])
//如果余数为1,dp[1]=(dp[1],dp[0]+nums[i]),dp[2]=(dp[2],dp[1]+nums[i]),dp[0]=(dp[0],dp[2]+nums[i])
//如果余数为2,dp[2]=(dp[2],dp[0]+nums[i]),dp[0]=(dp[0],dp[1]+nums[i]),dp[1]=(dp[1],dp[2]+nums[i])

//例子：nums = {3,6,5,1,8}
//这里为了方便书写。请把MIN看作负无穷，有界值加负无穷等于负无穷，如：MIN+3=MIN
//dp={0,MIN,MIN}
//以下所以的MIN都是MIN加上一个有界量
//∵3%3=0，∴dp2={(0,0+3),MIN,MIN},dp={3,MIN,MIN}
//∵6%3=0，∴dp2={(3,3+6),MIN,MIN},dp={9,MIN,MIN}
//∵5%3=2，∴dp2={(9,MIN),MIN,(MIN,9+5)},dp={9,MIN,14}
//∵1%3=1，∴dp2={(14,14+1),(MIN,9+1),(14,MIN)},dp={15,10,14}
//∵8%3=2，∴dp2={(15,10+8),(10,14+8),(14,15+8)},dp={18,22,23}
//∴结果为dp[0]=18

//这个解为leetcode上评论的解，过于厉害，看了好几遍才看懂为什么要这么写，只能说自己还是太菜了

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
