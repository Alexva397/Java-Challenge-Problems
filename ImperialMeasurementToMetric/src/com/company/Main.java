package com.company;

public class Main {

    public static void main(String[] args) {
	    calcFeetAndInchesToCentimeters(4.00, 10.67);

	    calcFeetAndInchesToCentimeters(142);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        } else {
            double feetToCm = 2.54 * (feet * 12);
            System.out.println("ft to cm " + feetToCm);
            double inchesToCm = 2.54 * inches;
            double total = feetToCm + inchesToCm;
            System.out.println("total " + total);
            return total;
        }

    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println("inches " + feet + " ft and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
