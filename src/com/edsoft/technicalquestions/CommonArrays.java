package com.edsoft.technicalquestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * İki arraydaki ortak değerleri gösterir
 *
 * @author Yusuf ONDER
 */
public class CommonArrays {
    public static void main(String[] args) {
        int[] arrayOne = new int[]{5, 7, 9, 13, 16, 25, 40, 42, 48, 56, 77};
        int[] arrayTwo = new int[]{5, 8, 10, 13, 18, 25, 42, 45, 58, 72, 88};
        long startTime = System.nanoTime();
        System.out.println(commonCount(arrayOne, arrayTwo));
        long endTime = System.nanoTime();
        System.out.println("FARK ==> " + (endTime - startTime));
    }

    private static int hashMap(int[] f, int[] s) {
        int count = 0;
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            hashMap.put(s[i], i);
        }
        for (int aF : f) {
            if (hashMap.get(aF) != null) {
                count++;
            }
        }
        return count;
    }

    // Improved Solution O(n log n)
    private static int binarySearch(int[] f, int[] s) {
        int count = 0;
        for (int aF : f) {
            if (Arrays.binarySearch(s, aF) >= 0) {
                count++;
            }
        }
        return count;
    }

    // My Solution O(f*s)
    private static int commonCount(int[] f, int[] s) {
        int count = 0;

        for (int i = 0; i < f.length; i++) {
            if (f[i] > s[i]) {
                for (int j = i + 1; j < s.length; j++) {
                    if (f[i] == s[j]) {
                        count++;
                    }
                }
            } else if (f[i] < s[i]) {
                for (int j = 0; j < i; j++) {
                    if (f[i] == s[j]) {
                        count++;
                    }
                }
            } else {
                count++;
            }
        }
        return count;
    }
}
