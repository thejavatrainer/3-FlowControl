package com.javatrainer.module3.flowcontrol;

import java.util.Scanner;

public class MinMaxThreeNumbers {
    private static int maximum(int a, int b, int c) {
        int max;
        max = a;
        if (max > b) {
            if (max > c) ;
            else {
                max = c;
            }
        } else {
            if (max < c) {
                max = c;
            } else {
                max = b;
            }
        }


        return max;
    }

    private static int minimum(int a, int b, int c) {
        int min;
        min = a;
        if (min < b) {
            if (min < c) ;
            else {
                min = c;
            }
        } else {
            if (min > c) {
                min = c;
            } else {
                min = b;
            }
        }


        return min;
    }

    public static void main(String args[]) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;

        Scanner inputData = new Scanner(System.in);
        System.out.print(" Get first number:");
        firstNumber = inputData.nextInt();
        System.out.print(" Get second number:");
        secondNumber = inputData.nextInt();
        System.out.print(" Get third number:");
        thirdNumber = inputData.nextInt();
        System.out.print(" Minimum" + minimum(firstNumber, secondNumber, thirdNumber) + " Maximum" + maximum(firstNumber, secondNumber, thirdNumber));
    }
}
