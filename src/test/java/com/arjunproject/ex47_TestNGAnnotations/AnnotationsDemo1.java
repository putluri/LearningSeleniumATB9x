package com.arjunproject.ex47_TestNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*/
1) login --@BeforeMethod
2) Search --@Test
3) logout --@AfterMethod
4) login --@BeforeMethod
5)Advanced Search --@Test
6) Logout --@AfterMethod
 */
public class AnnotationsDemo1 {

    @BeforeMethod
     void login() {
        System.out.println("This is for login");
    }

    @Test
    void search() {
        System.out.println("This is for search");
    }

    @Test
    void advancedSearch() {
        System.out.println("This is for advanced search");
    }

    @AfterMethod
    void logout() {
        System.out.println("This is for logout");
    }
}
