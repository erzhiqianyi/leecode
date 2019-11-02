package com.erzhiqianyi.leecode.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class TwoSumTest {

    private TwoSum twoSum;

    @Before
    public void init() {
        twoSum = new TwoSum();
    }

    @Test
    public void twoSum() {
        int[] numbers = new int[]{2, 7, 11, 15};
        int[] expected = new int[]{1, 2};
        int[] result = new int[2];
        result = twoSum.twoSum(numbers, 9);
        assertArrayEquals(expected,result);

        expected = new int[]{1,3};
        result = twoSum.twoSum(numbers, 13);
        assertArrayEquals(expected,result);

        expected = new int[]{1,4};
        result = twoSum.twoSum(numbers, 17);
        assertArrayEquals(expected,result);

        expected = new int[]{2,3};
        result = twoSum.twoSum(numbers, 18);
        assertArrayEquals(expected,result);

        expected = new int[]{2, 4};
        result = twoSum.twoSum(numbers, 22);
        assertArrayEquals(expected, result);

        expected = new int[]{3, 4};
        result = twoSum.twoSum(numbers, 26);
        assertArrayEquals(expected,result);


    }

    @Test
    public void twoSumTwo() {
        int[] numbers = new int[]{-1,0};
        int[] expected = new int[]{1, 2};
        int[] result = new int[2];
        result = twoSum.twoSum(numbers,-1 );
        assertArrayEquals(expected,result);


    }
}
