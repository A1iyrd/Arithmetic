# [将x减到0的最小操作数(Minimum Operations to Reduce X to Zero)](https://leetcode-cn.com/problems/minimum-operations-to-reduce-x-to-zero/)
## 题目(Question)
### 中文
给你一个整数数组 nums 和一个整数 x 。每一次操作时，你应当移除数组 nums 最左边或最右边的元素，然后从 x 中减去该元素的值。请注意，需要 修改 数组以供接下来的操作使用。

如果可以将 x 恰好 减到 0 ，返回 最小操作数 ；否则，返回 -1 。

示例 1：
>`输入：nums = [1,1,4,2,3], x = 5`<br>
>`输出：2`<br>
>`解释：最佳解决方案是移除后两个元素，将 x 减到 0 。`
### English
You are given an integer array nums and an integer x. In one operation, you can either remove the leftmost or the rightmost element from the array nums and subtract its value from x. Note that this modifies the array for future operations.

Return the minimum number of operations to reduce x to exactly 0 if it's possible, otherwise, return -1.

Example 1:

>`Input: nums = [1,1,4,2,3], x = 5`<br>
>`Output: 2`<br>
>`Explanation: The optimal solution is to remove the last two elements to reduce x to zero.`
