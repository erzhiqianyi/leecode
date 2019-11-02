package com.erzhiqianyi.leecode.array;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class RemoveElementTest {

    private RemoveElement removeElement;

    @Before
    public void init() {
        removeElement = new RemoveElement();
    }

    @Test
    public void removeElement() {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int expected = 5;
        int result = removeElement.removeElement(nums, val);
        assertEquals(expected, result);
    }
}
