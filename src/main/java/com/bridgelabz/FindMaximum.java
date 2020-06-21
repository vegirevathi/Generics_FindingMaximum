package com.bridgelabz;

public class FindMaximum {
    public static <C extends Comparable<C>> C analyzeMaximum(C firstElement, C secondElement, C thirdElement) {
        C maximum = firstElement;
        if (maximum.compareTo(secondElement) < 0) {
            maximum = secondElement;
        }
        if (maximum.compareTo(thirdElement) < 0) {
            maximum = thirdElement;
        }
        return maximum;

    }
}