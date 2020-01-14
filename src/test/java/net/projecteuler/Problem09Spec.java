package net.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Problem 9: Special Pythagorean triplet
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc such that a + b + c = n.
 *
 */

public class Problem09Spec {

    // original tests: https://www.freecodecamp.org/learn/coding-interview-prep/project-euler/problem-9-special-pythagorean-triplet
    @Test
    public void given1000_Return31875000(){
        PythagoreanTriplet pythagoreanTriplet = new PythagoreanTriplet();
        assertEquals(31875000, pythagoreanTriplet.findTriplet(1000));
    }

    @Test
    public void given24_Return480(){
        PythagoreanTriplet pythagoreanTriplet = new PythagoreanTriplet();
        assertEquals(480, pythagoreanTriplet.findTriplet(24));
    }

    @Test
    public void given120_Return49920_OR_55080_OR_60000(){
        PythagoreanTriplet pythagoreanTriplet = new PythagoreanTriplet();
        assertEquals(60000, pythagoreanTriplet.findTriplet(120));
    }

}
