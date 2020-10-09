package com.van589.leetcode.review.review16_17;

/**
 * 面试题 16.17 连续数列
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
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i], nums[i - 1] + nums[i]);
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}