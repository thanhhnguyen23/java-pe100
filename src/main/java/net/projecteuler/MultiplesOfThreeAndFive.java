package net.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class MultiplesOfThreeAndFive {
    private int input;
    private List<Integer> multiples = new ArrayList<>();

    public MultiplesOfThreeAndFive(int input) {
        this.input = input;
    }

    public int captureResults() {
        return captureValues().stream()
                .mapToInt(i -> i)
                .sum();
    }

    public List<Integer> captureValues() {
        processMultiples();
        return getMultiples();
    }

    private void processMultiples() {
        for(int i = 1; i < getInput(); i++){
            if(i % 5 == 0){
                multiples.add(i);
            }
            else if(i % 3 == 0){
                multiples.add(i);
            }
        }
    }

    public int getInput() {
        return this.input;
    }

    public List<Integer> getMultiples() {
        return this.multiples;
    }

}
