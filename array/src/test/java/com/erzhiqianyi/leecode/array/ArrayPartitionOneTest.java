package com.erzhiqianyi.leecode.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayPartitionOneTest {

    private ArrayPartitionOne arrayPartitionOne;

    @Before
    public void init() {
        arrayPartitionOne = new ArrayPartitionOne();
    }

    @Test
    public void arrayPairSum() {
        int[] nums = new int[]{1, 4, 3, 2};
        int expected = 4;
        int result = arrayPartitionOne.arrayPairSum(nums);
        assertEquals(expected,result);
    }

    @Test
    public void arrayPairSumTwo() {
        int[] nums = new int[]{1, 1, 2, 2};
        int expected = 3;
        int result = arrayPartitionOne.arrayPairSum(nums);
        assertEquals(expected,result);
    }
}
