# 题目(Question)
给定一个整数n，返回n!结果尾数中零的数量

实例：
>`输入: 5`<br>
>`输出: 1`<br>
>`解释：5 x 4 x 3 x 2 x 1 = 120 ,尾数有一个0.`

## 思路
此题看似需要求阶乘，但是其实不用要尾数为0的条件是有5,所以只用算n个数里含有几个5就行了