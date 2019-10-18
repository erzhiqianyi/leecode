package com.erzhiqianyi.leecode.array;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class PlusOneTest {
    private PlusOne plusOne;
    private Map<Integer[], Integer[]> testCase;

    @Before
    public void init() {
        plusOne = new PlusOne();
        testCase = new HashMap<>();
        testCase.put(new Integer[]{9}, new Integer[]{1, 0});
        testCase.put(new Integer[]{0}, new Integer[]{1});
        testCase.put(new Integer[]{1,2,3}, new Integer[]{1,2,4});
        testCase.put(new Integer[]{4,3,2,1}, new Integer[]{4,3,2,2});
        testCase.put(new Integer[]{9,9}, new Integer[]{1,0,0});
        testCase.put(new Integer[]{9,9,8}, new Integer[]{9,9,9});
        testCase.put(new Integer[]{8,9}, new Integer[]{9,0});
        testCase.put(new Integer[]{8,9,9}, new Integer[]{9,0,0});
        testCase.put(new Integer[]{8,9,9,9}, new Integer[]{9,0,0,0});
    }

    @Test
    public void plusOne() {
        testCase.forEach((key, value) -> {
            System.out.println(" input " + Arrays.toString(key));
            System.out.println(" expect " + Arrays.toString(value));
            int[] param = new int[key.length]   ;
            int[] expect = new int[value.length];
            for ( int i =0 ; i < key.length ;i++){
               param[i] = key[i];
            }
            for (int i =0 ; i < value.length ;i++){
                expect[i] = value[i];
            }
            int[] result = plusOne.plusOne(param);
            System.out.println(" output " + Arrays.toString(result));
            assertTrue(Arrays.equals(result, expect));
        });
    }
}