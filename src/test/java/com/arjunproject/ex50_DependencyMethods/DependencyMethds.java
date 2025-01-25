package com.arjunproject.ex50_DependencyMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethds {

    @Test(priority = 1)
    void openapp()
    {
        Assert.assertTrue(true);
    }

    @Test(priority = 2,dependsOnMethods = {"openapp"})
    void login()
    {
        Assert.assertTrue(true);
    }

    @Test(priority = 3, dependsOnMethods = {"login"})
    void search()
    {
        Assert.assertTrue(false);
    }

    @Test(priority = 4, dependsOnMethods = {"login","search"})
    void advSearch()
    {
        Assert.assertTrue(true);
    }

    @Test(priority = 5, dependsOnMethods = {"login"})
    void logout()
    {
        Assert.assertTrue(true);
    }
}
