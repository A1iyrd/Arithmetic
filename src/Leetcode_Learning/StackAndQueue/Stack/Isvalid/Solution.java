package Leetcode_Learning.StackAndQueue.Stack.Isvalid;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack();
        char[] chars=s.toCharArray();
        for (char c:chars){
            if (c=='(')
                stack.push(')');
            else if (c=='[')
                stack.push(']');
            else if (c=='{')
                stack.push('}');
            else if (stack.isEmpty()||stack.pop()!=c){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
