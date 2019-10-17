package com.erzhiqianyi.leecode.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysTest {

    public static void main(String[] args) {
        String[] strings = {"one", "two", "three", "four", "five"};
        //toString
        System.out.println("toString: "+Arrays.toString(strings));

        //sort
        Arrays.sort(strings, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println("sort: "+Arrays.toString(strings));

        //search
        Arrays.sort(strings);
        System.out.println("search:");
        int index = Arrays.binarySearch(strings, "five");
        System.out.println(Arrays.toString(strings));
        System.out.println(index);
        System.out.println(strings[index]);

        //asList
        List<String> list = Arrays.asList(strings);
        System.out.println("AsList: ");
        list.forEach(item -> System.out.println(item));

        //fill
        Arrays.fill(strings, 0, 1, "fill");
        System.out.println("fill: "+ Arrays.toString(strings));

        //copyOf
        String[] newStrings = Arrays.copyOf(strings, 3);
        System.out.println("copy: "+Arrays.toString(newStrings));

        //equals
        boolean equals = Arrays.equals(strings, newStrings);
        System.out.println("相等: "+equals);


    }


}
