package leetcode.Leetcode_Offer63;

//思路：
//第一想法是暴力，也写了出来，但是时间复杂度过高，这里已经注释掉了
//维护max和min两个值，max初始值为0，min初始值为数组第一位值
//max值是局部相差最大值，min是局部最小值
//如 7,4,15,1,10 一开始找到局部min值为4，局部最大相差值max为11
//后面局部最小值为1，最大相差max只有9，与前面进行对比所以max=11
//我们变换这个数组的顺序 7,4,1,15,10,因为4和1中没有比4大的值相隔所以局部最小变成了1

//例子：nums={7,4,15,1,10}
//max=0,min=7
//max=(0,4-7)=0,min=(7,4)=4
//max=(0,15-4)=11,min=(4,15)=4
//max=(11,1-4)=11,min=(4,1)=1
//max=(11,10-1)=11,min=(1,10)=1
public class Leetcode_Offer63 {
    public static void main(String[] args) {
        //7,1,5,3,6
        int[] nums=new int[]{7,4,15,1,10};
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
