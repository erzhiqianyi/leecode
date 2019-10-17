package com.erzhiqianyi.leecode.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PivotIndexTest {

    private PivotIndex pivotIndex;

    @Before
    public void init() {
        pivotIndex = new PivotIndex();
    }

    @Test
    public void pivotIndexFind() {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        int index = pivotIndex.pivotIndex(nums);
        assertEquals(3, index);
    }

    @Test
    public void pivotIndexNotFind() {
        int[] nums = new int[]{1, 2,3};
        int index = pivotIndex.pivotIndex(nums);
        assertEquals(-1, index);
    }
}