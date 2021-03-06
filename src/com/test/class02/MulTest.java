package com.test.class02;

//        public int mul(int a, int b){
//                  return a * b;
//        }

// Test Cases

//          1)   a=0,   b=5,      exp: 0
//          2)   a=0,   b=0,      exp: 0
//          3)   a=-10, b=3,      exp: -30
//          4)   a=-5,  b=-3 ,    exp: 15
//          5)   a=-5,  b=0,      exp: 0
//          6)   a=30,  b=10,     exp: 300
//          7)   a=560, b=1000,   exp: 560000


import com.main.Calculator;
import com.test.group.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MulTest {
    Calculator c;

    @Before
    public void setUp(){
        c = new Calculator();
    }

    @Category({SmokeTest.class, ChiragTest.class})
    @Test
    public void verifyWithOneZeroAndOnePositive(){
        int expResult = 0;
        int actResult = c.mul(0,5);
        Assert.assertEquals(expResult, actResult);

    }

    @Category({OlehTest.class, CriticalTest.class})
    @Test
    public void verifyWithTwoZeros(){
        int expResult = 0;
        int actResult = c.mul(0,0);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({SmokeTest.class, WIPTest.class})
    @Test
    public void verifyWithOnePositiveAndOneNegative(){
        int expResult = -30;
        int actResult = c.mul(-10,3);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithTwoNegatives(){
        int expResult = 15;
        int actResult = c.mul(-5,-3);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithOneZeroAndOneNegative(){
        int expResult = 0;
        int actResult = c.mul(0,-5);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithTwoPositives1(){
        int expResult = 300;
        int actResult = c.mul(10, 30);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithTwoPositives2(){
        int expResult = 560000;
        int actResult = c.mul(1000, 560);
        Assert.assertEquals(expResult, actResult);
    }
}
