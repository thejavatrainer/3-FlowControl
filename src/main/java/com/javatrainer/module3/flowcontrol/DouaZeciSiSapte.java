package com.javatrainer.module3.flowcontrol;

import java.util.Random;

public class DouaZeciSiSapte {
    int[] sir = new int[20];

    public void initiateArray() {
        Random rand = new Random();
        System.out.print(" Sir initial ");
        for (int i = 0; i < 20; i++) {
            sir[i] = rand.nextInt(101);
            System.out.print("Al "+i+"element:"+sir[i]+" ;");
        }
        System.out.println();
    }

    public int[] changePositionArray() {
        int[] x = new int[sir.length];
        for (int i = 0; i < sir.length; i++) {
            x[i] = sir[sir.length - i - 1];

        }
        return x;
    }
    public int[] joinsTwoArray(int[] a, int[] b) {
        int[] x = new int[sir.length];
        for (int i = 0; i < a.length; i++) {
            x[i] = a[i];
        }
        for (int i = a.length; i < a.length+b.length; i++) {
            x[i] = b[i-a.length];
        }
        return x;
    }

    public static void main(String args[]) {
        DouaZeciSiSapte unu = new DouaZeciSiSapte();
        unu.initiateArray();
        int[] test=unu.changePositionArray();

        for (int i=0;i<test.length;i++){
            System.out.print("Al "+i+"element"+test[i]+" ;");
        }
    }
}
