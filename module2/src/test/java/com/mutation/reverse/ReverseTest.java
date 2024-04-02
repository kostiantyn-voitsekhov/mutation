package com.mutation.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReverseTest {

    @Test
     void testReverseString() {
        Reverse manipulation = new Reverse();

        assertEquals("olleH", manipulation.reverseString("Hello"));

        assertEquals("", manipulation.reverseString(""));

        assertEquals("!dlroW ,olleH", manipulation.reverseString("Hello, World!"));

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            manipulation.reverseString(null);
        });

        assertEquals("Input string cannot be null", exception.getMessage());
    }

}
