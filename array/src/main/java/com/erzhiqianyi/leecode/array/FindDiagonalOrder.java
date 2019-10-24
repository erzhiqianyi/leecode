package com.erzhiqianyi.leecode.array;


/**
 * Given a matrix of M x N elements (M rows, N columns),
 * return all elements of the matrix in diagonal order as shown in the below image.
 * Input:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * <p>
 * Output:  [1,2,4,7,5,3,6,8,9]
 * <p>
 * 2019/10/22 8:11
 *
 * @author 二之前一
 */
public class FindDiagonalOrder {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (null == matrix || matrix.length == 0) {
            return new int[0];
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[] diagonalOrder = new int[m * n];
        int x = 0;
        int y = 0;
        for (int i = 0; i < diagonalOrder.length; i++) {
            diagonalOrder[i] = matrix[x][y];
            System.out.println(x + " , " + y);
            //遍历层次,奇数向下，偶数向上
            if ((x + y) % 2 == 0) {
                if (y == n - 1) {
                    //右侧到达边界，转向下一层，准备向下遍历
                    x++;
                } else if (x == 0) {
                    //上侧到达边界，转向下一层，准备向下遍历
                    y++;
                } else {
                    //对角线，向上移动
                    x--;
                    y++;
                }
            } else {
                if (x == m - 1) {
                    //下侧到达边界，转向下一层，准备向上遍历
                    y++;
                } else if (y == 0) {
                    //左侧到达边界，转向下一层，准备向上遍历
                    x++;
                } else {
                    //对角线，向下移动
                    x++;
                    y--;
                }

            }
        }
        return diagonalOrder;
    }
}
