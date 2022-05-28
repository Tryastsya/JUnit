package com.test.class02;

//        public int div(int a, int b){
//                  return a / b;
//        }

// Test Cases

//          1)   a=5,   b=5,      exp: 1
//          2)   a=5,   b=1,      exp: 5
//          3)   a=1,   b=5,      exp: 0
//          4)   a=-15, b=-3      exp: 5
//          5)   a=-15, b=3,      exp: -5
//          6)   a=0,   b=0,      exp: 0
//          7)   a=8000, b=160,   exp: 50
//          8)   a= -20, b = 40   exp: 0


import com.main.Calculator;
import com.test.group.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DivTest {
    Calculator c;

    @Before
    public void setUp(){
        c = new Calculator();
    }

    @Category({CriticalTest.class, ChiragTest.class})
    @Test
    public void verifyWithTwoPositive1(){
        int expResult = 1;
        int actResult = c.div(5,5);
        Assert.assertEquals(expResult, actResult);

    }

    @Category({SmokeTest.class, OlehTest.class})
    @Test
    public void verifyWithTwoPositive2(){
        int expResult = 5;
        int actResult = c.div(5,1);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({WIPTest.class, ChiragTest.class})
    @Test
    public void verifyWithTwoPositive3(){
        int expResult = 0;
        int actResult = c.div(1,5);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({CriticalTest.class, WIPTest.class})
    @Test
    public void verifyWithTwoNegatives(){
        int expResult = 5;
        int actResult = c.div(-15,-3);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({SmokeTest.class, CriticalTest.class})
    @Test
    public void verifyWithOnePositiveAndOneNegative1(){
        int expResult = -3;
        int actResult = c.div(-15,5);
        Assert.assertEquals(expResult, actResult);
    }

    @Category({OlehTest.class, ChiragTest.class})
    @Test
    public void verifyWithTwoZeros(){
        int expResult = 0;
        int actResult = c.div(0, 0);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithTwoPositives4(){
        int expResult = 50;
        int actResult = c.div(8000, 160);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithOnePositiveAndOneNegative2(){
        int expResult = 0;
        int actResult = c.div(-20,40);
        Assert.assertEquals(expResult, actResult);
    }
}
