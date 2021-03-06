# [等式方程的可满足性(Satisfiability of Equality Equations)](https://leetcode-cn.com/problems/satisfiability-of-equality-equations/)
## 题目(Question)
### 中文
给定一个由表示变量之间关系的字符串方程组成的数组，每个字符串方程 equations[i] 的长度为 4，并采用两种不同的形式之一："a==b" 或 "a!=b"。在这里，a 和 b 是小写字母（不一定不同），表示单字母变量名。

只有当可以将整数分配给变量名，以便满足所有给定的方程时才返回 true，否则返回 false。 

示例 1：
>`输入：["a==b","b!=a"]`<br>
>`输出：false`<br>
>`解释：如果我们指定，a = 1 且 b = 1，那么可以满足第一个方程，但无法满足第二个方程。没有办法分配变量同时满足这两个方程。`

示例 2：
>`输入：["b==a","a==b"]`<br>
>`输出：true`<br>
>`解释：我们可以指定 a = 1 且 b = 1 以满足满足这两个方程。`
### English
Given an array equations of strings that represent relationships between variables, each string equations[i] has length 4 and takes one of two different forms: "a==b" or "a!=b".  Here, a and b are lowercase letters (not necessarily different) that represent one-letter variable names.

Return true if and only if it is possible to assign integers to variable names so as to satisfy all the given equations.

Example 1:
>`Input: ["a==b","b!=a"]`<br>
>`Output: false`<br>
>`Explanation: If we assign say, a = 1 and b = 1, then the first equation is satisfied, but not the second.  There is no way to assign the variables to satisfy both equations.`

Example 2:
>`Input: ["b==a","a==b"]`<br>
>`Output: true`<br>
>`Explanation: We could assign a = 1 and b = 1 to satisfy both equations.`

