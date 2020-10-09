package com.van589.leetcode.review.review10_05;

/**
 * 面试题 10.05. 稀疏数组搜索
 *
 * @author Liang
 */
public class Main {
    public static void main(String[] args) {
        String[] words = {"AX zEfzhxdXXbeCQOKa", "aLRAEYPIZokU", "giqyZpvcOHdfPpRqHAD", "mhQf", "uwIPRHFftk"};
        System.out.println(new Solution().findString(words, "btRVwblGdpLTtSLbjFzB"));
    }
}

class Solution {
    public int findString(String[] words, String s) {
        int left = 0;
        int right = words.length - 1;

        while (left < right) {
            while ("".equals(words[left])) {
                left++;
            }
            while ("".equals(words[right])) {
                right--;
            }
            int mid = (right + left) / 2;

            while ("".equals(words[mid])) {
                mid--;
            }

            if (words[mid].equals(s)) {
                return mid;
            } else if (words[mid].compareTo(s) > 0) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return words[left].equals(s) ? left : -1;
    }
}