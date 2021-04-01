package leetcode.Leetcode1423;

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
