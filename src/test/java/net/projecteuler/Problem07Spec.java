package net.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Problem 7: 10001st prime
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the nth prime number?
 */
public class Problem07Spec {

    // original tests: https://www.freecodecamp.org/learn/coding-interview-prep/project-euler/problem-7-10001st-prime
    @Test
    public void given6_return13(){
        MyOtherNumber myOtherNumber = new MyOtherNumber();
        assertEquals(13, myOtherNumber.findNthPrime(6), 0.01);
    }

    @Test
    public void given10_return29(){
        MyOtherNumber myOtherNumber = new MyOtherNumber();
        assertEquals(29, myOtherNumber.findNthPrime(10), 0.01);
    }

    @Test
    public void given100_return541(){
        MyOtherNumber myOtherNumber = new MyOtherNumber();
        assertEquals(541, myOtherNumber.findNthPrime(100), 0.01);
    }

    @Test
    public void given1000_return7919(){
        MyOtherNumber myOtherNumber = new MyOtherNumber();
        assertEquals(7919, myOtherNumber.findNthPrime(1000), 0.01);
    }

    @Test
    public void given10001_return104743(){
        MyOtherNumber myOtherNumber = new MyOtherNumber();
        assertEquals(104743, myOtherNumber.findNthPrime(10001), 0.01);
    }

    // additional tests
    @Test
    public void given4_return7(){
        MyOtherNumber myOtherNumber = new MyOtherNumber();
        assertEquals(7, myOtherNumber.findNthPrime(4), 0.01);
    }

}
