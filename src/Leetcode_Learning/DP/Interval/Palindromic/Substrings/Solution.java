package Leetcode_Learning.DP.Interval.Palindromic.Substrings;

public class Solution {
    public int countSubstrings(String s) {
        int len=s.length();
        if (len<=1)
            return len;
        int result=0;
        for (int i=0;i<len;i++){
            result+=expandAroundCenter(s,i,i);
            result+=expandAroundCenter(s,i,i+1);
        }
        return result;

    }
    private static int expandAroundCenter(String s,int left,int right){
        int L=left;
        int R=right;
        int count=0;
        while ( L>0 && R<s.length() && s.charAt(L)==s.charAt(R)){
            L--;
            R++;
            count++;
        }
        return count;
    }
}
