package com.company;

public class Main {

    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(3.175, 3.175);
        areEqualByThreeDecimalPlaces(1.11111, 1.1124);
    }
    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
        int numberOne = (int)(numOne * 1000);
        int numberTwo = (int)(numTwo * 1000);
        System.out.println("One: " + numberOne);
        System.out.println("Two: " + numberTwo);

        boolean isEqual = numberOne == numberTwo ? true : false;
        return isEqual;
    }


}
