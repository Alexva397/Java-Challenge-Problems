package com.company;

public class Main {

    public static void main(String[] args) {
        hasTeen(22,24,29);
        hasTeen(17, 25, 19);

    }
    public static boolean hasTeen(int personOne, int personTwo, int personThree) {
        return (isTeen(personOne) || isTeen(personTwo) || isTeen(personThree));
    }
    public static boolean isTeen(int person) {
        if (person < 20 && person > 12) {
            return true;
        }
        return false;
    }
}
