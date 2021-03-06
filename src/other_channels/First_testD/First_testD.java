package other_channels.First_testD;

import java.io.BufferedInputStream;
import java.util.Scanner;

//统计所有小于非负整数n的质数的数量

//思路：埃氏筛，标记所有不是质数的数。
//注意写埃氏筛的时候如果用乘法会超整形。
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

//            for(int j=i;j*i<=input;j++){
//                booleans[i*j]=true;
//            }
            for(int j=i;j<=input;j=i+j){
                if(j==i)
                    continue;
                booleans[j]=true;
            }
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
