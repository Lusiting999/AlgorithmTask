package com.test;

public class RotateArray {
    /**
     * 思路1：步骤1：先整体反转数组，步骤2：分割反转，反转0~k与k~length
     * 思路2：创建新数组，将k~length放至0~length-k，0~k放至length-k~length
     * 思路3：
     */
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length; //防止旋转次数超过数组本身长度，下标越界
        reverse(nums, 0, length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
