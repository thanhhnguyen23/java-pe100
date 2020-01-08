package net.projecteuler;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Problem 3: Largest prime factor
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the given number?
 */
public class Problem03Spec {

    // original tests: https://www.freecodecamp.org/learn/coding-interview-prep/project-euler/problem-3-largest-prime-factor
    @Test
    public void givenInput_2Return2() {
        MyNumber myNumber = new MyNumber();
        assertEquals(2, myNumber.findLargestPrimeFactor(2), 0.01);
    }

    @Test
    public void givenInput_3Return3() {
        MyNumber myNumber = new MyNumber();
        assertEquals(3, myNumber.findLargestPrimeFactor(3), 0.01);
    }

    @Test
    public void givenInput_5Return5() {
        MyNumber myNumber = new MyNumber();
        assertEquals(5, myNumber.findLargestPrimeFactor(5), 0.01);
    }

    @Test
    public void givenInput_7Return7() {
        MyNumber myNumber = new MyNumber();
        assertEquals(7L, myNumber.findLargestPrimeFactor(7), 0.01);
    }

    @Test
    public void givenInput_13195Return29() {
        MyNumber myNumber = new MyNumber();
        assertEquals(29L, myNumber.findLargestPrimeFactor(13195), 0.01);
    }

    @Test
    public void givenInput_600851475143Return6857() {
        MyNumber myNumber = new MyNumber();
        assertEquals(6857L, myNumber.findLargestPrimeFactor(600851475143L), 0.01);
    }

    // additional tests
    @Test
    public void givenInputReturnFactors() {
        MyNumber myNumber = new MyNumber();
        assertEquals(Arrays.asList(2L,3L,4L,6L,8L,12L,24L), myNumber.findFactors(24));
    }

    @Test
    public void givenFactorsReturnPrime() {
        MyNumber myNumber = new MyNumber();
        assertTrue(myNumber.isPrime(2));
    }

    @Test
    public void givenInputReturnPrimeFactors() {
        MyNumber myNumber = new MyNumber();
        assertEquals(Collections.singletonList(3L), myNumber.findPrimeFactors(24));
    }

    @Test
    public void givenInputReturnLargestPrimeFactors() {
        MyNumber myNumber = new MyNumber();
        assertEquals(3, myNumber.findLargestPrimeFactor(24), 0.01);
    }

}
