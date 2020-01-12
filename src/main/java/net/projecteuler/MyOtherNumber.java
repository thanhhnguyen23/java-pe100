package net.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class MyOtherNumber {
    List<Integer> primes = new ArrayList<>();

    public Integer findNthPrime(long n) {
        for (int i = 1; i < Math.pow(2, n); i++) {
            if (isPrime(i)) {
                primes.add(i);
                if (isNPrime(n)) break;
            }
        }
        return primes.get(primes.size() - 1);
    }

    private boolean isNPrime(long n) {
        return primes.size() > n;
    }

    public boolean isPrime(long n) {
        int sqrt = (int) Math.sqrt(n) + 1;
        for (int i = 2; i < sqrt; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
