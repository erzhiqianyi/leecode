package com.erzhiqianyi.leecode.string;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ReverseStringTest {

    private ReverseString reverseString;

    @Before
    public void init() {
        reverseString = new ReverseString();
    }

    @Test
    public void reverseString() {
        char[] str = new char[]{'h','e','l','l','o'};
        char[] result = new char[]{'o','l','l','e','h'};
        reverseString.reverseString(str);
        assertTrue(Arrays.equals(result,str));

    }
}