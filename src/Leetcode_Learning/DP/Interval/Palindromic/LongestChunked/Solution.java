package Leetcode_Learning.DP.Interval.Palindromic.LongestChunked;

public class Solution {
    public int longestDecomposition(String text) {
        int len=text.length();
        int start_head=0;
        int start_rear=0;
        int end_rear=len-1;
        int end_head=len-1;
        int result=0;
        while (start_rear<end_head){
            String s=text.substring(start_head,start_rear);
            String e=text.substring(end_head,end_rear);
            if (!s.equals(e)){
                start_rear++;
                end_head--;
            }
            else {
                result+=2;
                start_rear+=1;
                start_head=start_rear;
                end_head-=1;
                end_rear=end_head;
            }
        }
        if (start_rear!=start_head||start_rear==end_head)
            result+=1;
        return result;
    }
}
