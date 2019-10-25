package com.erzhiqianyi.leecode.array;

import org.junit.Before;
import org.junit.Test;
import sun.java2d.pipe.SpanClipRenderer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class PascalTriangleTest {

    private PascalTriangle pascalTriangle;

    @Before
    public void init() {
        pascalTriangle = new PascalTriangle();
    }

    @Test
    public void generate() {
        int numRows = 5;
        List<List<Integer>> check = new ArrayList<>();
        List<Integer> rowOne = Stream.of(1).collect(Collectors.toList());
        check.add(rowOne);
        List<Integer> rowTwo = Stream.of(1, 1).collect(Collectors.toList());
        check.add(rowTwo);
        List<Integer> rowThree = Stream.of(1, 2, 1).collect(Collectors.toList());
        check.add(rowThree);
        List<Integer> rowFour = Stream.of(1, 3, 3, 1).collect(Collectors.toList());
        check.add(rowFour);
        List<Integer> rowFive = Stream.of(1, 4, 6, 4, 1).collect(Collectors.toList());
        check.add(rowFive);
        List<List<Integer>> result = pascalTriangle.generate(numRows);
        assertEquals(check.size(),result.size());
        for (int i = 0; i < check.size(); i++) {
            assertEquals(check.get(i).size() ,result.get(i).size());
            for (int j = 0; j < check.get(i).size(); j++) {
                assertEquals(check.get(i).get(j), result.get(i).get(j));
            }
        }


    }
}