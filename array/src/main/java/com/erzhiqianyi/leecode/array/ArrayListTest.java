package com.erzhiqianyi.leecode.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(3);
        list.add("one");
        list.add("two");
        list.add("three") ;
        System.out.println(list.size());
        list.add("four");
        System.out.println(list.size());
    }
}
