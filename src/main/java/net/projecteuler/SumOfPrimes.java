package net.projecteuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SumOfPrimes {

    List<BigInteger> primes = new ArrayList<>();
    private long input;

    public List<BigInteger> findPrimes(BigInteger n) {
        for(BigInteger i = BigInteger.valueOf(2); i.compareTo(n) < 0; i = i.add(BigInteger.ONE)){
            if (isPrime((i))) {
                primes.add(i);
            }
        }
        setPrimes(primes);

        return primes;
    }

    public boolean isPrime(BigInteger n) {
        BigInteger lessOne = n.subtract(BigInteger.ONE);
        return lessOne.nextProbablePrime().compareTo(n) == 0;
    }

    public BigInteger calculateSumOfPrimes(List<BigInteger> primesList) {
        return primesList.stream()
                .reduce(BigInteger.ZERO, BigInteger::add);
    }

    public BigInteger results(long input) {
        setInput(input);
        findPrimes(getInput());

        return calculateSumOfPrimes(getPrimes());
    }

    public List<BigInteger> getPrimes() {
        return primes;
    }

    public void setPrimes(List<BigInteger> primes) {
        this.primes = primes;
    }

    public BigInteger getInput() {
        return BigInteger.valueOf(input);
    }

    public void setInput(long input) {
        this.input = input;
    }

}


