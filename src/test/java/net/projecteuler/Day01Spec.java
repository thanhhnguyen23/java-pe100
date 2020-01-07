package net.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Problem 1: Multiples of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below the provided parameter value number.
 */
public class Day01Spec {

    // original tests: https://www.freecodecamp.org/learn/coding-interview-prep/project-euler/problem-1-multiples-of-3-and-5
    @Test
    public void givenInput_1000Return_233168(){
        MultiplesOfThreeAndFive multiples = new MultiplesOfThreeAndFive(1000);
        assertEquals(233168, multiples.captureResults());
    }
    @Test
    public void givenInput_49Return_543(){
        MultiplesOfThreeAndFive multiples = new MultiplesOfThreeAndFive(49);
        assertEquals(543, multiples.captureResults());
    }
    @Test
    public void givenInput_19564Return_89301183(){
        MultiplesOfThreeAndFive multiples = new MultiplesOfThreeAndFive(19564);
        assertEquals(89301183, multiples.captureResults());
    }
    @Test
    public void givenInput_8456Return_16687353(){
        MultiplesOfThreeAndFive multiples = new MultiplesOfThreeAndFive(8456);
        assertEquals(16687353, multiples.captureResults());
    }

    // additional tests
    @Test
    public void givenInput_100Return_2318(){
        MultiplesOfThreeAndFive multiples = new MultiplesOfThreeAndFive(100);
        assertEquals(2318, multiples.captureResults());
    }

    @Test
    public void givenInput10Return23(){
        MultiplesOfThreeAndFive multiples = new MultiplesOfThreeAndFive(10);
        assertEquals(23, multiples.captureResults());
    }

}
