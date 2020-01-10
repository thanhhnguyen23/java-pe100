package net.projecteuler;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class PalindromeProduct {
    private Integer input;

    public boolean isPalindrome(Integer input) {
        return isPalindromeProcessor(input);
    }

    private boolean isPalindromeProcessor(Integer input) {
        setInput(input);
        StringBuilder reverse = new StringBuilder();
        int length = getInput().toString().toCharArray().length;
        reverseInputProcessor(input, reverse, length);

        return getInput().toString().equals(reverse.toString());
    }

    private void reverseInputProcessor(Integer input, StringBuilder reverse, int length) {
        for (int i = length - 1; i >= 0; i--)
            reverse.append(input.toString().charAt(i));
    }

    public Integer findLargestPalindrome(Integer input) {
        setInput(input);
        Set<Integer> palindromeSet = new HashSet<>();

        palindromeProcessor(palindromeSet);

        Collections.max(palindromeSet);
        return Collections.max(palindromeSet);
    }

    private void palindromeProcessor(Set<Integer> palindromeSet) {
        int length = getInput();
        if (getInput().equals(length)) {
            String largestDigit = Stream.generate(() -> "9").limit(length).collect(joining());
            Integer nDigits = Integer.parseInt(largestDigit);

            productProcessor(palindromeSet, nDigits);
        }
    }

    private void productProcessor(Set<Integer> palindromeSet, Integer nDigits) {
        int product;
        for (int i = nDigits; i >= 0; i--) {
            for (int j = nDigits; j >= 0; j--) {

                product = i * j;

                findPalindrome(product, palindromeSet);
            }
        }
    }

    private void findPalindrome(int product, Set<Integer> palindromeSet) {
        if (isPalindrome(product)) {
            palindromeSet.add(product);
        }
    }

    public Integer getInput() {
        return input;
    }

    public void setInput(Integer input) {
        this.input = input;
    }
}
