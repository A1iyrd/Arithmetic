package Leetcode_Learning.DP.Simple_Sequence.Transformation.Fibonacci;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int N = arr.length;
        Set<Integer> S = new HashSet();
        for (int x: arr) S.add(x);

        int ans = 0;
        for (int i = 0; i < N; ++i)
            for (int j = i+1; j < N; ++j) {
                int x = arr[j], y = arr[i] + arr[j];
                int length = 2;
                while (S.contains(y)) {
                    // x, y -> y, x+y
                    int tmp = y;
                    y += x;
                    x = tmp;
                    ans = Math.max(ans, ++length);
                }
            }

        return ans >= 3 ? ans : 0;
    }
}
