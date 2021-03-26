package leetcode;

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
