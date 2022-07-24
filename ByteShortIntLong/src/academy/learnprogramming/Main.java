package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value: " + myMinIntValue);
        System.out.println("Integer maximum value: " + myMaxIntValue);

        //Challenge - Primitive Types

        byte myByte = 127;
        short myShort = 2048;
        int myInt = 2500000;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);

        System.out.println(myLong);

        short myShortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
    }
}
