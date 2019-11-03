package com.erzhiqianyi.leecode.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinSubArrayLenTest {

    private MinSubArrayLen minSubArrayLen;

    @Before
    public void init() {
        minSubArrayLen = new MinSubArrayLen();
    }

    @Test
    public void minSubArrayLen() {
        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        int s = 6;
        int expected = 2;
        int result = minSubArrayLen.minSubArrayLen(s, nums);
        assertEquals(expected, result);
        s = 7;
        expected = 2;
        result = minSubArrayLen.minSubArrayLen(s,nums);
        assertEquals(expected, result);

    }

    @Test
    public void minSubArrayLenTwo() {
        int[] nums = new int[]{1,4,4};
        int s = 4;
        int expected = 1;
        int result = minSubArrayLen.minSubArrayLen(s, nums);
        assertEquals(expected, result);

    }
    @Test
    public void minSubArrayLenThree() {
        int[] nums = new int[]{1,2,3,4,5};
        int s = 11;
        int expected = 3;
        int result = minSubArrayLen.minSubArrayLen(s, nums);
        assertEquals(expected, result);

    }
}