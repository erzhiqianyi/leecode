package com.erzhiqianyi.leecode.array;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 * <p>
 * Example:
 * <p>
 * Input: 5
 * Output:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 * time: 7:48 - 2019/10/25
 *
 * @author 二之前一
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>(numRows);
        List<Integer> lastRow = null;
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            row.add(1);
            for (int j = 1; j < i ; j++){
                row.add(lastRow.get(j-1)+lastRow.get(j));
            }
            if (i != 0) {
                row.add(1);
            }
            lastRow = row;
            pascalTriangle.add(row);
        }

        return pascalTriangle;

    }
}
