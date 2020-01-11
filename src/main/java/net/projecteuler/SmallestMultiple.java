package net.projecteuler;

public class SmallestMultiple {

    public boolean multiplesProcessor(int startNum, int upperBoundNum) {
        for(int i = 1; i < upperBoundNum+ 1; i++){
            if(startNum % i != 0){
                return false;
            }
        }
        return true;
    }

    public int isDivisibleFrom1ToNProcessor(int upperBound) {
        int num = 1;
        while(true){
            if(multiplesProcessor(num, upperBound)){
                break;
            }
            num++;

        }
        return num;
    }

}
