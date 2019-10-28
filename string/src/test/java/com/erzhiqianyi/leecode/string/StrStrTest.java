package com.erzhiqianyi.leecode.string;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class StrStrTest {

    private StrStr strStr;


    @Before
    public void init() {
        strStr = new StrStr();
    }

    @Test
    public void strStr() {
        String haystack = "hello";
        String needle="ll";
        int expect = 2;
        int result = strStr.strStr(haystack,needle);
        assertEquals(expect,result);
    }
}
