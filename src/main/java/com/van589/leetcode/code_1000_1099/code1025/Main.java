package com.van589.leetcode.code_1000_1099.code1025;

/**
 * code1025 除数博弈
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().divisorGame(1000));
    }
}

class Solution {
    public boolean divisorGame(int N) {
        if (N == 1) {
            return false;
        } else if (N == 2) {
            return true;
        }
        boolean[] dp = new boolean[N];
        dp[1] = true;
        for (int i = 2; i < N; i++) {
            dp[i] = !dp[i - 1];
        }
        return dp[N - 1];
    }
}