package other_channels;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class First_testE {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(new BufferedInputStream(System.in));
        int input=scanner.nextInt();
        int[] times=new int[input];
        for(int i=0;i<input;i++){
            times[i]=scanner.nextInt();
        }
        System.out.println(times_dp(times));
    }
    public static int times_dp(int[] times){
        int[] fmax=new int[times.length];
        fmax[0]=times[0];
        fmax[1]=times[1];
        for(int i=2;i<times.length;i++){
            fmax[i]=Math.max(times[i]+fmax[i-2],fmax[i-1]);
        }
        return fmax[times.length-1];
    }
}
