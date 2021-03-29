package other_channels;

import java.io.BufferedInputStream;
import java.util.Scanner;

//一个有名的心里医生会收到源源不断的预约请求，每个预约都可以选择接或不接。
//在每次预约服务之间要有休息时间，因此她不能接受相邻的预约。 给定一个预约请求序列
//替按摩师找到最优的预约集合（总预约时间最长）返回该集合中总的预约时间?
public class First_testD {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(new BufferedInputStream(System.in));
        System.out.print("n=");
        int input=scanner.nextInt();
        boolean[] booleans=new boolean[input+1];//true不是质数，false是质数
        booleans[0]=true;
        booleans[1]=true;
        int count=0;
        long start = System.currentTimeMillis();
        for(int i=2;i<=input;i++){

            if(booleans[i])
                continue;

            for(int j=i;j*i<=input;j++){
                booleans[i*j]=true;
            }
//            for(int j=i;j<=input;j=i+j){
//                if(j==i)
//                    continue;
//                booleans[j]=true;
//            }
        }
        for(boolean b:booleans) {
            if (b==false) {
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("埃氏筛，耗时：" + (end - start) + " ms");
        System.out.println(count);
    }
}
