package com.mutation.module1.dosome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DoSomethingTest {
    @Test
     void whenPalindrom_thenAccept() {
        DoSomething palindromeTester = new DoSomething();
        assertTrue(palindromeTester.isPalindrome("noon"));
    }

}
