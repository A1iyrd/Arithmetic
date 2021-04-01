# 题目(Question)
田野里的蔬菜排列成矩阵，他们的x和y坐标均是1-99的整数。求当三角形的三点坐标分别为（1.5，1.5）（1.5，6.8）（6.8，1.5）和（10.7，6.9）（8.5，1.5）（14.5，1.5）的时候统计该三角形内部(包括边界)共有多少个蔬菜？

## 思路(此题为数学题)

### 思路1：

海伦公式:
>`p=(a+b+c)/2`<br>
>
>`S=√p(p-a)(p-b)(p-c)`

### 思路2：

>`设三角形内的点p `
>
>`∴S△abc=S△abp+S△acp+S△bcp `
>
>`S△abc将一个点看作坐标原点 `
>
>`∴a(0,0),b(x1,y1),c(x2,y2)  `
>
>`用向量表示三角形面积，最后带入坐标，得到公式 `

<a href="https://www.codecogs.com/eqnedit.php?latex=\textsl{S}\triangle&space;\textsl{abc}=&space;\frac{1}{2}\left&space;|&space;\textsl{x}_{1}\textsl{y}_{2}-\textsl{x}_{2}\textsl{y}_{1}\right&space;|" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\textsl{S}\triangle&space;\textsl{abc}=&space;\frac{1}{2}\left&space;|&space;\textsl{x}_{1}\textsl{y}_{2}-\textsl{x}_{2}\textsl{y}_{1}\right&space;|" title="\textsl{S}\triangle \textsl{abc}= \frac{1}{2}\left | \textsl{x}_{1}\textsl{y}_{2}-\textsl{x}_{2}\textsl{y}_{1}\right |" /></a>

#### 数学推导

<a href="https://www.codecogs.com/eqnedit.php?latex=\textsl{S}\triangle&space;\textsl{abc}=&space;\frac{1}{2}&space;\left&space;|&space;\vec{AB}&space;\right&space;|&space;\cdot&space;\left&space;|&space;\vec{AC}&space;\right&space;|\textsl{sin}&space;\alpha" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\textsl{S}\triangle&space;\textsl{abc}=&space;\frac{1}{2}&space;\left&space;|&space;\vec{AB}&space;\right&space;|&space;\cdot&space;\left&space;|&space;\vec{AC}&space;\right&space;|\textsl{sin}&space;\alpha" title="\textsl{S}\triangle \textsl{abc}= \frac{1}{2} \left | \vec{AB} \right | \cdot \left | \vec{AC} \right |\textsl{sin} \alpha" /></a>

<a href="https://www.codecogs.com/eqnedit.php?latex=\textsl{S}\triangle&space;\textsl{abc}=&space;\frac{1}{2}&space;\left&space;|&space;\vec{AB}&space;\right&space;|&space;\cdot&space;\left&space;|&space;\vec{AC}&space;\right&space;|\sqrt{1-cos^{2}\alpha&space;}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\textsl{S}\triangle&space;\textsl{abc}=&space;\frac{1}{2}&space;\left&space;|&space;\vec{AB}&space;\right&space;|&space;\cdot&space;\left&space;|&space;\vec{AC}&space;\right&space;|\sqrt{1-cos^{2}\alpha&space;}" title="\textsl{S}\triangle \textsl{abc}= \frac{1}{2} \left | \vec{AB} \right | \cdot \left | \vec{AC} \right |\sqrt{1-cos^{2}\alpha }" /></a>


<a href="https://www.codecogs.com/eqnedit.php?latex=\because&space;\textsl{cos}\alpha&space;=&space;\frac{\vec{AB}\cdot&space;\vec{AC}}{\left&space;|&space;\vec{AB}&space;\right&space;|\cdot&space;\left&space;|&space;\vec{AC}&space;\right&space;|}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\because&space;\textsl{cos}\alpha&space;=&space;\frac{\vec{AB}\cdot&space;\vec{AC}}{\left&space;|&space;\vec{AB}&space;\right&space;|\cdot&space;\left&space;|&space;\vec{AC}&space;\right&space;|}" title="\because \textsl{cos}\alpha = \frac{\vec{AB}\cdot \vec{AC}}{\left | \vec{AB} \right |\cdot \left | \vec{AC} \right |}" /></a>

<a href="https://www.codecogs.com/eqnedit.php?latex=\therefore&space;\textsl{S}\triangle&space;\textsl{abc}=&space;\frac{1}{2}\sqrt{\left&space;|&space;\vec{AB}&space;\right&space;|^{2}\cdot&space;\left&space;|&space;\vec{AC}&space;\right&space;|^{2}-\vec{AB}^{2}\cdot&space;\vec{AC}^{2}}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\therefore&space;\textsl{S}\triangle&space;\textsl{abc}=&space;\frac{1}{2}\sqrt{\left&space;|&space;\vec{AB}&space;\right&space;|^{2}\cdot&space;\left&space;|&space;\vec{AC}&space;\right&space;|^{2}-\vec{AB}^{2}\cdot&space;\vec{AC}^{2}}" title="\therefore \textsl{S}\triangle \textsl{abc}= \frac{1}{2}\sqrt{\left | \vec{AB} \right |^{2}\cdot \left | \vec{AC} \right |^{2}-\vec{AB}^{2}\cdot \vec{AC}^{2}}" /></a>

<font>带入坐标点 a (0,0) , b (x1,y1) , c (x2,y2)</font>

得到:

<a href="https://www.codecogs.com/eqnedit.php?latex=\textsl{S}\triangle&space;\textsl{abc}=&space;\frac{1}{2}\left&space;|&space;\textsl{x}_{1}\textsl{y}_{2}-\textsl{x}_{2}\textsl{y}_{1}\right&space;|" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\textsl{S}\triangle&space;\textsl{abc}=&space;\frac{1}{2}\left&space;|&space;\textsl{x}_{1}\textsl{y}_{2}-\textsl{x}_{2}\textsl{y}_{1}\right&space;|" title="\textsl{S}\triangle \textsl{abc}= \frac{1}{2}\left | \textsl{x}_{1}\textsl{y}_{2}-\textsl{x}_{2}\textsl{y}_{1}\right |" /></a>
