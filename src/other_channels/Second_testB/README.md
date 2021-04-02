# 题目(Question)
尝试估计由曲线
<a href="https://www.codecogs.com/eqnedit.php?latex=\frac{sin&space;x}{x}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\frac{sin&space;x}{x}" title="\frac{sin x}{x}" /></a>
在范围[0,π]上所围成的面积

## 思路
### 思路1(数学积分)
因本人才疏学浅，无法导出其定积分，但可以推出其广义积分

<a href="https://www.codecogs.com/eqnedit.php?latex=I=&space;\int_{-\infty&space;}^{&plus;\infty&space;}\frac{sinx}{x}{\mathrm{d}&space;x}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?I=&space;\int_{-\infty&space;}^{&plus;\infty&space;}\frac{sinx}{x}{\mathrm{d}&space;x}" title="I= \int_{-\infty }^{+\infty }\frac{sinx}{x}{\mathrm{d} x}" /></a>

广义积分推导：

<a href="https://www.codecogs.com/eqnedit.php?latex=I=&space;\int_{-\infty&space;}^{0}\frac{sinx}{x}{\mathrm{d}&space;x}&plus;\int_{0&space;}^{&plus;\infty}\frac{sinx}{x}{\mathrm{d}&space;x}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?I=&space;\int_{-\infty&space;}^{0}\frac{sinx}{x}{\mathrm{d}&space;x}&plus;\int_{0&space;}^{&plus;\infty}\frac{sinx}{x}{\mathrm{d}&space;x}" title="I= \int_{-\infty }^{0}\frac{sinx}{x}{\mathrm{d} x}+\int_{0 }^{+\infty}\frac{sinx}{x}{\mathrm{d} x}" /></a>

构造函数(拉普拉斯变换)

<a href="https://www.codecogs.com/eqnedit.php?latex=F\left&space;(&space;s&space;\right&space;)=\int_{0&space;}^{&plus;\infty}\frac{sinx}{x}{\mathrm{d}&space;x}=&space;\int_{0&space;}^{&plus;\infty}\frac{sinx}{x}e^{-sx}{\mathrm{d}&space;x}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?F\left&space;(&space;s&space;\right&space;)=\int_{0&space;}^{&plus;\infty}\frac{sinx}{x}{\mathrm{d}&space;x}=&space;\int_{0&space;}^{&plus;\infty}\frac{sinx}{x}e^{-sx}{\mathrm{d}&space;x}" title="F\left ( s \right )=\int_{0 }^{+\infty}\frac{sinx}{x}{\mathrm{d} x}= \int_{0 }^{+\infty}\frac{sinx}{x}e^{-sx}{\mathrm{d} x}" /></a>

当 s = 0 时

<a href="https://www.codecogs.com/eqnedit.php?latex=F\left&space;(&space;0&space;\right&space;)=\frac{1}{2}I" target="_blank"><img src="https://latex.codecogs.com/gif.latex?F\left&space;(&space;0&space;\right&space;)=\frac{1}{2}I" title="F\left ( 0 \right )=\frac{1}{2}I" /></a>

对 F(s) 求导

<a href="https://www.codecogs.com/eqnedit.php?latex={F}'\left&space;(&space;s&space;\right&space;)=-\int_{0}^{&plus;\infty&space;}sinx\cdot&space;e^{-sx}{\mathrm{d}&space;x}=&space;\frac{1}{s}\int_{0}^{&plus;\infty&space;}sinx&space;\&space;{\mathrm{d}e^{-sx}}\\&space;=\frac{1}{s}\left&space;[&space;sinx\cdot&space;e^{-sx}\mid&space;_{0}^{&plus;\infty&space;}-\int_{0}^{&plus;\infty&space;}e^{-sx}{\mathrm{d}sinx}\right&space;]\\&space;=&space;-\frac{1}{s}\int_{0}^{&plus;\infty&space;}cosx\cdot&space;e^{-sx}{\mathrm{d}&space;x}\\&space;=\frac{1}{s^{2}}\left&space;[&space;cosx\cdot&space;e^{-sx}\mid&space;_{0}^{&plus;\infty&space;}-\int_{0}^{&plus;\infty&space;}e^{-sx}&space;{\mathrm{d}cosx}\right&space;]\\&space;=\frac{1}{s^{2}}\left&space;[&space;\int_{0}^{&plus;\infty&space;}sinx\cdot&space;e^{-sx}{\mathrm{d}&space;x}-1&space;\right&space;]" target="_blank"><img src="https://latex.codecogs.com/gif.latex?{F}'\left&space;(&space;s&space;\right&space;)=-\int_{0}^{&plus;\infty&space;}sinx\cdot&space;e^{-sx}{\mathrm{d}&space;x}=&space;\frac{1}{s}\int_{0}^{&plus;\infty&space;}sinx&space;\&space;{\mathrm{d}e^{-sx}}\\&space;=\frac{1}{s}\left&space;[&space;sinx\cdot&space;e^{-sx}\mid&space;_{0}^{&plus;\infty&space;}-\int_{0}^{&plus;\infty&space;}e^{-sx}{\mathrm{d}sinx}\right&space;]\\&space;=&space;-\frac{1}{s}\int_{0}^{&plus;\infty&space;}cosx\cdot&space;e^{-sx}{\mathrm{d}&space;x}\\&space;=\frac{1}{s^{2}}\left&space;[&space;cosx\cdot&space;e^{-sx}\mid&space;_{0}^{&plus;\infty&space;}-\int_{0}^{&plus;\infty&space;}e^{-sx}&space;{\mathrm{d}cosx}\right&space;]\\&space;=\frac{1}{s^{2}}\left&space;[&space;\int_{0}^{&plus;\infty&space;}sinx\cdot&space;e^{-sx}{\mathrm{d}&space;x}-1&space;\right&space;]" title="{F}'\left ( s \right )=-\int_{0}^{+\infty }sinx\cdot e^{-sx}{\mathrm{d} x}= \frac{1}{s}\int_{0}^{+\infty }sinx \ {\mathrm{d}e^{-sx}}\\ =\frac{1}{s}\left [ sinx\cdot e^{-sx}\mid _{0}^{+\infty }-\int_{0}^{+\infty }e^{-sx}{\mathrm{d}sinx}\right ]\\ = -\frac{1}{s}\int_{0}^{+\infty }cosx\cdot e^{-sx}{\mathrm{d} x}\\ =\frac{1}{s^{2}}\left [ cosx\cdot e^{-sx}\mid _{0}^{+\infty }-\int_{0}^{+\infty }e^{-sx} {\mathrm{d}cosx}\right ]\\ =\frac{1}{s^{2}}\left [ \int_{0}^{+\infty }sinx\cdot e^{-sx}{\mathrm{d} x}-1 \right ]" /></a>

<a href="https://www.codecogs.com/eqnedit.php?latex=\because&space;{F}'\left&space;(&space;s&space;\right&space;)=-\int_{0}^{&plus;\infty&space;}sinx\cdot&space;e^{-sx}{\mathrm{d}&space;x}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\because&space;{F}'\left&space;(&space;s&space;\right&space;)=-\int_{0}^{&plus;\infty&space;}sinx\cdot&space;e^{-sx}{\mathrm{d}&space;x}" title="\because {F}'\left ( s \right )=-\int_{0}^{+\infty }sinx\cdot e^{-sx}{\mathrm{d} x}" /></a>

<a href="https://www.codecogs.com/eqnedit.php?latex=\therefore&space;{F}'\left&space;(&space;s&space;\right&space;)=-\frac{1}{1&plus;s^{2}}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\therefore&space;{F}'\left&space;(&space;s&space;\right&space;)=-\frac{1}{1&plus;s^{2}}" title="\therefore {F}'\left ( s \right )=-\frac{1}{1+s^{2}}" /></a>

<a href="https://www.codecogs.com/eqnedit.php?latex=\therefore&space;F\left&space;(&space;s&space;\right&space;)=-arctans&plus;C" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\therefore&space;F\left&space;(&space;s&space;\right&space;)=-arctans&plus;C" title="\therefore F\left ( s \right )=-arctans+C" /></a>

<a href="https://www.codecogs.com/eqnedit.php?latex=\because&space;\lim_{s\rightarrow&space;&plus;\infty&space;}F\left&space;(&space;s&space;\right&space;)=&space;0" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\because&space;\lim_{s\rightarrow&space;&plus;\infty&space;}F\left&space;(&space;s&space;\right&space;)=&space;0" title="\because \lim_{s\rightarrow +\infty }F\left ( s \right )= 0" /></a>

<a href="https://www.codecogs.com/eqnedit.php?latex=\therefore&space;C=\frac{\pi&space;}{2}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\therefore&space;C=\frac{\pi&space;}{2}" title="\therefore C=\frac{\pi }{2}" /></a>

<a href="https://www.codecogs.com/eqnedit.php?latex=\because&space;F\left&space;(&space;0&space;\right&space;)=&space;\frac{1}{2}I" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\because&space;F\left&space;(&space;0&space;\right&space;)=&space;\frac{1}{2}I" title="\because F\left ( 0 \right )= \frac{1}{2}I" /></a>

<a href="https://www.codecogs.com/eqnedit.php?latex=\therefore&space;I=\pi" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\therefore&space;I=\pi" title="\therefore I=\pi" /></a>


### 思路2(复化矩形算法)

积分的定义

把围成的面积分成无穷多个矩形的和 ， △x -> 0

缺点：因为要趋近于0，x值需要取很小，需要运行很长时间。

### 思路3(蒙特卡罗)

随机N个坐标点 (x,y)

曲线所围成的面积里一共有M个坐标点 

曲线图像如图所示，实际做不需要那么精确，只需知道曲线交于 (0,1),(π,0) 即可

![](https://github.com/A1iyrd/Arithmetic/blob/master/src/other_channels/Second_testB/Monte_Carlo_method.png)

设曲线围成的面积为 I ,框住曲线的矩形面积为S

其中：<a href="https://www.codecogs.com/eqnedit.php?latex=M<&space;N&space;,&space;M\in&space;I" target="_blank"><img src="https://latex.codecogs.com/gif.latex?M<&space;N&space;,&space;M\in&space;I" title="M< N , M\in I" /></a>

那么有：<a href="https://www.codecogs.com/eqnedit.php?latex=\frac{M}{N}=&space;\frac{I}{S}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\frac{M}{N}=&space;\frac{I}{S}" title="\frac{M}{N}= \frac{I}{S}" /></a>



