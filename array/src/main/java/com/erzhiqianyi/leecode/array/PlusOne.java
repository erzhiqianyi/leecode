package com.erzhiqianyi.leecode.array;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * <p>
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 * <p>
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 *
 * @author 二之前一
 * 2019/10/18 10:01
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int lastIndex = length - 1;
        int lastNum = digits[lastIndex];
        int plusOne = lastNum + 1;
        if (plusOne < 10) {
            digits[lastIndex] = plusOne;
            return digits;
        }

        while (plusOne == 10 && lastIndex >= 0) {
            digits[lastIndex] = 0;
            lastIndex = lastIndex - 1;
            if (lastIndex >= 0) {
                plusOne = digits[lastIndex] + 1;
                digits[lastIndex] = plusOne;
            }
        }
        if (lastIndex == -1) {
            int[] newDigits = new int[length + 1];
            newDigits[0] = 1;
            return newDigits;
        } else {
            return digits;
        }

    }
}
