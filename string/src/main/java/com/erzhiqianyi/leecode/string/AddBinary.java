package com.erzhiqianyi.leecode.string;

/**
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * The input strings are both non-empty and contains only characters 1 or 0.
 * <p>
 * Example 1:
 * <p>
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 * <p>
 * Input: a = "1010", b = "1011"
 * 1010
 * 1011
 * Output: "10101"
 *
 * @author 二之前一
 * 2019/10/26 17:26
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        if (null == a || a == "") {
            return b;
        }
        if (null == b || b == "") {
            return a;
        }

        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int resultLength = a.length()>= b.length() ? a.length() : b.length();
        char[] result = new char[resultLength];
        int current = 0 ;
        int resultIndex = resultLength - 1;
        while (aIndex >= 0 || bIndex >= 0 ){
            int sum = current;
            if (aIndex >= 0 ){
               sum = sum + a.charAt(aIndex) - '0' ;
            }
            if (bIndex >= 0){
                sum = sum + b.charAt(bIndex) - '0';
            }
            current = sum >> 1 ;
            result[resultIndex] = (char) ((sum & 0x01) + '0');
            aIndex--;
            bIndex--;
            resultIndex--;
        }
        if (current > 0 ){
            return "1"+String.valueOf(result);
        }
        return String.valueOf(result);

    }
}
