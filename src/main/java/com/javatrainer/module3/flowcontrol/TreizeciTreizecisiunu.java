package com.javatrainer.module3.flowcontrol;

public class TreizeciTreizecisiunu {
    char[] treizeci = new char[]{'B', '3', '4', '5', 'A', 'B'};

    public boolean isFisrtAndLastCaracterEqual() {
        if (treizeci[0] == treizeci[treizeci.length-1]) {
            return true;
        } else {
            return false;
        }
    }

    public void displayPositionOfLettersInString() {
        System.out.print(" displayPositionOfLettersInString ");

        for (int i = 0; i < treizeci.length; i++) {

            if ((treizeci[i] >= 'A') && (treizeci[i] <= 'Z')) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String args[]){
        TreizeciTreizecisiunu test= new TreizeciTreizecisiunu();
        System.out.println(" isFisrtAndLastCaracterEqual: "+test.isFisrtAndLastCaracterEqual());
        test.displayPositionOfLettersInString();
    }


}
