package com.arjunproject.ex48_Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {

    @Test
    void bt() {
        System.out.println("This is xyz from C2...");
    }

    @AfterTest
    void at() {
        System.out.println("This is AfterTest method ...");
    }
}
