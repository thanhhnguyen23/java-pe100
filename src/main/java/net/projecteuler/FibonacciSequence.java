package net.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
    private List<Integer> recursionValues;

    public List<Integer> captureValues(int input) {
        List<Integer> values = new ArrayList<>();
        for(int i = 1; i < input + 1; i++){
            values.add(fib(i));
        }

        this.recursionValues = values;
        return values;
    }

    private int fib(int input) {
        if(input <= 2) return input;
        else return fib(input - 1) + fib(input - 2);
    }

    public List<Integer> captureResults() {
        List<Integer> evenOutput = new ArrayList<>();
        processEvenValues(evenOutput);

        return evenOutput;
    }

    private void processEvenValues(List<Integer> evenOutput) {
        for(int i = 1; i < getRecursionValues().size(); i++){
            if(getRecursionValues().get(i) % 2 == 0) {
                evenOutput.add(getRecursionValues().get(i));
            }
        }
    }

    public int addEvens() {
        List<Integer> output = new ArrayList<>();
        for(int i = 0; i < getRecursionValues().size(); i++){
            if(getRecursionValues().get(i) % 2 == 0) {
                output.add(getRecursionValues().get(i));
            }
        }

        System.out.println("even values from recursion: " + output);
        return output.stream().mapToInt(i -> Integer.parseInt(String.valueOf(i))).sum();
    }

    public List<Integer> getRecursionValues() {
        return recursionValues;
    }
}
