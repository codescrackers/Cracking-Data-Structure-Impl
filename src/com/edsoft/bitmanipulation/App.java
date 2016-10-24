package com.edsoft.bitmanipulation;

/**
 * Created by yusuf on 07.10.2016.
 */
public class App {

    public static void main(String[] args) {
        System.out.println(repeatedArithmeticShifting(-5, 1));
        System.out.println(repeatedLogicalShifting(5, 1));
        System.out.println(setBit(5, 4));

    }

    //For signed numbers
    private static int repeatedArithmeticShifting(int x, int count) {
        for (int i = 0; i < count; i++) {
            x >>= 1;//Arithmetic shift by 1
        }
        return x;
    }

    //For unsigned numbers
    private static int repeatedLogicalShifting(int x, int count) {
        for (int i = 0; i < count; i++) {
            x >>>= 1;//Logical shift by 1
        }
        return x;
    }

    private static boolean getBit(int num, int i) {
        return ((num & (1 << i)) != 0);
    }

    private static int setBit(int num, int i) {
        return num | (1 << i);
    }

    private static int clearBit(int num, int i) {
        int mask = ~(1 << i);
        return num & mask;
    }

    private static int clearBtsMSBThroughI(int num, int i) {
        int mask = (1 << i) - 1;
        return num & mask;
    }

    private static int clearBitsIthrough(int num, int i) {
        int mask = (-1 << (i + 1));
        return num & mask;
    }

    private static int updateBit(int num, int i, boolean bitIsOne) {
        int value = bitIsOne ? 1 : 0;
        int mask = ~(1 << i);
        return (num & mask) | (value << 1);
    }
}
