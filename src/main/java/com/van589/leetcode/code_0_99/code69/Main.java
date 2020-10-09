package com.van589.leetcode.code_0_99.code69;

/**
 * code69 x 的平方根
 *
 * @author Liang
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(4));
    }
}

class Solution {
    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }
}
