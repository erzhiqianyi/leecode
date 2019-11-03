package com.erzhiqianyi.leecode.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxConsecutiveOnesTest {

    private FindMaxConsecutiveOnes findMaxConsecutiveOnes;

    @Before
    public void init() {
        findMaxConsecutiveOnes = new FindMaxConsecutiveOnes();
    }

    @Test
    public void findMaxConsecutiveOnes() {
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        int expected = 3;
        int result = findMaxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        assertEquals(expected, result);

    }

    @Test
    public void findMaxConsecutiveOnes2() {
        int[] nums = new int[]{1,0,1,1,0,1};
        int expected = 2;
        int result = findMaxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        assertEquals(expected, result);

    }
}