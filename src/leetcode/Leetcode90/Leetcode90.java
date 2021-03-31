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
        Arrays.sort(nums);
        int len=nums.length;
        List<Integer> integerList = new ArrayList<>();
        String[] DP=new String[(int)Math.pow(2,len)];
        for (int i=1;i<DP.length;i++){
            DP[i]=nums[0]+"";
        }
//        for (int i=0;i<nums.length;i++){
//            List<Integer> integerList = new ArrayList<>();
//            for (int j=nums.length-i-1;j<nums.length;j++) {
//                integerList.add(nums[j]);
//            }
//            list.add(integerList);
//        }
        DFS(list,nums,0);
        return list;
    }
    public static void DFS(List list,int[] nums,int i){

    }
}
