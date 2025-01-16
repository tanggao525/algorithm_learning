package com.tanggao.algorithm.array;

// 有序数组的平方
public class TheSquareOfAnOrderedArray {

    /**
     * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
     */

    // 思路：最大的平方肯定在数组的两端
    public int[] sortedSquares(int[] nums) {
        // 指向数组的两端
        int left = 0;
        int right = nums.length - 1;

        // 新数组，新数组插入的下标
        int[] result = new int[nums.length];
        int index = nums.length - 1;

        while(left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left ++;
            } else {
                result[index] = rightSquare;
                right --;
            }
            index --;
        }
        return result;
    }
}
