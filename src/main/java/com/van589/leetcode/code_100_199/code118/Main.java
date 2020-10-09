package com.van589.leetcode.code_100_199.code118;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * code 118 杨辉三角
 *
 * @author Liang
 */
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generate(1).forEach(integers -> {
            System.out.println(integers.toString());
        });
    }

}

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> integers = new ArrayList<>();
        result.add(Collections.singletonList(1));
        if (numRows == 1) {
            return result;
        }
        integers.add(1);
        integers.add(1);
        result.add(integers);
        if (numRows == 2) {
            return result;
        }

        for (int i = 2; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(result.get(i - 1).get(j) + result.get(i - 1).get(j - 1));
                }
            }
            result.add(list);
        }
        return result;
    }
}
