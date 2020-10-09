package com.van589.leetcode.code_100_199.code121;

/**
 * code121 买卖股票的最佳时机
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        int[] number = {7, 1, 5, 3, 6, 4};
        System.out.println(new Solution().maxProfit(number));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int min = prices[0], max = 0;
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }
}
