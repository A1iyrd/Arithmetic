# [可获得的最大点数(Maximum Point You Can Obtain from Cards)](https://leetcode-cn.com/problems/maximum-points-you-can-obtain-from-cards/)
## 题目(Question)
### 中文
几张卡牌 排成一行，每张卡牌都有一个对应的点数。点数由整数数组`ardPoints`给出。每次行动，你可以从行的开头或者末尾拿一张卡牌，最终你必须正好拿 k 张卡牌。你的点数就是你拿到手中的所有卡牌的点数之和。给你一个整数数组 cardPoints 和整数 k，请你返回可以获得的最大点数。

示例 1：
>`输入：cardPoints = [1,2,3,4,5,6,1], k = 3`<br>
>`输出：12`<br>
>`解释：第一次行动，不管拿哪张牌，你的点数总是 1 。但是，先拿最右边的卡牌将会最大化你的可获得点数。最优策略是拿右边的三张牌，最终点数为 1 + 6 + 5 = 12 。`
### English
There are several cards arranged in a row, and each card has an associated number of points The points are given in the integer array cardPoints.In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.Your score is the sum of the points of the cards you have taken.Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

Example 1:
>`Input: cardPoints = [1,2,3,4,5,6,1], k = 3`<br>
>`Output: 12`<br>
>`Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.`
