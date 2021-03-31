package leetcode.Leetcode_Offer63;

import java.util.Arrays;

public class Leetcode_Offer63 {
    public static void main(String[] args) {
        //7,1,5,3,6,4
        int[] nums=new int[]{7,6,4,3,1};
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit(int[] prices) {
        int len=prices.length;
        if (len<2)
            return 0;
        int max=0;
        int min=prices[0];
        for (int i=1;i<len;i++){
//            for (int j=0;j<i;j++){
//                if(prices[i]>prices[j])
//                    result=Math.max(result,prices[i]-prices[j]);
//            }
            max=Math.max(max,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return max;
    }
}
