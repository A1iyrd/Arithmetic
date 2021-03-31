package leetcode.Leetcode1658;

import java.util.Arrays;

//1658.将x减到0的最小操作数
// 给你一个整数数组 nums 和一个整数 x 。
// 每一次操作时，你应当移除数组 nums 最左边或最右边的元素，
// 然后从 x 中减去该元素的值。请注意，需要 修改 数组以供接下来的操作使用。
// 如果可以将 x 恰好 减到 0 ，返回 最小操作数 ；否则，返回 -1 。

//输入：nums = [1,1,4,2,3], x = 5
//输出：2
//解释：最佳解决方案是移除后两个元素，将 x 减到 0 。

//输入：nums = [5,6,7,8,9], x = 4
//输出：-1

//思路：此题为滑动窗口
//维护left,right,currentSum，sum为数组全部值的和
//currentSum加上right所指的数组元素
//判断sum-current的值是否小于给定的x，也就是还没被current加进去的所有数是否小于x
//如果小于，则current减去left所对应的数组的值，并让left+1
//当sum-current等于x时，就与max值进行对比。这里只能取最大值，
//因为我们不知道nums有多长，没法对一开始比较的值进行初始化，
//所以最后返回length-记录的最大值即可

//例子：nums = [1,1,4,2,3], x = 5
//left=0,right=0,sum=11
//一开始，current加上right下标值，current=1，right=1，
//因为现在sum-current=10>5
//一直重复上述操作，
//current=2,right=2,sum-current=9>5
//current=6,right=3,sum-current=5=5
//此时sum-current等于了x，也就是剩下的数加起来刚好为x
// 此时我们记录他们的长度max=right-left为3
//current=8,right=4,sum-current=3<5,此时小于5了。current要减去left的下标值
//current=7,right=4,left=1,sum-current=4<5，还是小于5，继续此操作
//current=6,right=4,left=2,sum-current=5=5,此时等于5了
//出循环，记录right-left=2，小于max。max值仍为3
//接下来就只需right超过数组下标即可返回（数组长度-max），过程不再赘述

public class Leetcode1658 {
    public static void main(String[] args) {
        int[] nums={1,1,4,2,3};
        System.out.println(minOperations(nums,5));
    }
    public static int minOperations(int[] nums, int x) {
        int maxPart = -1;
        int sum = Arrays.stream(nums).sum();
        int currentSum = 0;
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (right < nums.length) {
                currentSum += nums[right++];
            }
            while (currentSum > sum - x && left < nums.length) {
                currentSum -= nums[left++];
            }
            if (currentSum == sum - x) {
                maxPart = Math.max(maxPart, right - left);
            }
        }
        return maxPart == -1 ? -1 : nums.length - maxPart;
    }
}
