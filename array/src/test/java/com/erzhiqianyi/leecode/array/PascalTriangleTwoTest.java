package com.erzhiqianyi.leecode.array;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class PascalTriangleTwoTest {

    private PascalTriangleTwo pascalTriangleTwo;

    @Before
    public void init() {
        pascalTriangleTwo = new PascalTriangleTwo();
    }

    @Test
    public void getRow() {
        int rowIndex = 3;
        int[] expected =  new int[]{1,3,3,1};
                pascalTriangleTwo.getRow(rowIndex);
//        assertArrayEquals(expected,result);
    }
}
