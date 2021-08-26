package com.company;

public class Main {

    public static void main(String[] args) {

        shouldWakeUp(true, 05);
        shouldWakeUp(false, 28);
        shouldWakeUp(true, 28);
        shouldWakeUp(true, 14);
        shouldWakeUp(false, 03);


    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeUp = !barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay < 23 && hourOfDay > 7) ? false : true;

        System.out.println("woken up: " + wakeUp);
        return wakeUp;
    }


}
