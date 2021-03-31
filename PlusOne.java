package com.test;

public class PlusOne {
    /**
     * 思路1：从最后一位加1，若判断为进位（10 = 9 + 1）,则执行进位操作。若全是进位则数组长度加1，下标0补1
     */
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; --i) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
