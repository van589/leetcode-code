package com.van589.leetcode.code_0_99.code63;

import java.util.Arrays;

/**
 * code63 不同路径 II
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {

        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(new Solution().uniquePathsWithObstacles(obstacleGrid));
    }
}

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid[0].length;
        int n = obstacleGrid.length;
        int[] dp = new int[m];
        dp[0] = obstacleGrid[0][0] == 0 ? 1 : 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j - 1 >= 0 && obstacleGrid[i][j - 1] == 0) {
                    dp[j] = dp[j] + dp[j - 1];
                }
                if (obstacleGrid[i][j] == 1) {
                    dp[j] = 0;
                }
            }
        }
        return dp[m - 1];
    }
}