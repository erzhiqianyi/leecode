package com.erzhiqianyi.leecode.string;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddBinaryTest {
    private AddBinary addBinary;

    @Before
    public void init() {
        addBinary = new AddBinary();
    }

    @Test
    public void addBinary() {
        String a = "1010";
        String b = "1011";
        String result = "10101";
        Assert.assertEquals(result, addBinary.addBinary(a, b));
    }

    @Test
    public void addBinaryTwo() {
        String a = "1";
        String b = "11";
        String result = "100";
        Assert.assertEquals(result, addBinary.addBinary(a, b));
    }

    @Test
    public void addBinaryThree() {
        String a = "1111";
        String b = "1111";
        String result = "11110";
        Assert.assertEquals(result, addBinary.addBinary(a, b));
    }

}