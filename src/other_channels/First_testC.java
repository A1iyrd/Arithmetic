package other_channels;

import java.io.BufferedInputStream;
import java.util.Scanner;

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
