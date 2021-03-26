package other_channels;

import java.util.Scanner;

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
