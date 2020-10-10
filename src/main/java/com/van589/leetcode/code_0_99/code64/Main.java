package com.van589.leetcode.code_0_99.code64;

import java.util.Arrays;

/**
 * code64 最小路径和
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        int[][] grid = {{1},{1}};
        System.out.println(new Solution().minPathSum(grid));
    }
}

class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] dp = new int[m];
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == 0) {
                    dp[j] = dp[j] + grid[i][j];
                } else if (i == 0) {
                    dp[j] = dp[j - 1] + grid[i][j];
                } else {
                    dp[j] = grid[i][j] + Math.min(dp[j], dp[j - 1]);
                }
            }
        }
        return dp[m - 1];
    }
}