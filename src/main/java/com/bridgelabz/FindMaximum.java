package com.bridgelabz;

public class FindMaximum<T extends Comparable<T>> {
    T firstElement, secondElement, thirdElement;

    public FindMaximum(T firstElement, T secondElement, T thirdElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
        this.thirdElement = thirdElement;
    }
    public T analyzeMaximum(){
        return FindMaximum.analyzeMaximum(firstElement, secondElement, thirdElement);
    }
    public static <T extends Comparable<T>> T analyzeMaximum(T firstElement, T secondElement, T thirdElement) {
        T maximum = firstElement;
        if (maximum.compareTo(secondElement) < 0) {
            maximum = secondElement;
        }
        if (maximum.compareTo(thirdElement) < 0) {
            maximum = thirdElement;
        }
        return maximum;

    }
}