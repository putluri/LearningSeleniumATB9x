package com.arjunproject.ex46_TestCases;

/*
1) Open app
2) Login
3) Logout
 */

import org.testng.annotations.Test;

public class FirstTestCase71 {

    @Test(priority = 1)
    void openapp() {
        System.out.println("This is for opening application");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("This is for login");
    }

    @Test(priority = 3)
    void logout() {
        System.out.println("This is for logout");
    }
}
