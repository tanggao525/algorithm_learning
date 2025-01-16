package com.tanggao.algorithm.array;

//长度最小的子数组
public class TheSmallestLengthSubarray {

    /**
     * 给定一个含有 n 个正整数的数组和一个正整数 s ，
     * 找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。如果不存在符合条件的子数组，返回 0
     */

    // 滑动窗口法：窗口的终止位置不变，起始位置向右移动
    public int minSubArrayLen(int target, int[] nums) {
        // 返回结果初始化为最大值
        int result = Integer.MAX_VALUE;
        // 窗口之和
        int sum = 0;

        // 窗口起始位置
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            // 加入当前元素
            sum += nums[right];
            // 窗口之和大于等于target，缩小窗口
            while (sum >= target) {
                // 此次满足条件的窗口大小
                int length = right - left + 1;
                // 更新结果
                result = Math.min(result, length);
                // 缩小窗口
                sum -= nums[left];
                left++;
            }
        }

        if (result == Integer.MAX_VALUE) {
            return 0;
        } else {
            return result;
        }
    }
}
