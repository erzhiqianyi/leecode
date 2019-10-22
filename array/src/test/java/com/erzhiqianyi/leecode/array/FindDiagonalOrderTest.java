package com.erzhiqianyi.leecode.array;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FindDiagonalOrderTest {
    private FindDiagonalOrder findDiagonalOrder;

    @Before
    public void init() {
        findDiagonalOrder = new FindDiagonalOrder();
    }

    @Test
    public void findDiagonalOrder() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] diagonalOrder = new int[]{1, 2, 4, 7, 5, 3, 6, 8, 9};
        int[] result = findDiagonalOrder.findDiagonalOrder(matrix);
        assertTrue(Arrays.equals(diagonalOrder, result));
    }
}