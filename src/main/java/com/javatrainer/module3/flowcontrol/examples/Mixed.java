package com.javatrainer.module3.flowcontrol.examples;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Arrays;

public class Mixed {
    private static final String LINE_END = "\r\n";

    public static void main(String[] args) {
        Mixed mixed = new Mixed();
        //System.out.println(mixed.getElefantSong());
        mixed.exercise_searchForThursdayIn29February();
        mixed.exercise_searchForThursdays();
    }

    public String getElefantSong() {
        StringBuilder song = new StringBuilder();
        int primaStrofa = 1;
        int ultimaStrofa = 15;
        for (int numarStrofa = primaStrofa; numarStrofa <= ultimaStrofa; numarStrofa++) {
            // first row
            if (numarStrofa == primaStrofa) {
                song.append(numarStrofa).append(" elefant se legana,").append(LINE_END);
            } else {
                song.append(numarStrofa).append(" elefanti se leganau,").append(LINE_END);
            }

            //second row
            song.append("pe o panza de paianjen,").append(LINE_END);

            //third row

            if (numarStrofa == ultimaStrofa) {
                song.append("si pentru ca panza s-a rupt,").append(LINE_END);
            } else {
                song.append("si pentru ca nu se rupea,").append(LINE_END);
            }

            //fourth row
            if (numarStrofa == primaStrofa) {
                song.append("a mai chemat un elefant.").append(LINE_END);
            } else if (numarStrofa == ultimaStrofa) {
                song.append("toti elefanti au cazut.").append(LINE_END);
            } else {
                song.append("au mai chemat un elefant.").append(LINE_END);
            }
            song.append(LINE_END);
        }
        return song.toString();
    }

    private void test(boolean condition, boolean otherCondition1, boolean otherCondition2) {
        if (condition) {
            thenDoStuff();
        }

        if (condition) {
            thenDoStuff();
        } else {
            otherwiseDoOtherStuff();
        }

        if (condition) {
            thenDoStuff();
        } else if (otherCondition1) {
            otherwiseDoStuff1();
        } else if (otherCondition2) {
            otherwiseDoStuff2();
        } else {
            otherwiseDoOtherStuff();
        }
        Sheep sheep = new Sheep();

        if (sheep.isBlack()) {
            doNotCountThisSheep();
        }
    }

    private void doNotCountThisSheep() {

    }

    private void otherwiseDoStuff2() {

    }

    private void otherwiseDoStuff1() {
    }

    private void otherwiseDoOtherStuff() {

    }

    private void thenDoStuff() {

    }

    public void exercise_searchForThursdayIn29February() {
        YearMonth yearAndMonth = YearMonth.now().withMonth(2);
        while (!isFebruary29Tuesday(yearAndMonth)) {
            if (yearAndMonth.isLeapYear()) {
                yearAndMonth = yearAndMonth.minusYears(4);
            } else {
                yearAndMonth = yearAndMonth.minusYears(1);
            }
        }
        System.out.println("Last time 29 february was Thursday at " + yearAndMonth.getYear());
    }

    private boolean isFebruary29Tuesday(YearMonth yearAndMonth) {
        return yearAndMonth.isLeapYear() && LocalDate.of(yearAndMonth.getYear(),
                yearAndMonth.getMonthValue(), 29).getDayOfWeek() == DayOfWeek.THURSDAY;
    }


    public void exercise_searchForThursdays() {
        int currentYear = 2019;
        int lastYearsCount = 49;
        int thursdayDate = 11;
        if (thursdayDate > 28) {
            throw new IndexOutOfBoundsException("This code doesn't handle the dates > 28. Needs optimisation!");
        }
        LocalDate theDate = LocalDate.now().withDayOfMonth(thursdayDate);
        int numberOfThursdays = 0;

        while (theDate.getYear() >= currentYear - lastYearsCount) {
            if (theDate.getDayOfWeek() == DayOfWeek.THURSDAY) {
                System.out.println(theDate);
                numberOfThursdays++;
            }
            theDate = theDate.minusMonths(1);
        }
        System.out.println("There were " + numberOfThursdays + " Thursdays in the last 50 years!");
    }

    public boolean areArrayRowsDistinct(Object[][] array) {
        for (int rowIndex = 0; rowIndex < array.length; rowIndex++) {
            Object[] row = array[rowIndex];
            for (int newRowIndex = rowIndex + 1; newRowIndex < array.length; newRowIndex++) {
                Object[] newRow = array[newRowIndex];
                if (Arrays.equals(row, newRow)) {
                    System.out.println("The lines at index " + rowIndex + " and " + newRowIndex +  "are the same!");
                    return false;
                }
            }
        }
        return true;
    }

    class Sheep {
        boolean isBlack() {
            return true;
        }
    }
}
