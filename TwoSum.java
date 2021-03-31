package com.test;

public class TwoSum {
    /**
     * 思路1：暴力解决：两个for循环寻找差值target - nums[i] = nums[j]
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if(target - nums[i] == nums[j]) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
