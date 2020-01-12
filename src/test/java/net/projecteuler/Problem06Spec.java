package net.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Problem 6: Sum square difference
 * The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
 * 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first n natural numbers and the square of the sum.
 */
public class Problem06Spec {

    // original tests: https://www.freecodecamp.org/learn/coding-interview-prep/project-euler/problem-6-sum-square-difference
    @Test
    public void given10_Return2640() {
        SumSquareDifference ssd = new SumSquareDifference();
        assertEquals(2640, ssd.difference(10));
    }

    @Test
    public void given20_Return41230() {
        SumSquareDifference ssd = new SumSquareDifference();
        assertEquals(41230, ssd.difference(20));
    }

    @Test
    public void given100_Return25164150() {
        SumSquareDifference ssd = new SumSquareDifference();
        assertEquals(25164150, ssd.difference(100));
    }

    // additional tests
    @Test
    public void givenInput_ReturnSumOfSquaresOfTheFirstNNaturalNumbers() {
        SumSquareDifference ssd = new SumSquareDifference();
        assertEquals(385, ssd.sumOfSquaresOfNNumbers(10));
    }

    @Test
    public void givenInput_ReturnSquareOfSumOfTheFirstNNumbers() {
        SumSquareDifference ssd = new SumSquareDifference();
        assertEquals(3025, ssd.squareOfSumOfNNumbers(10));
    }

    @Test
    public void givenInput_ReturnSquareOfSum_Minus_sumOfSquares() {
        SumSquareDifference ssd = new SumSquareDifference();
        assertEquals(2640, ssd.difference(10));
    }
}
