package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task5Test {
    @Test
    @DisplayName("Проверка на полиндрома")
    void testIsPalindrome(){
        int number = 121;
        assertTrue(Task5.isPalindrome(number));
    }

    @Test
    void testIsPalindromeDescendant(){
        int number = 11211230;
        assertTrue(Task5.isPalindromeDescendant(number));
    }
    @Test
    void testIsPalindromeDescendantWithInvalidInput() {
        int invalidNumber = 1234567890;
        assertFalse(Task5.isPalindromeDescendant(invalidNumber));
    }

}
