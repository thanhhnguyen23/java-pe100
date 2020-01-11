package net.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Problem 5: Smallest multiple
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to n?
 */
public class Problem05Spec {

    // additional tests
    @Test
    public void givenInput10_Return2520() {
        SmallestMultiple smallestMultiple = new SmallestMultiple();
        assertEquals(2520, smallestMultiple.isDivisibleFrom1ToNProcessor(10));
    }

    // original tests: https://www.freecodecamp.org/learn/coding-interview-prep/project-euler/problem-5-smallest-multiple
    @Test
    public void givenInput5_Return60() {
        SmallestMultiple smallestMultiple = new SmallestMultiple();
        assertEquals(60, smallestMultiple.isDivisibleFrom1ToNProcessor(5));
    }

    @Test
    public void givenInput7_Return420() {
        SmallestMultiple smallestMultiple = new SmallestMultiple();
        assertEquals(420, smallestMultiple.isDivisibleFrom1ToNProcessor(7));
    }

    @Test
    public void givenInput13_return360360() {
        SmallestMultiple smallestMultiple = new SmallestMultiple();
        assertEquals(360360, smallestMultiple.isDivisibleFrom1ToNProcessor(13));
    }

    @Test
    public void givenInput20_return232792560() {
        SmallestMultiple smallestMultiple = new SmallestMultiple();
        assertEquals(232792560, smallestMultiple.isDivisibleFrom1ToNProcessor(20));
    }

}
