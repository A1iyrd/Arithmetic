package leetcode;

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
