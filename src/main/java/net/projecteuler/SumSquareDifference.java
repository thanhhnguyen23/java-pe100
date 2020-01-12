package net.projecteuler;

public class SumSquareDifference {

    public int sumOfSquaresOfNNumbers(int n) {
        int sumSquare = 0;
        for(int i = n; i > 0; i--){
            sumSquare += (i * i);
        }
        return sumSquare;
    }

    public int squareOfSumOfNNumbers(int n) {
        double squareSum = 0;
        for(int i = n; i > 0; i--){
            squareSum += i;
        }
        squareSum = Math.pow(squareSum,2);
        return (int) squareSum;
    }

    public int difference(int n) {
        int result = 0;
        return squareOfSumOfNNumbers(n) - sumOfSquaresOfNNumbers(n);
    }
}
