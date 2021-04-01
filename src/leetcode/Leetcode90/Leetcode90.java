package leetcode.Leetcode90;

import java.util.*;

public class Leetcode90 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,2};

        System.out.println(1<<2);
        System.out.println(subsetsWithDup(nums));
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        Arrays.sort(nums);
        int len=nums.length;

        int[] id=new int[len];
        for (int i=0;i<len;i++){
            id[i]=i;
        }
        list.add(null);
        for (int i=0;i<len;i++){
            int t=1<<i;
            integerList.clear();
            while ( t < (2<<i) ) {
                for (int j=0;j<(1<<i);j++){
                    integerList.add(nums[i]);
//                    if (dp[t]==(dp[j])){
//                        dp[t]=null;
//                        break;
//                    }

                    if (t==1) {
                        list.add(integerList);
                        break;
                    }
                    if (integerList.get(0).equals(list.get(j))){
//                        list.remove(list.size()-1);
                        break;
                    }list.add(integerList);
                }
                t++;
            }
        }

//        for (int i=0;i<nums.length;i++){
//            List<Integer> integerList = new ArrayList<>();
//            for (int j=nums.length-i-1;j<nums.length;j++) {
//                integerList.add(nums[j]);
//            }
//            list.add(integerList);
//        }
        return list;
    }
    public static void DFS(List list,int[] nums,int i){

    }
}
