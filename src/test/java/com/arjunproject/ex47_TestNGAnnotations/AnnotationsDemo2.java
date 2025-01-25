package com.arjunproject.ex47_TestNGAnnotations;

import org.testng.annotations.*;

/*/
1) login --@BeforeClass
2) Search --@Test
5)Advanced Search --@Test
6) Logout --@AfterClass
 */
public class AnnotationsDemo2 {

    @BeforeClass
     void login() {
        System.out.println("This is for login");
    }

    @Test(priority = 1)
    void search() {
        System.out.println("This is for search");
    }

    @Test(priority = 2)
    void advancedSearch() {
        System.out.println("This is for advanced search");
    }

    @AfterClass
    void logout() {
        System.out.println("This is for logout");
    }
}
