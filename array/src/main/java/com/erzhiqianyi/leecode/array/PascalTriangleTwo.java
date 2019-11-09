package com.erzhiqianyi.leecode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 * <p>
 * Note that the row index starts from 0.
 * <p>
 * Example:
 * <p>
 * Input: 3
 * Output: [1,3,3,1]
 * Follow up:
 * <p>
 * Could you optimize your algorithm to use only O(k) extra space?
 *
 * @author 二之前一
 * 2019/11/9 8:40
 */
public class PascalTriangleTwo {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long pre = 1;
        ans.add(1);
        int end = rowIndex;
        for (int k = 1; k <= rowIndex; k++) {
            long cur = pre * (rowIndex - k + 1) / k;
            ans.add((int) cur);
            pre = cur;
        }
        return ans;
    }
}
