package com.van589.leetcode.code_300_399.code303;

/**
 * code303 区域和检索 - 数组不可变
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        int[] number = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(number);
        System.out.println(numArray.sumRange(0, 5));
    }
}

class NumArray {

    private int[] dp;

    public NumArray(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if (dp == null) {
            return 0;
        }
        if (i == 0) {
            return dp[j];
        }
        return dp[j] - dp[i - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */