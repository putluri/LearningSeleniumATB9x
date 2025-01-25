package com.arjunproject.ex47_TestNGAnnotations;


import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

     @Test
     void testTitle()
     {
         String exp_title = "Opencart";
         String act_title = "Opencart";

//         if(exp_title.equals(act_title))
//         {
//             System.out.println("Test passed");
//         }
//         else
//         {
//             System.out.println("Test failed");
//         }

//         Assert.assertEquals(act_title,exp_title);

         if(exp_title.equals(act_title))
         {
             System.out.println("Test passed");
             Assert.assertTrue(true);
         }
         else
         {
             System.out.println("Test failed");
             Assert.assertTrue(false);
         }
     }
}
