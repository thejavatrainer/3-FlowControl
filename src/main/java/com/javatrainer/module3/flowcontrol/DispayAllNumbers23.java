package com.javatrainer.module3.flowcontrol;

public class DispayAllNumbers23 {

    public static void displayAllNumbersOdd23() {
        int numere23 = 23;
        System.out.print("Numerele sunt impatite la 67 si rest 23: ");
        while (numere23 <= 99999) {
            if (numere23 != 23) {
                System.out.print(", " + numere23);
            } else {
                System.out.print(numere23);
            }
            numere23 = numere23 + 67;

        }
    }

    public static void main(String args[]) {
        displayAllNumbersOdd23();
    }

}
