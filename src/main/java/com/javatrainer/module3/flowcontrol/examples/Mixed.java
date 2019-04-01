package com.javatrainer.module3.flowcontrol.examples;

import java.time.LocalDate;

public class Mixed {
    private static final String LINE_END = "\r\n";

    public String getElefantSong() {
        StringBuilder song = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            // first row
            if (i == 1) {
                song.append(i).append(" elefant se legana,").append(LINE_END);
            } else {
                song.append(i).append(" elefanti se leganau,").append(LINE_END);
            }

            //second row
            song.append("pe o panza de paianjen,").append(LINE_END);

            //third row
            if (i == 10) {
                song.append("si pentru ca panza s-a rupt,").append(LINE_END);
            } else {
                song.append("si pentru ca nu se rupea,").append(LINE_END);
            }

            //fourth row
            if (i == 1) {
                song.append("a mai chemat un elefant.").append(LINE_END);
            } else if (i == 10) {
                song.append("toti elefanti au cazut.").append(LINE_END);
            } else {
                song.append("au mai chemat un elefant.").append(LINE_END);
            }
            song.append(LINE_END);
        }
        return song.toString();
    }

    public static void main(String[] args) {
        Mixed mixed = new Mixed();
        System.out.println(mixed.getElefantSong());
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

    class Sheep {
        boolean isBlack() {
            return true;
        }
    }


    private void otherwiseDoStuff2() {

    }

    private void otherwiseDoStuff1() {
    }

    private void otherwiseDoOtherStuff() {

    }

    private void thenDoStuff() {

    }


    public void exercise_searchForThursdays() {
        int currentYear = 2019;

        LocalDate theDate = LocalDate.of(currentYear, 3, 11);
        int numberOfThursdays = 0;
        while (theDate.getYear() >= currentYear - 50) {
            if (theDate.getDayOfWeek().getValue() == 4) {
                numberOfThursdays++;
            }
            theDate = theDate.minusMonths(1);
        }
        System.out.println("There were " + numberOfThursdays + " Thursdays in the last 50 years!");

    }
}
