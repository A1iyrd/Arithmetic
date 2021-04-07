package Leetcode_Learning.DP.Simple_Sequence.ClassicLIS.Doll_Envelopes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        //单动归
//        if (envelopes.length == 0) {
//            return 0;
//        }
//
//        int n = envelopes.length;
//        Arrays.sort(envelopes, new Comparator<int[]>() {
//            public int compare(int[] e1, int[] e2) {
//                if (e1[0] != e2[0]) {
//                    return e1[0] - e2[0];
//                } else {
//                    return e2[1] - e1[1];
//                }
//            }
//        });
//
//        int[] f = new int[n];
//        Arrays.fill(f, 1);
//        int ans = 1;
//        for (int i = 1; i < n; ++i) {
//            for (int j = 0; j < i; ++j) {
//                if (envelopes[j][1] < envelopes[i][1]) {
//                    f[i] = Math.max(f[i], f[j] + 1);
//                }
//            }
//            ans = Math.max(ans, f[i]);
//        }
//        return ans;






        //二分+动归
        int len=envelopes.length;
        if (len<2)
            return len;
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]!=o2[0])
                    return o2[0]-o1[0];
                else
                    return o1[1]-o2[1];
            }
        });
        List<Integer> list=new ArrayList<Integer>();
        list.add(envelopes[0][1]);
        for (int i=1;i<len;i++){
            if (envelopes[0][i]>list.get(i-1)){
                list.add(envelopes[0][i]);
            }
            else{
                int index=binarySearch(list,envelopes[0][i]);
                list.set(index,envelopes[0][i]);
            }
        }
        return list.size();
    }
    public int binarySearch(List<Integer> list,int target){
        int l=0;int r=list.size()-1;

        while(l<r){
            int mid=(l+r)/2;
            if (list.get(mid)<target)
                l=mid;
            else
                r=mid;
        }
        return l;
    }
}
