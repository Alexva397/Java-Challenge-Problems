package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0 ) {
            System.out.println("Invalid Value");
        } else {
            long minutesInYear = (1440 * 365);
            long years = minutes / (1440 * 365);
            long remainder = minutes % (1440 * 365);
            long days = remainder / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
