package com.javatrainer.module3.flowcontrol;

public class TwoDimensionalArray {

    char twoDUnu[][] = new char[][]{
            {'x', 'o', 'x'},
            {'o', '0', 'o'},
            {'x', 'o', 'x'}};
    char twoDDoi[][] = new char[][]{
            {'x', 'o', 'o'},
            {'o', 'x', 'o'},
            {'x', 'o', 'x'}};


    public boolean isEqualLessTwoLines() {
        boolean isEqualLessTwoLinesResult = true;
        boolean isEqualLessTwoLinesResulttotal = false;
        for (int i = 0; i < twoDUnu.length; i++) {
            for (int j = 0; j < twoDDoi.length; j++) {

                isEqualLessTwoLinesResult = true;
                if (twoDUnu[i].length == twoDDoi[j].length) {
                    for (int k = 0; k < twoDUnu[i].length; k++) {
                        if (twoDUnu[i][k] != twoDDoi[j][k]) {
                            isEqualLessTwoLinesResult = false;
                            break;
                        }

                    }

                } else {
                    isEqualLessTwoLinesResult = false;
                }

                isEqualLessTwoLinesResulttotal = isEqualLessTwoLinesResult;
                if (isEqualLessTwoLinesResulttotal) {
                    break;
                }
            }
            if (isEqualLessTwoLinesResulttotal) {
                break;
            }

        }
        return isEqualLessTwoLinesResulttotal;
    }

    public static void main(String args[]) {
        TwoDimensionalArray run = new TwoDimensionalArray();
        System.out.println(" Este cel putin un rand egat in cele dou siruri: " + run.isEqualLessTwoLines());

    }

}

