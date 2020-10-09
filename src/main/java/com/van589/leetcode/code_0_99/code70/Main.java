package com.van589.leetcode.code_0_99.code70;

/**
 * code70 爬楼梯
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new com.van589.leetcode.code_0_99.code70.Solution().climbStairs(3));
    }
}

class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[3];
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                dp[0] = 1;
                dp[1] = 2;
                int flag = 3;
                int num = 0;
                for (int i = 2; i < n; i++) {
                    dp[i % flag] = dp[(i - 1) % flag] + dp[(i - 2) % flag];
                    num = i % flag;
                }
                return dp[num];
        }
    }
}
