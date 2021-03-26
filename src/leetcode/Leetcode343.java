package leetcode;
//343.整数拆分
// 给定一个正整数 n，将其拆分为至少两个正整数的和，
// 并使这些整数的乘积最大化。 返回你可以获得的最大乘积。

//输入: 2
//输出: 1
//解释: 2 = 1 + 1, 1 × 1 = 1。

//输入: 10
//输出: 36
//解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。

//思路：4 = 3 x 1 , 5 = 3 x 2, 6 = 3 x 3
//7 = 3 x 2 x 2(2 X 2可以写成4) 8 = 3 x 3 x 2
//根据规律，如果想要乘积最大。只需要把输出的n%3，判断有多少个3相乘
//n%3==1时，会少一个3，多一个2 x 2也就是4，
//n%3==2时 最后会剩一个2
//n%3==0时 全为3
//考虑特殊情况n==2和n==3的时候
//写一个快速幂加快指数计算的速度

public class Leetcode343 {
    public static void main(String[] args) {
        System.out.println(integerBreak(3));
    }
    public static int integerBreak(int n) {
        int tn;
        int total=1;
        if(n==2)
            return 1;
        if(n==3)
            return 2;
        if(n%3==1){
            tn=n/3-1;
            return fastPow(3,tn)*4;
        }
        tn=n/3;
        total=fastPow(3,tn);
        if(n%3==2)
            return total*2;
        return total;
    }
    public static int fastPow(int ds,int zs){
        int result = 1;
        while (zs>0) {
            if (zs % 2 != 0) {
                result = ds*result;
            }
            ds=ds*ds;
            zs=zs>>1;
        }
        return result;
    }
}
