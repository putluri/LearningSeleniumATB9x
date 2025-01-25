package com.arjunproject.ex47_TestNGAnnotations;

import org.testng.annotations.*;

public class AllAnnotations {

      @BeforeSuite
      void bs()
        {
            System.out.println("This is BeforeSuite method...");
        }

        @AfterSuite
        void as()
        {
            System.out.println("This is AfterSuite method...");
        }

        @BeforeClass
        void bc()
        {
            System.out.println("This is BeforeClass method...");
        }

        @AfterClass
        void ac()
        {
            System.out.println("This is AfterClass method...");
        }

        @BeforeTest
        void bt()
        {
            System.out.println("This is BeforeTest method...");
        }

        @AfterTest
        void at()
        {
            System.out.println("This is AfterTest method...");
        }

        @BeforeMethod
        void bm()
        {
            System.out.println("This is BeforeMethod method...");
        }

        @AfterMethod
        void am()
        {
            System.out.println("This is AfterMethod method...");
        }

        @Test
        void test1()
        {
            System.out.println("This is Test1 method...");
        }

        @Test
        void test2()
        {
            System.out.println("This is Test2 method...");
        }

}
