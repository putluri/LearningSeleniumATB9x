package com.arjunproject.ex49_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

   // @Test
    void test_hardassertions()
    {
        System.out.println("Testing...");
        System.out.println("Testing...");

        Assert.assertEquals(1,2); //Hard assertions

        System.out.println("Testing...");
        System.out.println("Testing...");
    }

    @Test
    void test_softassertions()
    {
        System.out.println("Testing...");
        System.out.println("Testing...");

        SoftAssert  sa = new SoftAssert();
        sa.assertEquals(1,2); //Soft assertions

        System.out.println("Testing...");
        System.out.println("Testing...");

        sa.assertAll(); //Mandatory
    }
}
