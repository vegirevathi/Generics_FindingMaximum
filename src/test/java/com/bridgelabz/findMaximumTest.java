package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class findMaximumTest {

    @Test
    public void maximumInteger_in_array() {
        FindMaximum findMaximum = new FindMaximum();
        Integer[] array = {10, 30, 20, 71, 5, 27, 88, 36};
        Integer max = findMaximum.analyzeMaximum(array);
        Assert.assertEquals(88,(int)max);
        //findMaximum.printMaximum();
    }


    @Test
    public void maximumFloat_in_array() {
        FindMaximum findMaximum = new FindMaximum();
        Double[] array = {1.2, 2.1, 3.4, 1.5, 7.8, 6.4, 2.89};
        Double max = findMaximum.analyzeMaximum(array);
        Assert.assertEquals((Double) 7.8,(Double)max);
        //findMaximum.printMaximum();
    }


    @Test
    public void maximumCharacter_in_array() {
        FindMaximum findMaximum = new FindMaximum();
        String[] array = {"Pineapple","Orange","Apple","Banana"};
        String max = findMaximum.analyzeMaximum(array);
        Assert.assertEquals((String) "Pineapple",(String)max);
        //findMaximum.printMaximum();
    }
}
