# [寻找旋转排序数组中的最小值(Find Minimum in Rotated Sorted Array)](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/)
## 题目(Question)
### 中文
已知一个长度为 n 的数组，预先按照升序排列，经由 1 到 n 次 旋转 后，得到输入数组。例如，原数组 nums = [0,1,2,4,5,6,7] 在变化后可能得到：

>若旋转 4 次，则可以得到 [4,5,6,7,0,1,2]<br>
>若旋转 7 次，则可以得到 [0,1,2,4,5,6,7]

注意，数组 [a[0], a[1], a[2], ..., a[n-1]] 旋转一次 的结果为数组 [a[n-1], a[0], a[1], a[2], ..., a[n-2]] 。

给你一个元素值 互不相同 的数组 nums ，它原来是一个升序排列的数组，并按上述情形进行了多次旋转。请你找出并返回数组中的 最小元素 。

示例 1：
>`输入：nums = [3,4,5,1,2]`<br>
>`输出：1`<br>
>`解释：原数组为 [1,2,3,4,5] ，旋转 3 次得到输入数组。`

示例 2：
>`输入：nums = [4,5,6,7,0,1,2]`<br>
>`输出：0`<br>
>`解释：原数组为 [0,1,2,4,5,6,7] ，旋转 4 次得到输入数组。`

### English
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

>`[4,5,6,7,0,1,2] if it was rotated 4 times.`<br>
>`[0,1,2,4,5,6,7] if it was rotated 7 times.`

Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

Example 1:
>`Input: nums = [3,4,5,1,2]`<br>
>`Output: 1`<br>
>`Explanation: The original array was [1,2,3,4,5] rotated 3 times.`

Example 2:
>`Input: nums = [4,5,6,7,0,1,2]`<br>
>`Output: 0`<br>
>`Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.`
