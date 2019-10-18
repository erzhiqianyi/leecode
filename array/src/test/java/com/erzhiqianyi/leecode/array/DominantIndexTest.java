package com.erzhiqianyi.leecode.array;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;


public class DominantIndexTest {
    private DominantIndex index;

    private Map<Integer[], Integer> testCase;

    @Before
    public void init() {
        index = new DominantIndex();
        testCase = new HashMap<>();
        testCase.put(new Integer[]{3, 6, 1, 0}, 1);
        testCase.put(new Integer[]{1, 2, 3, 4}, -1);
        testCase.put(new Integer[]{0, 0, 0, 1}, 3);
        testCase.put(new Integer[]{1}, 0);
        testCase.put(new Integer[]{0,0,2,3}, -1);
        testCase.put(new Integer[]{0,0,3,2}, -1);
        testCase.put(new Integer[]{0,1,1,2}, 3);
        testCase.put(new Integer[]{1,2,16,35,44,100,27,0},5);
        testCase.put(new Integer[]{1,0},0);

    }

    @Test
    public void dominantIndex() {
        testCase.forEach((key, value) -> {
            System.out.println(Arrays.toString(key)+ " index "+ value);
            int maxMinIndex = index.dominantIndex(key);
            System.out.println(" actual " + maxMinIndex);
            assertEquals(value.intValue(),maxMinIndex);
        });
    }

}
