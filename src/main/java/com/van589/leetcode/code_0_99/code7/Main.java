package com.van589.leetcode.code_0_99.code7;

/**
 * code7 整数反转
 *
 * @author Liang
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(1534236469));
    }

}

class Solution {
    public int reverse(int x) {
        long number = 0;
        while (x != 0) {
            number = x % 10 + number * 10;
            x /= 10;
        }
        return (int) number == number ? (int) number : 0;
    }
}