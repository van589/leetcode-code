package com.van589.leetcode.code_100_199.code146;

/**
 * code416 分割等和子集
 *
 * @author hasee
 */
public class Main {
    public static void main(String[] args) {
        int[] num = {1, 5, 11, 5};
        System.out.println(new Solution().canPartition(num));
    }
}

class Solution {
    public boolean canPartition(int[] nums) {
        int target, sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 0) {
            target = sum / 2;
        } else {
            return false;
        }
        boolean[] dp = new boolean[target + 1];

        dp[0] = true;
        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                if (!dp[j]) {
                    dp[j] = dp[j - num];
                }
            }
        }
        return dp[target];
    }
}