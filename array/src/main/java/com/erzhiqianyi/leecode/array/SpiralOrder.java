package com.erzhiqianyi.leecode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * Output: [1,2,3,6,9,8,7,4,5]
 * Example 2:
 * <p>
 * Input:
 * [
 * [1, 2, 3, 4],
 * [5, 6, 7, 8],
 * [9,10,11,12]
 * ]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 * time: 7:30 - 2019/10/23
 *
 * @author 二之前一
 */
public class SpiralOrder {

    public int[] spiralOrder(int[][] matrix) {
        if (null == matrix || matrix.length == 0 ){
            List<Integer> a
                     =new ArrayList<Integer>();
            return new int[0];
        }
        int m = matrix.length;

        int n = matrix[0].length;
        int length = m * n;
        int[] spiralOrder = new int[length];
        int x = 0;
        int y = 0;
        int floor = 1;
        for (int i = 0; i < length; i++) {
            spiralOrder[i] = matrix[x][y];
            if (x == floor - 1 && y < n - floor) {
                y++;
            } else if (x == floor - 1 && y == n - floor) {
                x++;
            } else if (x < m - floor && y == n - floor) {
                x++;
            } else if (x == m - floor && y == n - floor) {
                y--;
            } else if (x == m - floor && y > floor - 1) {
                y--;
            } else if (x == m - floor && y == floor - 1) {
                x--;
            } else if (x > floor - 1 && y == floor - 1) {
                if (x == floor && y == floor - 1) {
                    y++;
                    floor++;
                } else {
                    x--;
                }
            }
        }
        return spiralOrder;

    }
}
