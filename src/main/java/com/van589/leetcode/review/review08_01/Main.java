package com.van589.leetcode.review.review08_01;

/**
 * 面试题 08.01 三步问题
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().waysToStep(61));
    }
}

class Solution {
    public int waysToStep(int n) {
        int[] dp = new int[4];
        switch (n) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            default:
                dp[0] = 1;
                dp[1] = 2;
                dp[2] = 4;
                int flag = 4;
                int num = 0;
                for (int i = 3; i < n; i++) {
                    num = i % flag;
                    dp[num] = dp[(i - 1) % flag] + (dp[(i - 2) % flag] + dp[(i - 3) % flag]) % 1000000007;
                    dp[num] %= 1000000007;
                }
                return dp[num];
        }
        /*int flag = 4;
        int num = 0;
        for (int i = 3; i < n; i++) {
            num = i % flag;
            dp[num] = dp[(i - 1) % flag] + dp[(i - 2) % flag] + dp[(i - 3) % flag];
            dp[num] %= 1000000007;
        }
        return dp[num];*/
    }
}
