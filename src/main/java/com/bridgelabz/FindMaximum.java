package com.bridgelabz;
import java.util.Arrays;

public class FindMaximum<T extends Comparable<T>> {
    private T[] array;

    public static <T extends Comparable<T>> T analyzeMaximum(T[] array) {
    Arrays.sort(array);
    return array[array.length-1];
    }

    public void printMaximum(){
    System.out.println(array[array.length-1]);
    }
}
