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

    @Test
    public void maximumFloat_at_firstPosition() {
        FindMaximum findMaximum = new FindMaximum();
        Double max = findMaximum.analyzeMaximum(4.2,2.5,3.8);
        Assert.assertEquals((Double) 4.2,(Double)max);
    }

    @Test
    public void maximumFloat_at_secondPosition() {
        FindMaximum findMaximum = new FindMaximum();
        Double max = findMaximum.analyzeMaximum(2.2,4.2,3.8);
        Assert.assertEquals((Double) 4.2,(Double)max);
    }

    @Test
    public void maximumFloat_at_thirdPosition() {
        FindMaximum findMaximum = new FindMaximum();
        Double max = findMaximum.analyzeMaximum(4.2,2.5,7.8);
        Assert.assertEquals((Double) 7.8,(Double)max);
    }

    @Test
    public void maximumCharacter_at_firstPosition() {
        FindMaximum findMaximum = new FindMaximum();
        String max = findMaximum.analyzeMaximum("Pineapple","Peach", "Banana");
        Assert.assertEquals((String) "Pineapple",(String)max);
    }

    @Test
    public void maximumString_at_secondPosition() {
        FindMaximum findMaximum = new FindMaximum();
        String max = findMaximum.analyzeMaximum("Apple","Cat", "Banana");
        Assert.assertEquals((String) "Cat",(String)max);
    }

    @Test
    public void maximumString_at_thirdPosition() {
        FindMaximum findMaximum = new FindMaximum();
        String max = findMaximum.analyzeMaximum("Apple","Peach", "Yak");
        Assert.assertEquals((String) "Yak",(String)max);
    }
}
