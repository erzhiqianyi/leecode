package com.erzhiqianyi.leecode.string;

import org.junit.Before;
import org.junit.Test;
import sun.security.timestamp.TSRequest;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix;

    @Before
    public void init() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    public void longestCommonPrefix() {
        String[] strs = new String[]{"flower", "flow", "flight"};
        String expected = "fl";
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        assertEquals(expected, result);

    }

    @Test
    public void longestCommonNoPrefix() {
        String[] strs = new String[]{"dog", "racecar", "car"};
        String expected = "";
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        assertEquals(expected, result);

    }

    @Test
    public void longestCommonEmpty() {
        String[] strs = new String[]{};
        String expected = "";
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        assertEquals(expected, result);

    }

    @Test
    public void longestCommonPrefixOne() {
        String[] strs = new String[]{"abcd","abc", "ab"};
        String expected = "ab";
        String result1 = longestCommonPrefix.longestCommonPrefix(strs);
        assertEquals(expected,result1);
    }
}