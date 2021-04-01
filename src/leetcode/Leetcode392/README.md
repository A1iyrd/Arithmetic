# [判断子序列(is Subsequence)](https://leetcode-cn.com/problems/is-subsequence/)
## 题目(Question)
### 中文
给定字符串 s 和 t ，判断 s 是否为 t 的子序列。<br>
字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。

进阶：<br>
如果有大量输入的 S，称作 S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？

示例 1：
>`输入：s = "abc", t = "ahbgdc"`<br>
>`输出：true`

示例 2：
>`输入：s = "axc", t = "ahbgdc"`<br>
>`输出：false`
### English
Given two strings s and t, check if s is a subsequence of t.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
>`Input: s = "abc", t = "ahbgdc"`<br>
>`Output: true`

Example 2:
>`Input: s = "axc", t = "ahbgdc"`<br>
>`Output: false`
