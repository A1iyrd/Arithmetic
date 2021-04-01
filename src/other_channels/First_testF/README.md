# 题目(Question)
求方程：
<a href="https://www.codecogs.com/eqnedit.php?latex=\sum_{i=1}^{R}x_{i}=&space;\textsl{N}" target="_blank">
  <img src="https://latex.codecogs.com/gif.latex?\sum_{i=1}^{R}x_{i}=&space;\textsl{N}" title="\sum_{i=1}^{R}x_{i}= \textsl{N}" />
</a>
的正整数解的个数？

其中1<=i<=r，由于结果可能很大，你可以对结果取余数mod=1000000009

示例：
>`输入：N=10,R=3`<br>
>`输出：35`<br>
>`解释：x1+x2+x3=10 一共有35个解`

## 思路
排列组合

此题为插板，如：当N=10，R=3时 => x1+x2+x3=10

相当于在9个空里插2块板

<a href="https://www.codecogs.com/eqnedit.php?latex=C_{9}^{2}=&space;36" target="_blank"><img src="https://latex.codecogs.com/gif.latex?C_{9}^{2}=&space;36" title="C_{9}^{2}= 36" /></a>

公式为：

<a href="https://www.codecogs.com/eqnedit.php?latex=C_{N-1}^{R-1}=&space;\frac{\prod_{1}^{N-1}}{\prod_{1}^{R-1}\cdot&space;\prod_{R}^{N}}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?C_{N-1}^{R-1}=&space;\frac{\prod_{1}^{N-1}}{\prod_{1}^{R-1}\cdot&space;\prod_{R}^{N}}" title="C_{N-1}^{R-1}= \frac{\prod_{1}^{N-1}}{\prod_{1}^{R-1}\cdot \prod_{R}^{N}}" /></a>

乘起来数字过大，需要mod 1000000009

∵mod的数为质数

∴可以用费马小定理进行求逆元计算

费马小定理公式：

<a href="https://www.codecogs.com/eqnedit.php?latex=a\cdot&space;a^{m-2}\equiv&space;1\left&space;(&space;mod\&space;m&space;\right&space;)" target="_blank"><img src="https://latex.codecogs.com/gif.latex?a\cdot&space;a^{m-2}\equiv&space;1\left&space;(&space;mod\&space;m&space;\right&space;)" title="a\cdot a^{m-2}\equiv 1\left ( mod\ m \right )" /></a>

这里的a就是组合数学公式里的分母，m是1000000009

