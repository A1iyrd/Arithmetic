package Leetcode_Learning.DP.Simple_Sequence.MaxSubarray.CirMaxSubarray;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public int maxSubarraySumCircular(int[] A) {

        int len=A.length;
        if (len==1)
            return A[0];
        int[] notCircle=new int[len];
        int[] result_Circle=new int[len];

        int circle=A[0]+A[len-1];

        notCircle[0]=A[0];
        int result=Math.max(result_Circle[0],notCircle[0]);



        for (int i=1,j=len-2;i<len;i++,j--){
            int c=circle;
            notCircle[i]=Math.max(A[i],A[i]+notCircle[i-1]);
            if (i<j){
                result_Circle[i]=A[i]+result_Circle[i-1];
                result_Circle[j]=A[j]+result_Circle[j+1];

                c=Math.max(c,c+result_Circle[i]);
                c=Math.max(c,c+result_Circle[j]);
            }
            result=Math.max(Math.max(notCircle[i],c),result);
        }


        return result;
    }


}
