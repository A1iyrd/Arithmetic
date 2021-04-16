package leetcode.Leetcode159;

import java.util.Collections;
import java.util.HashMap;


public class Leetcode159 {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int len=s.length();
        int left=0;int right=0;
        if (len<3)
            return len;
        int result=2;
        HashMap<Character,Integer> hashMap=new HashMap<>();
        while(right<len){
            if (hashMap.size()<3){
                hashMap.put(s.charAt(right),right);
                right++;
            }
            if (hashMap.size()==3){
                int index= Collections.min(hashMap.values());
                hashMap.remove(s.charAt(index));
                left=index+1;
            }
            result=Math.max(result,right-left);
        }
        return result;
    }
}
