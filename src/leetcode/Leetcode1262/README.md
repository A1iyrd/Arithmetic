# [可被三整除的最大和(Greatest Sum Divisible by Three)](https://leetcode-cn.com/problems/greatest-sum-divisible-by-three/)
## 题目 (Question)
### 中文
给你一个整数数组 nums，请你找出并返回能被三整除的元素最大和。

示例 1：

>`输入：nums = [3,6,5,1,8]`<br>
>`输出：18`<br>
>`解释：选出数字 3, 6, 1 和 8，它们的和是 18（可被 3 整除的最大和）。`

示例 2：

>`输入：nums = [4]`<br>
>`输出：0`<br>
>`解释：4 不能被 3 整除，所以无法选出数字，返回 0。`

示例 3：

>`输入：nums = [1,2,3,4,4]`<br>
>`输出：12`<br>
>`解释：选出数字 1, 3, 4 以及 4，它们的和是 12（可被 3 整除的最大和）。`
### English
Given an array nums of integers, we need to find the maximum possible sum of elements of the array such that it is divisible by three.

Example 1:
>`Input: nums = [3,6,5,1,8]`<br>
>`Output: 18`<br>
>`Explanation: Pick numbers 3, 6, 1 and 8 their sum is 18 (maximum sum divisible by 3).`

Example 2:
>`Input: nums = [4]`<br>
>`Output: 0`<br>
>`Explanation: Since 4 is not divisible by 3, do not pick any number.`

Example 3:
>`Input: nums = [1,2,3,4,4]`<br>
>`Output: 12`<br>
>`Explanation: Pick numbers 1, 3, 4 and 4 their sum is 12 (maximum sum divisible by 3)`
