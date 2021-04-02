# 题目(Question)
尝试估计由曲线
<a href="https://www.codecogs.com/eqnedit.php?latex=\frac{sin&space;x}{x}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\frac{sin&space;x}{x}" title="\frac{sin x}{x}" /></a>
在范围[0,π]上所围成的面积

## 思路
### 思路1(数学积分)



### 思路2(复化矩形算法)

积分的基本定义

### 思路3(蒙特卡罗)

随机N个坐标点 (x,y)

曲线所围成的面积里一共有M个坐标点 

曲线图像如图所示，实际做不需要那么精确，只需知道曲线交于 (0,1),(π,0) 即可

![](https://github.com/A1iyrd/Arithmetic/blob/master/src/other_channels/Second_testB/Monte_Carlo_method.png)

设曲线围成的面积为 I ,框住曲线的矩形面积为S

其中：<a href="https://www.codecogs.com/eqnedit.php?latex=M<&space;N&space;,&space;M\in&space;I" target="_blank"><img src="https://latex.codecogs.com/gif.latex?M<&space;N&space;,&space;M\in&space;I" title="M< N , M\in I" /></a>

那么有：<a href="https://www.codecogs.com/eqnedit.php?latex=\frac{M}{N}=&space;\frac{I}{S}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\frac{M}{N}=&space;\frac{I}{S}" title="\frac{M}{N}= \frac{I}{S}" /></a>



