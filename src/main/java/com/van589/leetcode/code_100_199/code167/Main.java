package com.van589.leetcode.code_100_199.code167;

import java.util.Arrays;

/**
 * code167 两数之和 II - 输入有序数组
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(new Solution().twoSum(nums, 9)));
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                break;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        int[] res = new int[2];
        if (left != right) {
            res[0] = left + 1;
            res[1] = right + 1;
        } else {
            res = new int[]{};
        }
        return res;
    }
}