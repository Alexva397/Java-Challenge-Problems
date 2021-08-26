package com.company;

public class Main {

    public static void main(String[] args) {
        isLeapYear(1900);
        isLeapYear(1920);
        isLeapYear(1600);
        isLeapYear(2000);
    }

    public static boolean isLeapYear(int year){
        if (year > 9999 || year < 1) {
            System.out.println("Invalid Year");
            return false;
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Is a leap year!");
            return true;
        } else {
            System.out.println("Is not a leap year.");
            return false;
        }
    }
}
