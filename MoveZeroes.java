package com.test;

import java.util.Arrays;

public class MoveZeroes {

    /**
     * 思路1：遍历非零往前移动
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0;i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        Arrays.fill(nums, j, nums.length,0);
    }

    /*
    *
    public static void moveZeroes2(int[] nums) {
        int j = 0;
        for (int i = 0;i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }*/
}
