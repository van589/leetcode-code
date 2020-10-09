package com.van589.leetcode.code_100_199.code119;

import java.util.Arrays;
import java.util.List;

/**
 * code119 杨辉三角 II
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().getRow(1));
    }
}

class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[] dp = new Integer[rowIndex + 1];
        Arrays.fill(dp, 1);
        for (int i = 2; i < dp.length; i++) {
            for (int j = i - 1; j > 0; j--) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return Arrays.asList(dp);
    }
}
