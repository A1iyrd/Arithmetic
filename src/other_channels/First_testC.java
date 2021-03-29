package other_channels;

import java.io.BufferedInputStream;
import java.util.Scanner;

//给定一个整数n，返回n!结果尾数中零的数量

//输入: 3
//输出: 0

//输入: 5
//输出: 1
//解释：5 x 4 x 3 x 2 x 1 = 120 ,尾数有一个0.

//思路：此题看似需要求阶乘，但是其实不用
//要尾数为0的条件是有5,所以只用数有几个5就行了
//例如：n=35，35有1个5,30有1个，25有2个5,20有1个5，15有1个5，10有1个5，5有1个5，所以答案为8.

public class First_testC {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(new BufferedInputStream(System.in));
        int input=scanner.nextInt();
        int result=0;
        while (true){
            if(input==0){
                break;
            }
            input=input/5;
            result=result+input;
        }
        System.out.println(result);
    }
}
