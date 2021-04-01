# [统计字典序元音字符串的数目(Count Sorted Vowel Strings)](https://leetcode-cn.com/problems/count-sorted-vowel-strings/)
## 题目(Question)
### 中文
给你一个整数 n，请返回长度为 n 、仅由元音 (a, e, i, o, u) 组成且按 字典序排列 的字符串数量。字符串 s 按 字典序排列 需要满足：对于所有有效的 i，s[i] 在字母表中的位置总是与 s[i+1] 相同或在 s[i+1] 之前。

示例 2：
>`输入：n = 2`<br>
>`输出：15`<br>
>`解释：仅由元音组成的 15 个字典序字符串为
["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"]
注意，"ea" 不是符合题意的字符串，因为 'e' 在字母表中的位置比 'a' 靠后`
### English
Given an integer n, return the number of strings of length n that consist only of vowels (`a`,`e`,`i`,`o`,`u`) and are lexicographically sorted.A string s is lexicographically sorted if for all valid i, s[i] is the same as or comes before s[i+1] in the alphabet.

Example 2:
>`Input: n = 2`<br>
>`Output: 15`<br>
>`Explanation: The 15 sorted strings that consist of vowels only are
["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"].
Note that "ea" is not a valid string since 'e' comes after 'a' in the alphabet.`

