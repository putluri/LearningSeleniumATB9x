package com.arjunproject.ex51_Grouping;

import org.testng.annotations.Test;

public class SignupTests {

    @Test(priority = 1, groups = {"regression"})
    void signupbyemail() {
        System.out.println("This is Signup by email..");
    }

    @Test(priority = 2, groups = {"regression"})
    void signupbyfacebook() {
        System.out.println("This is Signup by facebook..");
    }

    @Test(priority = 3, groups = {"regression"})
    void signupbytwitter() {
        System.out.println("This is Signup by twitter..");
    }
}
