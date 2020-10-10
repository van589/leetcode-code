package com.van589.leetcode.code_0_99.code5;

/**
 * code5 最长回文子串
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("babad"));
    }
}

class Solution {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String res = "";
        for (int l = 0; l < n; ++l) {
            for (int i = 0; i + l < n; ++i) {
                int j = i + l;
                if (l == 0) {
                    dp[i][j] = true;
                } else if (l == 1) {
                    dp[i][j] = (chars[i] == chars[j]);
                } else {
                    dp[i][j] = (chars[i] == chars[j] && dp[i + 1][j - 1]);
                }
                if (dp[i][j] && l + 1 > res.length()) {
                    res = s.substring(i, i + l + 1);
                }
            }
        }
        return res;
    }
}