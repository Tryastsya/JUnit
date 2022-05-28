package com.test.class03;

import org.junit.Assert;
import org.junit.Test;

public class InClassDemo {

    @Test
    public void verifyUserCanLoginIntoTheApp(){
        System.out.println("============ Test 1=====================");
        System.out.println("Enter correct username and password");
        System.out.println("click on login button");
        System.out.println("verify login successful");
    }

    @Test
    public void verifyUserCannotLoginWithInvalidCred(){
        System.out.println("============ Test 2=====================");
        System.out.println("Enter invalid username and password");
        System.out.println("click on login button");
        System.out.println("verify invalid login error message");
    }
}
