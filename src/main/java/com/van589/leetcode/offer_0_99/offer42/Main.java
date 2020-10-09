package com.van589.leetcode.offer_0_99.offer42;

/**
 * 剑指 Offer 42 连续子数组的最大和
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        int[] number = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new Solution().maxSubArray(number));
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i - 1] + nums[i], nums[i]);
            max = Math.max(nums[i], max);
        }
        return max;
    }
}