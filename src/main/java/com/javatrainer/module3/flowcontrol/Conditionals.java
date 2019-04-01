package com.javatrainer.module3.flowcontrol;

import java.time.LocalDate;
import java.time.temporal.WeekFields;

public class Conditionals {
    public void printIfIsZero_theIfThenStatement(int x) {
        if (x == 0) {
            System.out.println("Yes, it IS zero!");
        }
    }

    public void printIfIsZero_theScrimpyIfThenStatement(int x) {
        if (x == 0)
            System.out.println("Yes, it IS zero!");
    }

    public void isOdd_theIfThenElseStatement(int x) {
        if (x % 2 != 0) { // TODO: pitfall
            System.out.println("Yes, it ODD!");
        } else {
            System.out.println("No, is NOT odd!");
        }
    }

    // TODO: ASCII

    public void printDigitOrLetterOrParantheses_theIfElseIfStatement(char c) {
        if ((c >= '0') && (c <= '9')) {
            System.out.println("Digit: " + c);
        } else if ((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z')) {
            System.out.println("Letter: " + c);
        } else if (c == '(' || c == ')' || c == '[' || c == '}') {
            System.out.println("Parentheses: " + c);
        }
    }

    public int signOfProduct_theIfThenStatements(int x, int y) {
        int response = 0;
        if (x > 0 && y > 0)
            response = +1;

        if (x > 0 && y < 0)
            response = -1;

        if (x < 0 && y > 0)
            response = -1;

        if (x < 0 && y < 0)
            response = +1;

        return response;
    }

    public int signOfProduct_theIfThenStatements_notReallyReadeable(int x, int y) {
        int response;
        if (x > 0) {
            if (y > 0) {
                response = +1;
            } else {
                response = -1;
            }
        } else if (x < 0) {
            if (y > 0) {
                response = -1;
            } else {
                response = +1;
            }
        } else {
            response = 0;
        }

        return response;
    }

    // TODO: noformat, unicode
    public int signOfProduct_theIfThenStatements_scrimpynessIsNotHealthy(int x, int y) {
        int response = 0;
        if (x > 0 && y > 0)
            response = +1;

        if (x > 0 && y < 0) ;
        response = -1;

        if (x < 0 && y > 0)
            response = -1;

        if (x < 0 && y < 0)
            response = +1;

        return response;
    }

    public char getGradeFromScore_theIfThenElseIfElseStatement(int score) {
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public boolean isDigit_minimalist(char c) {
        boolean response = false;
        if (c >= '0' && c <= '9') {
            response = true;
        }
        return response;
    }

    public boolean isDigit_minimalist_optimized_explicit(char c) {
        boolean response = (c >= '0' && c <= '9');
        return response;
    }

    public boolean isDigit_minimalist_optimized_clean(char c) {
        return (c >= '0' && c <= '9');
    }

    public boolean WRONG_isDigit_withSwitch(final int x) {
        boolean response;
        switch (x) {
            case 48 - 57: {
                response = true;
                break;
            }
            default: {
                response = false;
                break;
            }
        }
        return response;
    }


    public void theSwitch(final byte aFinal_byte_Byte, final short aFinal_short_Short,
                          final char aFinal_char_Character, final int aFinal_int_Integer,
                          AnEnum anEnum, String aString) {
        switch (aFinal_int_Integer) { // or one from the specified types as parameter
            case 1: {
                doStuffWhenX_Is1();
                break;
            }
            case 2: {
                doStuffWhenX_Is2();
                break;
            }
            default: {
                doStuffWhenX_IsNeitherOfHandledValues(aFinal_int_Integer);
                break;
            }
        }
    }

    private enum AnEnum {
        VALUE1, VALUE2, VALUE3, VALUE4
    }

    public void theSwitch_withFallThrough(final byte aFinal_byte_Byte,
                                          final short aFinal_short_Short, final char aFinal_char_Character,
                                          final int aFinal_int_Integer, AnEnum anEnum, String aString) {
        switch (anEnum) { // or one from the here specified types as parameter
            case VALUE1:
            case VALUE2: {
                doStuffWhenEnum_Is1(); // or doStuffWhenEnum_Is_1_or_2();
                doStuffWhenEnum_Is2();
                break;
            }
            default: {
                doStuffWhenTheEnum_IsNeitherOfTheHandledValues(anEnum);
                break;
            }
        }
    }


    public void theSwitch_withDefaultInside(final byte aFinal_byte_Byte,
                                            final short aFinal_short_Short, final char aFinal_char_Character,
                                            final int aFinal_int_Integer, AnEnum anEnum, String aString) {
        switch (aString) {  // or one from the specified types as parameter
            case "ABC": {
                doStuffWhenString_IsABC();
                break;
            }
            default: {
                doStuffWhenTheString_IsNeitherOfTheHandledValues(aString);
                break;
            }
            case "DEF": {
                doStuffWhenString_IsDEF();
                break;
            }
        }
    }

    public int theSwitch_withoutDefault(final byte aFinal_byte_Byte,
                                        final short aFinal_short_Short, final char aFinal_char_Character,
                                        final int aFinal_int_Integer, AnEnum anEnum, String aString) {
        int response = 0;
        switch (anEnum) { // or one from the here specified types as parameter
            case VALUE3: {
                response = 3;
                break;
            }
            case VALUE4: {
                response = 4;
                break;
            }
        }
        return response;
    }

    private void doStuffWhenTheString_IsNeitherOfTheHandledValues(String aString) {

    }

    private void doStuffWhenString_IsDEF() {

    }

    private void doStuffWhenString_IsABC() {

    }

    private void doStuffWhenEnum_Is2() {

    }

    private void doStuffWhenEnum_Is1() {

    }

    private void doStuffWhenTheEnum_IsNeitherOfTheHandledValues(AnEnum theEnum) {

    }

    private void doStuffWhenX_IsNeitherOfHandledValues(int finalX) {

    }

    private void doStuffWhenX_Is2() {

    }

    private void doStuffWhenX_Is1() {

    }

    public boolean isDigit_JavaAPI(char c) {
        return Character.isDigit(c);
    }

    public int getNumberOfDaysInMonth(int month, int year) {
        int numberOfDays;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = 30;
                break;
            case 2:
                if (isLeapYear(year))
                    numberOfDays = 29;
                else
                    numberOfDays = 28;
                break;
            default: // month is not in [1,12], error case
                numberOfDays = 0;
                break;
        }
        return numberOfDays;
    }

    private boolean isLeapYear(int year) {
        return ((year % 4 == 0) &&
                !(year % 100 == 0))
                || (year % 400 == 0);
    }

    public void getNumberOfDaysInMonth_withEnum(int theMonthNumber, int year) {
        int response = 0;
        Month theMonth = Month.values()[theMonthNumber - 1];
        switch (theMonth) {
            case IANUARIE:
            case MARTIE:
                response = 31;
        }
    }
}

enum Month {
    IANUARIE, FEBRUARIE, MARTIE //.....
}
