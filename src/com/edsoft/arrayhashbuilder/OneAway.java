package com.edsoft.arrayhashbuilder;

import com.edsoft.tip.StringTips;

/**
 * ?ki String tek bir harf de?i?imi ile mi elde edilmi??
 *
 * @author Yusuf ONDER
 */
public class OneAway {

    public static void main(String[] args) {
        String w1 = "pkla";
        String w2 = "kla";
        long start = System.nanoTime();
        // System.out.println(isOneAwayWithNewSplit(w1, w2));
        System.out.println(isOneAway(w1, w2));
        long end = System.nanoTime();
        System.out.println("Time --> " + (end - start));
    }

    private static boolean isOneAway(String s, String s2) {
        int count = 0;
        char[] s2Array = s2.toCharArray();
        if (Math.abs((s.length() - s2.length())) > 1) {
            return false;
        } else {
            if (Math.abs((s.length() - s2.length())) == 1) {
                count++;
            }
            for (char aS2Array : s2Array) {
                if (s.split(String.valueOf(aS2Array)).length == 1) {
                    count++;
                }
            }
            if (String.valueOf(s.charAt(s.length() - 1)).equals(String.valueOf(s2Array[s2Array.length - 1]))) {
                count--;
            }
        }
        return count == 1;
    }

    private static boolean isOneAwayWithNewSplit(String s, String s2) {
        int count = 0;
        char[] s2Array = s2.toCharArray();
        if (Math.abs((s.length() - s2.length())) > 1) {
            return false;
        } else {
            if (Math.abs((s.length() - s2.length())) == 1) {
                count++;
            }
            for (char aS2Array : s2Array) {
                if (StringTips.split_banthar(s, aS2Array).length == 1) {
                    count++;
                }
            }
            if (String.valueOf(s.charAt(s.length() - 1)).equals(String.valueOf(s2Array[s2Array.length - 1]))) {
                count--;
            }
        }
        return count == 1;
    }

}
