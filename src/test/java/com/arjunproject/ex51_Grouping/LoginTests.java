package com.arjunproject.ex51_Grouping;

import org.testng.annotations.Test;

public class LoginTests {

    @Test(priority = 1, groups = {"sanity"})
    void loginByEmail() {
        System.out.println("This is Login by email..");
    }

    @Test(priority = 2, groups = {"sanity"})
    void loginByFacebook() {
        System.out.println("This is Login by facebook..");
    }

    @Test(priority = 3, groups = {"sanity"})
    void loginByTwitter() {
        System.out.println("This is Login by twitter..");
    }
}
