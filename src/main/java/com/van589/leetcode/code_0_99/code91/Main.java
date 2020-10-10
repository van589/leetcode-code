package com.van589.leetcode.code_0_99.code91;

import java.util.Arrays;

/**
 * code91 解码方法
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().numDecodings("2206"));
    }
}

class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[s.length()] = 1;
        dp[s.length() - 1] = s.charAt(s.length() - 1) == '0' ? 0 : 1;
        for (int i = s.length() - 2; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                continue;
            }
            int num = Integer.parseInt(String.valueOf(s.charAt(i))) * 10 + Integer.parseInt(String.valueOf(s.charAt(i + 1)));
            if (num <= 26) {
                dp[i] = dp[i + 2] + dp[i + 1];
            } else {
                dp[i] = dp[i + 1];
            }
        }
        return dp[0];
    }
}