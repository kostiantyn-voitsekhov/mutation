package com.mutation.reverse;

public class Reverse {

    public String reverseString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
