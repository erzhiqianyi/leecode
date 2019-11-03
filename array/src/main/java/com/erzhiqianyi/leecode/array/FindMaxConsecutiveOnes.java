package com.erzhiqianyi.leecode.array;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * <p>
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 * Note:
 * <p>
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 *
 * @author 二之前一
 * 2019/11/3 8:09
 */
public class FindMaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        if (null == nums){
            return 0;
        }
        int count = 0;
        int max = 0 ;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                count++;
            }else {
                if(count > max){
                    max = count;
                }
                count = 0 ;
            }
        }

        max = count > max ? count : max;
        return max;
    }
}
