package leetcode;

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
