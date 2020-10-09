package com.van589.leetcode.lcp.lcp19;

import java.util.Arrays;

/**
 * LCP 19 秋叶收藏集
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().minimumOperations("yry"));
    }
}

class Solution {
    public int minimumOperations(String leaves) {
        int n = leaves.length();
        int[][] dp = new int[3][n];
        for (int[] ints : dp) {
            Arrays.fill(ints, (int) 1e9);
        }
        dp[0][0] = leaves.charAt(0) == 'r' ? 0 : 1;
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i-1] + (leaves.charAt(i) == 'y' ? 1 : 0);
            dp[1][i] = Math.min(dp[0][i-1], dp[1][i-1]) + (leaves.charAt(i) == 'r' ? 1 : 0);
            dp[2][i] = Math.min(dp[1][i-1], dp[2][i-1]) + (leaves.charAt(i) == 'y' ? 1 : 0);
        }
        return dp[2][n - 1];
    }
}
