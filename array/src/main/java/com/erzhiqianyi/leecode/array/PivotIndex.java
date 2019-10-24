package com.erzhiqianyi.leecode.array;

/**
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.
 * <p>
 * We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
 * <p>
 * If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * nums = [1, 7, 3, 6, 5, 6]
 * Output: 3
 * Explanation:
 * The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
 * Also, 3 is the first index where this occurs.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input:
 * nums = [1, 2, 3]
 * Output: -1
 * Explanation:
 * There is no index that satisfies the conditions in the problem statement.
 *
 * @author 二之前一
 * time: 8:50 - 2019/10/17
 */
public class PivotIndex {

    public int pivotIndex(int[] nums) {
        int sum = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            sum = sum + nums[i];
        }

        int left = 0;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                left = 0;
            } else {
                left = left + nums[i - 1];
            }
            int current = nums[i];
            int total = sum - current;
            int right = total - left;
            if (left == right) {
                return i;
            }
        }
        return -1;
    }

}
