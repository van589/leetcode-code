package com.van589.leetcode.code_700_799.code764;

/**
 * code746 使用最小花费爬楼梯
 *
 * @author Liang
 */
public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(new Solution().minCostClimbingStairs(numbers));
    }
}

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        if (cost.length == 2) {
            return Math.min(dp[0], dp[1]);
        }
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i], dp[i - 2] + cost[i]);
        }
        return Math.min(dp[cost.length - 2], dp[cost.length - 1]);
    }
}