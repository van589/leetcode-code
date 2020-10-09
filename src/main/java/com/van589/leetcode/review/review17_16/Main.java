package com.van589.leetcode.review.review17_16;

/**
 * 面试题 17.16. 按摩师
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        int[] number = {};
        System.out.println(new Solution().massage(number));

    }
}


class Solution {
    public int massage(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[nums.length - 1];
    }
}