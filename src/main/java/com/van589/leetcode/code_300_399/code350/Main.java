package com.van589.leetcode.code_300_399.code350;

import java.util.*;

/**
 * code350 两个数组的交集 II
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(new Solution().intersect(nums1, nums2)));
    }
}

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map1 = new HashMap<>(nums1.length);
        for (int num : nums1) {
            Integer count = map1.get(num);
            if (count == null) {
                map1.put(num, 1);
            } else {
                map1.put(num, ++count);
            }
        }
        for (int num : nums2) {
            Integer count = map1.get(num);
            if (count != null && count != 0) {
                list.add(num);
                map1.put(num, --count);
            }
        }

        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}
