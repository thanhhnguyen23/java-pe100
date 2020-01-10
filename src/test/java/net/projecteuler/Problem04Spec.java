package net.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Problem 4: Largest palindrome product
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit
 * numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two n-digit numbers.
 */
public class Problem04Spec {

    // additional tests
    @Test
    public void givenInput_WhenResultIsNotPalindrome_ReturnFalse() {
        PalindromeProduct product = new PalindromeProduct();
        assertFalse(product.isPalindrome(127));
    }

    @Test
    public void givenInput_WhenResultIsPalindrome_ReturnTrue() {
        PalindromeProduct product = new PalindromeProduct();
        assertTrue(product.isPalindrome(121));
    }

    // original tests: https://www.freecodecamp.org/learn/coding-interview-prep/project-euler/problem-4-largest-palindrome-product
    @Test
    public void givenInput_2Return_9009() {
        PalindromeProduct product = new PalindromeProduct();
        assertEquals(9009, product.findLargestPalindrome(2), 0.01);
    }

    @Test
    public void givenInput_3Return906609() {
        PalindromeProduct product = new PalindromeProduct();
        assertEquals(906609, product.findLargestPalindrome(3), 0.01);
    }
}
