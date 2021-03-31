package other_channels;

import java.io.BufferedInputStream;
import java.util.Scanner;

//一个有名的心里医生会收到源源不断的预约请求，每个预约都可以选择接或不接。
//在每次预约服务之间要有休息时间，因此她不能接受相邻的预约。 给定一个预约请求序列
//替按摩师找到最优的预约集合（总预约时间最长）返回该集合中总的预约时间?

//输入：2, 7, 8, 3, 1
//输出：11

//输入：2, 1, 4, 5, 3, 1, 1, 3
//输出：12

//思路：动态规划
//一个数[i]选不选，因为不能相邻，所以要比较[i]+[i-2]和[i-1]的大小关系
//并记录他们的最大值

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
