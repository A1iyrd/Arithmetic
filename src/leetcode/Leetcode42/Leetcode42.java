package leetcode.Leetcode42;

import java.util.Arrays;
import java.util.Stack;

public class Leetcode42 {
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
    public static int trap(int[] height) {
        int result=0;
        int max=0;
        for (int i=0;i<height.length;i++){
            max=Math.max(max,height[i]);
        }
        for (int i=1;i<=max;i++){
            
        }
        return result;
    }
//public static void main(String[] args) {
//    int []height= {0,1,0,2,1,0,1,3,2,1,2,1};
//    trap(height);
//}
//    public static  int trap(int[] height) {
//        int []max_right=getRightMax(height);
//        int max_left=0;
//        int vol=0;
//        for(int i=0;i<height.length; i++){
//            int temp=Math.min(max_left,max_right[i])-height[i];
//            if(temp>0){
//                vol+=temp;
//            }
//            if(height[i]>max_left){
//                max_left=height[i];
//            }
//        }
//        return vol;
//    }
//    private static int[] getRightMax(int[] height){   //求每个点右边的最大值
//        int []max_right=new int[height.length];
//        for(int i=height.length - 1; i>=0;i--){
//            if(i==height.length - 1){
//                max_right[i]=0;
//            } else{
//                if(height[i+1]>max_right[i+1]){
//                    max_right[i]=height[i+1];
//                } else{
//                    max_right[i]=max_right[i+1];
//                }
//            }
//        }
//        return max_right;
//    }
}
