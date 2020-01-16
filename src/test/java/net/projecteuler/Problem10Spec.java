package net.projecteuler;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * Problem 10: Summation of primes
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below n.
 */

public class Problem10Spec {

    // original tests: https://www.freecodecamp.org/learn/coding-interview-prep/project-euler/problem-10-summation-of-primes
    @Test
    public void given17_Return41(){
        SumOfPrimes sumOfPrimes = new SumOfPrimes();
        assertEquals(BigInteger.valueOf(41), sumOfPrimes.results(17));
    }

    @Test
    public void given2001_Return277050() {
        SumOfPrimes sumOfPrimes = new SumOfPrimes();
        assertEquals(BigInteger.valueOf(277050), sumOfPrimes.results(2001));
    }

    @Test
    public void given140759_Return873608362(){
        SumOfPrimes sumOfPrimes = new SumOfPrimes();
        assertEquals(BigInteger.valueOf(873608362), sumOfPrimes.results(140759));
    }

    @Test
    public void given2000000_Return142_913_828_922(){
        SumOfPrimes sumOfPrimes = new SumOfPrimes();
        assertEquals(BigInteger.valueOf(142_913_828_922L), sumOfPrimes.results(2000000));
    }

}
