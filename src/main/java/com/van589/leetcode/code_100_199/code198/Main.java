package com.van589.leetcode.code_100_199.code198;

/**
 * code198 打家劫舍
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = {2};
        System.out.println(new Solution().rob(numbers));
    }
}

class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if (nums.length == 0) {
            return 0;
        }
        dp[0] = nums[0];
        if (nums.length == 1) {
            return dp[0];
        }
        dp[1] = Math.max(nums[1], nums[0]);
        if (nums.length == 2) {
            return dp[1];
        }
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[nums.length - 1];
    }
}