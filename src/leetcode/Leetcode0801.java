package leetcode;
//面试题08.01.三步问题
// 三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，
// 小孩一次可以上1阶、2阶或3阶。实现一种方法，计算小孩有多少种上楼梯的方式。
// 结果可能很大，你需要对结果模1000000007。

//思路：上n层台阶有三种可能n-3，n-2，n-1
//那上第k层台阶共有k-3，k-2，k-1
//那上第4层台阶共有1,2,3三种

public class Leetcode0801 {
    public static void main(String[] args) {
        System.out.println(waysToStep(61));
    }
    public static int waysToStep(int n) {

        int [] ints=new int[n];

        if (n==1)
            return 1;
        if (n==2)
            return 2;
        if (n==3)
            return 4;
        ints[0]=1;ints[1]=2;ints[2]=4;
        for(int i=3;i<n;i++){
            ints[i]=(ints[i-1]+ints[i-2])%1000000007+ints[i-3];
            ints[i]%=1000000007;
        }
        return ints[n-1]%1000000007;
    }
}
