package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class findMaximumTest {

    @Test
    public void maxInteger_at_firstPosition() {
        FindMaximum findMaximum = new FindMaximum();
        Integer max = findMaximum.analyzeMaximum( 40,20,30 );
        Assert.assertEquals(40,(int)max);
    }
}
