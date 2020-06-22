package com.bridgelabz;

import java.util.Arrays;

public class FindMaximum<T> {

    public static <T extends Comparable<T>> T analyzeMaximum(T... array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public <T> void printMaximum(T[] array) {
        System.out.println(array[array.length - 1]);
    }
}

