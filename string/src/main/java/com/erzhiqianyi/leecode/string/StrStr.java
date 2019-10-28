package com.erzhiqianyi.leecode.string;

/**
 * Implement strStr().
 * <p>
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 * <p>
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 * <p>
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * <p>
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 * <p>
 * time: 7:43 - 2019/10/28
 *
 * @author 二之前一
 */
public class StrStr {
    public int strStr(String haystack, String needle) {
        if (null == haystack || null == needle) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }

        char[] target = needle.toCharArray();
        char[] source = haystack.toCharArray();
        char first = target[0];

        int targetCount = target.length;
        int max = source.length - target.length;
        for (int i = 0; i <= max; i++) {
            /* 查找第一个匹配的字符串 */
            if (source[i] != first) {
                while (++i <= max && source[i] != first) ;
            }

            /* 找到第一个后，查找剩下是否匹配 */
            if (i <= max) {
                int j = i + 1;
                int end = j + targetCount - 1;
                for (int k = 1; j < end && source[j]
                        == target[k]; j++, k++)
                    ;

                if (j == end) {
                    /* 匹配到整个字符串 */
                    return i;
                }
            }
        }
        return -1;
    }
}
