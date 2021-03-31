package com.test;

public class MergeArrarys {
    /**
     * 思路1：暴力，遍历两个数组，判断合并
     * 思路2：暴力2，先插入再排序
     * 思路3：暴力3：从后往前遍历，判断最大先赋值
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //采用暴力3解决
        --m;
        --n;
        int k = nums1.length - 1;
        while (k >= 0) {
            if (m < 0 && n >= 0) {
                nums1[k--] = nums2[n--];
            } else if (n < 0 && m >= 0) {
                nums1[k--] = nums1[m--];
            } else {
                nums1[k--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
            }
        }
    }
}
