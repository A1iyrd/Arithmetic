package leetcode;
//1423.可获得的最大点数
// 几张卡牌 排成一行，每张卡牌都有一个对应的点数。点数由整数数组 cardPoints 给出。
// 每次行动，你可以从行的开头或者末尾拿一张卡牌，最终你必须正好拿 k 张卡牌。
// 你的点数就是你拿到手中的所有卡牌的点数之和。
// 给你一个整数数组 cardPoints 和整数 k，请你返回可以获得的最大点数。

//输入：cardPoints = [1,2,3,4,5,6,1], k = 3
//输出：12
//解释：第一次行动，不管拿哪张牌，你的点数总是 1 。
//但是，先拿最右边的卡牌将会最大化你的可获得点数。最优策略是拿右边的三张牌，最终点数为 1 + 6 + 5 = 12 。

//思路：此题为滑动窗口
//维护一个sum值,sum值为所有数组相加的和
//维护一个cur值,cur值为  （给定数组长度-k）的所有数组值相加，也就是最后留下k个数没有加上去
//最后只用对sum-cur的值进行比较，也就是剩下没有加上去的k个数进行比较，获得其最大值
public class Leetcode1423 {
    public static int maxScore(int[] nums, int k) {
        int n = nums.length, len = n - k;
        int sum = 0, cur = 0;
        for (int i = 0; i < n; i++) sum += nums[i];
        for (int i = 0; i < len; i++) cur += nums[i];
        int min = cur;
        for (int i = len; i < n; i++) {
            cur = cur + nums[i] - nums[i - len];
            min = Math.min(min, cur);
        }
        return sum - min;
    }

    public static void main(String[] args) {
        int[] ints=new int[]{1,2,3,4,5,6,1};
        System.out.println(maxScore(ints,3));
    }
}
