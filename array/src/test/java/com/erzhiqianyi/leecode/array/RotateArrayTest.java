package com.erzhiqianyi.leecode.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateArrayTest {

    private RotateArray rotateArray;

    @Before
    public void init() {
        rotateArray = new RotateArray();
    }

    @Test
    public void rotate() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);

        nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotateOne(nums, k);
        assertArrayEquals(expected, nums);

        nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotateTwo(nums, k);
        assertArrayEquals(expected, nums);

        nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotateThree(nums, k);
        assertArrayEquals(expected, nums);


    }

    @Test
    public void rotateOne() {
        int[] nums = new int[]{1};
        int k = 1;
        int[] expected = new int[]{1};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void rotateTwo() {
        int[] nums = new int[]{1, 2};
        int k = 1;
        int[] expected = new int[]{2, 1};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void rotateThree() {
        int[] nums = new int[]{1, 2};
        int k = 3;
        int[] expected = new int[]{2, 1};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void rotateFour() {
        int[] nums = new int[]{-1};
        int k = 0;
        int[] expected = new int[]{-1};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void rotateFive() {
        int[] nums = new int[]{1, 2, 3};
        int k = 2;
        int[] expected = new int[]{2, 3, 1};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void rotateSix() {
        int[] nums = new int[]{-1, -100, 3, 99};
        int k = 3;
        int[] expected = new int[]{-100, 3, 99, -1};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);

    }

    @Test
    public void rotateSeven() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int k = 0;
        int[] expected = new int[]{1, 2, 3, 4, 5, 6};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);

        nums = new int[]{1, 2, 3, 4, 5, 6};
        k = 1;
        expected = new int[]{6, 1, 2, 3, 4, 5};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);

        nums = new int[]{1, 2, 3, 4, 5, 6};
        k = 2;
        expected = new int[]{5,6, 1, 2, 3, 4};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);

        nums = new int[]{1, 2, 3, 4, 5, 6};
        k = 3;
        expected = new int[]{4,5,6, 1, 2, 3};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);

        nums = new int[]{1, 2, 3, 4, 5, 6};
        k = 4;
        expected = new int[]{3,4,5,6, 1, 2};
        rotateArray.rotate(nums, k);
        assertArrayEquals(expected, nums);



    }
}