package com.van589.leetcode.offer_0_99.offer11;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
//        int[] nums = {2, 2, 2, 0, 1};
        int[] nums = {1, 3, 3};
        System.out.println(new Solution().minArray(nums));
    }
}

class Solution {
    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (numbers[mid] < numbers[right]) {
                right = mid;
            } else if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else {
                right--;
            }
        }
        return numbers[left];
    }
}