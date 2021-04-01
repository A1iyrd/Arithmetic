package leetcode.Leetcode1006;

public class Leetcode1006 {
    public static void main(String[] args) {
        System.out.println(clumsy(10));
    }
    public static int clumsy(int N) {
        int number=N/4;
        int remainder=N%4;
        if (N<=2){
            return N;
        }
        if (N==3){
            return 6;
        }
        int sum=N*(N-1)/(N-2)+(N-3);
        N-=4;
        for (int i=1;i<number;i++){
            sum+=(-N*(N-1)/(N-2)+(N-3));
            N-=4;
        }
        if(remainder==2||remainder==1)
            return sum-N;
        if(remainder==3)
            return sum-6;
        return sum;
    }
}
