package com.tanggao.algorithm.array;

public class RemoveElement {

    /**
     * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     */

    /**
     * 双指针法 ： 通过一个快指针和慢指针在一个for循环下完成两个for循环的工作
     * 快指针：寻找值不等于val的元素
     * 慢指针：寻找需要替换的位置（即值等于val）
     */

    public int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;

        // 每次循环都判断快指针的值是否等于val，如果不等于val，则挪到slow的位置
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
