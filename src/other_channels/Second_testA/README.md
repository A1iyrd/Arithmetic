# 题目(Question)
有一类自然数，从左往右的第三个数字开始，每个数字都恰好是它左边两个数字之和，直至不能再写为止，如257,1459等，这类数一共有几个。
## 思路
思路1：DFS

思路2：排列组合

### 数学推导

<a href="https://www.codecogs.com/eqnedit.php?latex=\left\{\begin{matrix}&space;x&plus;y\leq&space;9\\&space;x\geq&space;1\\&space;y\geq&space;0&space;\end{matrix}\right." target="_blank"><img src="https://latex.codecogs.com/gif.latex?\left\{\begin{matrix}&space;x&plus;y\leq&space;9\\&space;x\geq&space;1\\&space;y\geq&space;0&space;\end{matrix}\right." title="\left\{\begin{matrix} x+y\leq 9\\ x\geq 1\\ y\geq 0 \end{matrix}\right." /></a>

令 a = x , b = y + 1 

<a href="https://www.codecogs.com/eqnedit.php?latex=\left\{\begin{matrix}&space;a&plus;b\leq&space;10\\&space;a\geq&space;1\\&space;b\geq&space;0&space;\end{matrix}\right." target="_blank"><img src="https://latex.codecogs.com/gif.latex?\left\{\begin{matrix}&space;a&plus;b\leq&space;10\\&space;a\geq&space;1\\&space;b\geq&space;1&space;\end{matrix}\right." title="\left\{\begin{matrix} a+b\leq 10\\ a\geq 1\\ b\geq 1 \end{matrix}\right." /></a>

加入松弛变量 z

<a href="https://www.codecogs.com/eqnedit.php?latex=\left\{\begin{matrix}&space;a&plus;b&plus;z=&space;10\\&space;a\geq&space;1\\&space;b\geq&space;1&space;\\z\geq&space;0&space;\end{matrix}\right." target="_blank"><img src="https://latex.codecogs.com/gif.latex?\left\{\begin{matrix}&space;a&plus;b&plus;z=&space;10\\&space;a\geq&space;1\\&space;b\geq&space;1&space;\\z\geq&space;0&space;\end{matrix}\right." title="\left\{\begin{matrix} a+b+z= 10\\ a\geq 1\\ b\geq 1 \\z\geq 0 \end{matrix}\right." /></a>

令 c = z + 1 

<a href="https://www.codecogs.com/eqnedit.php?latex=\left\{\begin{matrix}&space;a&plus;b&plus;z=&space;11\\&space;a\geq&space;1\\&space;b\geq&space;1&space;\\z\geq&space;1&space;\end{matrix}\right." target="_blank"><img src="https://latex.codecogs.com/gif.latex?\left\{\begin{matrix}&space;a&plus;b&plus;z=&space;11\\&space;a\geq&space;1\\&space;b\geq&space;1&space;\\z\geq&space;1&space;\end{matrix}\right." title="\left\{\begin{matrix} a+b+z= 11\\ a\geq 1\\ b\geq 1 \\z\geq 1 \end{matrix}\right." /></a>

现在就可以用组合数学进行求解了

相当于10个空插2块板

<a href="https://www.codecogs.com/eqnedit.php?latex=C_{10}^{2}=&space;45" target="_blank"><img src="https://latex.codecogs.com/gif.latex?C_{10}^{2}=&space;45" title="C_{10}^{2}= 45" /></a>
