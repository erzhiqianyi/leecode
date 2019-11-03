package com.erzhiqianyi.leecode.array;

/**
 * Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
 * <p>
 * Example:
 * <p>
 * Input: s = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: the subarray [4,3] has the minimal length under the problem constraint.
 * Follow up:
 * If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n).
 *
 * @author 二之前一
 * 2019/11/3 8:56
 */
public class MinSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        int sum = 0 ;
        int left = 0 ;
        int minCount = Integer.MAX_VALUE;
        for (int i =0 ; i < nums.length ;i++){
            sum = sum + nums[i];
            while (sum >= s){
                minCount = Math.min(minCount,i+1-left);
                sum = sum -  nums[left];
                left++;
            }
        }
        return minCount != Integer.MAX_VALUE ? minCount : 0;
    }
}
