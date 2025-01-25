package com.arjunproject.ex51_Grouping;

import org.testng.annotations.Test;

public class PaymentTests {

    @Test(priority = 1, groups = {"sanity","regression","functional"})
    void paymentinRupees() {
        System.out.println("This is payment in rupees..");
    }

    @Test(priority = 2, groups = {"sanity","regression","functional"})
    void paymentinDollors() {
        System.out.println("This is payment in Dollors..");
    }

    }

