package Leetcode_Learning.StackAndQueue.Stack.DailyTemperatures;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] nums={73,74,75,71,69,72,76,73};
        System.out.println(dailyTemperatures(nums));
    }
    public static int[] dailyTemperatures(int[] T) {
        int[] result=new int[T.length];
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }
        return result;
    }
}
