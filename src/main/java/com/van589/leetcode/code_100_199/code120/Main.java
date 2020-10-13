package com.van589.leetcode.code_100_199.code120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * code120 三角形最小路径和
 *
 * @author hasee
 */
public class Main {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        list1.add(2);
        list2.add(3);
        list2.add(4);
        list3.add(6);
        list3.add(5);
        list3.add(7);
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);

        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);

        System.out.println(new Solution().minimumTotal(lists));
    }
}

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        if (size == 0) {
            return 0;
        }
        int[] dp = new int[triangle.get(size - 1).size() + 1];
        dp[0] = triangle.get(0).get(0);
        for (int i = size - 1; i >= 0; i--) {
            List<Integer> integers = triangle.get(i);
            for (int j = 0; j < integers.size(); j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + integers.get(j);
            }
        }
        return dp[0];
    }
}
