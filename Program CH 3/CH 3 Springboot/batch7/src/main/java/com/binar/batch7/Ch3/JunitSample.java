package com.binar.batch7.Ch3;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JunitSample {

    private MathService mathService = new MathService();

    @Before
    public void init(){
        System.out.println("akan dijalankan pertama kali");
    }

    @Test
    public void testAdd(){
        int result = mathService.add(3,5);
        Assert.assertEquals(8, result);
    }

    @Test
    public void testAddFailed(){
        int result = mathService.add(4,12);
        Assert.assertEquals(9, result);
    }

    @After
    public void afterSample(){
        System.out.println("akan dijalankan terakhir kali");
    }
}
