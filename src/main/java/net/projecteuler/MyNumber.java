package net.projecteuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyNumber {

    List<Long> primeFactors = new ArrayList<>();
    List<Long> factors = new ArrayList<>();

    private long input;

    public List<Long> findFactors(long input) {
        setInput(input);
        findFractorsProcessor();
        return factors;
    }

    private void findFractorsProcessor() {
        if (smallInputs()) {
            for (int i = 1; i <= getInput(); ++i) {
                processingFactors(i);
            }

        } else {
            for (int i = 1; i <= Math.sqrt(getInput()) + 1; ++i) {
                processingFactors(i);
            }
        }
        removeFirstElement();
    }

    private boolean smallInputs() {
        return getInput() < 99999;
    }

    private void processingFactors(int i) {
        if (getInput() % i == 0) {
            factors.add((long) i);
        }
    }

    private void removeFirstElement() {
        if (factors.size() > 2) {
            factors.remove(0);
        }
    }

    public boolean isPrime(long primeNumber) {
        int sqrt = (int) Math.sqrt(primeNumber) + 1;
        return isPrimeProcessor(primeNumber, sqrt);
    }

    private boolean isPrimeProcessor(long primeNumber, int sqrt) {
        for (int i = 2; i < sqrt; ++i) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Long> findPrimeFactors(long input) {
        setInput(input);
        long factorsSize = findFactors(getInput()).size();

        primeFactorsProcessor(factorsSize);

        return primeFactors;
    }

    private void primeFactorsProcessor(long factorsSize) {
        for (int i = 0; i < factorsSize; ++i) {
            if (isPrime(getFactors().get(i))) {
                primeFactors.add(getFactors().get(i));
            }
        }
        if (primeFactors.size() > 1) {
            primeFactors.remove(0);
        }
    }

    public Long findLargestPrimeFactor(long input) {
        setInput(input);
        findPrimeFactors(input);
        return Collections.max(getPrimeFactors());
    }

    public List<Long> getPrimeFactors() {
        return this.primeFactors;
    }

    public List<Long> getFactors() {
        return this.factors;
    }

    public long getInput() {
        return this.input;
    }

    public void setInput(long input) {
        this.input = input;
    }
}
