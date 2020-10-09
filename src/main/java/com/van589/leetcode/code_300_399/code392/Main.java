package com.van589.leetcode.code_300_399.code392;

/**
 * code392 判断子序列
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().isSubsequence("", "ahbgdc"));
    }
}

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isBlank()) {
            return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int flag = 0;
        for (char value : tChars) {
            if (value == sChars[flag]) {
                flag++;
                if (flag == sChars.length) {
                    return true;
                }
            }
        }
        return false;
    }
}
