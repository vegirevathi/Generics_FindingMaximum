package com.bridgelabz;

import java.util.Arrays;


public class FindMaximum {
public static <T extends Comparable<T>> T analyzeMaximum(T[] array) {
    Arrays.sort(array);
    return array[array.length-1];
}
}
