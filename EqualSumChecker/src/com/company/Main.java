package com.company;

public class Main {

    public static void main(String[] args) {
        hasEqualSum(3,3,6);
        hasEqualSum(4,4,9);

    }

    public static boolean hasEqualSum(int numOne, int numTwo, int numThree) {
        boolean isEqual = (numOne + numTwo == numThree) ? true : false;
        System.out.println(isEqual);
        return  isEqual;
    }
}
