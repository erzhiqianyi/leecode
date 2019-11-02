package com.erzhiqianyi.leecode.array;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * <p>
 * Note:
 * <p>
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Example:
 * <p>
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 *
 * @author 二之前一
 * 2019/11/2 9:23
 */
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if (null == numbers) {
            return result;
        }
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] <= target) {
                if (numbers[i] + numbers[j] > target) {
                    j--;
                } else if (numbers[i] + numbers[j] < target) {
                    i++;
                } else {
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }else {
                return result;
            }
        }
        return result;
    }
}
