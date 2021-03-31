package other_channels;

import java.util.Scanner;

//求方程：x1+x2+......+xr=N 的正整数解的个数？
//其中1<=i<=r，由于结果可能很大，你可以对结果取余数mod=1000000009

//输入：N=10,r=3
//输出：35

//输入：N=2000,r=150
//输出：379288615

//思路：排列组合
//注释的部分是我用大数写的，时间复杂度过高，当N超过一定的值得时候，时间会超时


//此题为插板，如N=10，r=3，相当于在9个空里插两块板。也就是 C 2↑ 9↓
//也就是C r-1↑ N-1↓ = (N-1)! / ( (r-1)! * (N-r)! ) 因为除数过大，需要进行乘法的逆元计算
//先用数组保存N-1的所有的阶乘数，因为其他的阶乘都小于N-1，一会儿便于重复使用。
//求逆元：
//费马小定理：a*a^m-2=1(mod m) m=1000000009
//这里的a=( (r-1)! * (N-r)! )
//因为m是质数，那么我们只用求a^m-2，a的逆元也就是a^m-2
//写一个快速幂，加快指数的计算，别忘记了mod 1000000009

public class First_testF {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(new BufferedInputStream(System.in));
//        System.out.print("N=");
//        int N=scanner.nextInt();
//        System.out.print(",r=");
//        int r=scanner.nextInt();
//        long start = System.currentTimeMillis();
//        BigInteger[] bigIntegers=new BigInteger[N+1];
//        BigInteger sum= BigInteger.valueOf(1);
//        for(int i=1;i<=N;i++){
//            sum=sum.multiply(BigInteger.valueOf(i));
//            bigIntegers[i]=sum;
//        }
//        BigInteger chushu=(bigIntegers[r-1].multiply(bigIntegers[N-r]));
//        BigInteger result=bigIntegers[N-1].divide(  chushu  ).mod(BigInteger.valueOf(1000000009));
//        long end = System.currentTimeMillis();
//        System.out.println("耗时：" + (end - start) + " ms");
//        System.out.println(result);
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        int r = inp.nextInt();
        inp.close();
        int mod = 1000000009;
        long[] arr = getValue(N-1,mod);
        long inverse = fastPower(arr[r-1]*arr[N-r]%mod,mod-2,mod);
        long res = arr[N-1]*inverse%mod;
        System.out.println(res);
    }

    public static long[] getValue(int num,int mod){
        long[] res = new long[num+1];
        res[0] = 1;
        for (int i = 1;i<num+1;i++){
            res[i] = res[i-1]*i%mod;
        }
        return res;
    }

    public static long fastPower(long base,long power,long mod){
        long result=1;
        while(power>0) {
            if ((power & 1) == 1) {
                result = result * base % mod;
            }
            power >>= 1;
            base = base * base % mod;
        }
        return result;
    }
}
