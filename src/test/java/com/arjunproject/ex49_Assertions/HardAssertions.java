package com.arjunproject.ex49_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

    @Test
    void test()
    {
       // Assert.assertEquals("xyz","xyz");
       // Assert.assertEquals(123,456);
      //  Assert.assertEquals("xyz",123);
      //  Assert.assertEquals("123",123);
       // Assert.assertNotEquals(123,123);
       // Assert.assertNotEquals(123,456);
//        Assert.assertTrue(true);
//        Assert.assertFalse(false);
//        Assert.assertTrue(1==2);
//        Assert.assertTrue(1==1);
//        Assert.assertFalse(1==2);
//        Assert.assertFalse(1==1);
        Assert.fail();

    }
}
