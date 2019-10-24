package com.erzhiqianyi.leecode.array;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SpiralOrderTest {

    private SpiralOrder spiralOrder;

    @Before
    public void init() {
        spiralOrder = new SpiralOrder();

    }

    @Test
    public void spiralOrderOne() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int[] spiralOrderResult = new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5};
        int[] result = spiralOrder.spiralOrder(matrix);
        assertTrue(Arrays.equals(spiralOrderResult, result));
    }

    @Test
    public void spiralOrderTwo() {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };
        int[] spiralOrderResult = new int[]{1,2,3,4,8,12,11,10,9,5,6,7};
        int[] result = spiralOrder.spiralOrder(matrix);
        assertTrue(Arrays.equals(spiralOrderResult, result));

    }
    @Test
    public void spiralOrderThree() {
        int[][] matrix = new int[][]{
                {1},
        };
        int[] spiralOrderResult = new int[]{1};
        int[] result = spiralOrder.spiralOrder(matrix);
        assertTrue(Arrays.equals(spiralOrderResult, result));

    }
}