package net.projecteuler;

public class PythagoreanTriplet {
    private long n;

    public long findTriplet(long n) {
        setN(n);
        long output = 0;

        for (int a = 3; a < (n / 3); a++) {
            for (int b = 4; b < (n / 2); b++) {

                double c = Math.pow(a, 2) + Math.pow(b, 2);
                c = Math.sqrt(c);

                if ((a + b + c) == getN()) {
                    output = (long) (a * b * c);
                    break;
                }
            }
        }
        return output;
    }

    public long getN() {
        return n;
    }

    public void setN(long n) {
        this.n = n;
    }

}
