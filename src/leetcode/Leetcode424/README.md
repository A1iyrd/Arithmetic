# [替换后的最长重复字符(Longest Repeating Character Repalcement)](https://leetcode-cn.com/problems/longest-repeating-character-replacement/)
## 题目(Question)
### 中文
给你一个仅由大写英文字母组成的字符串，你可以将任意位置上的字符替换成另外的字符，总共可最多替换 k 次。在执行上述操作后，找到包含重复字母的最长子串的长度。

注意：字符串长度 和 k 不会超过 104。

示例 1：
>`输入：s = "ABAB", k = 2`<br>
>`输出：4`<br>
>`解释：用两个'A'替换为两个'B',反之亦然。`

示例 2：
>`输入：s = "AABABBA", k = 1`<br>
>`输出：4`<br>
>`解释：将中间的一个'A'替换为'B',字符串变为 "AABBBBA"。
子串 "BBBB" 有最长重复字母, 答案为 4。`
### English
Given a string s that consists of only uppercase English letters, you can perform at most k operations on that string.
In one operation, you can choose any character of the string and change it to any other uppercase English character.
Find the length of the longest sub-string containing all repeating letters you can get after performing the above operations.

Note:
Both the string's length and k will not exceed 104.

Example 1:
>`Input:s = "ABAB", k = 2`<br>
>`Output:4`<br>
>`Explanation:Replace the two 'A's with two 'B's or vice versa.`

Example 2:
>`Input:s = "AABABBA", k = 1`<br>
>`Output:4`<br>
>`Explanation:Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.`
