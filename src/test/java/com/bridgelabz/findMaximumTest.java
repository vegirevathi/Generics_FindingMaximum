package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class findMaximumTest {

    @Test
    public void maximumInteger_at_firstPosition() {
        FindMaximum findMaximum = new FindMaximum();
        Integer max = findMaximum.analyzeMaximum( 40,20,30 );
        Assert.assertEquals(40,(int)max);
    }

    @Test
    public void maximumInteger_at_secondPosition() {
        FindMaximum findMaximum = new FindMaximum();
        Integer max = findMaximum.analyzeMaximum( 10,40,30 );
        Assert.assertEquals(40,(int)max);
    }

    @Test
    public void maximumInteger_at_thirdPosition() {
        FindMaximum findMaximum = new FindMaximum();
        Integer max = findMaximum.analyzeMaximum( 10,20,30 );
        Assert.assertEquals(30,(int)max);
    }
}
