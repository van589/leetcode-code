package com.van589.leetcode.offer_0_99.offer53;

/**
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 9};
        System.out.println(new Solution().missingNumber(num));
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int min = (start + end) / 2;
            if (nums[min] == min) {
                start = min + 1;
            } else {
                end = min;
            }

        }
        return start == nums.length - 1 && start == nums[start] ? start + 1 : start;
    }

}