package com.javatrainer.module3.flowcontrol;

import java.util.Random;

public class InitializeRandomNumbers {
    int[] sir = new int[20];

    public void initiateArray() {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            sir[i] = rand.nextInt(101);
        System.out.println(sir[i]+"   "+i);
        }
    }
    public static void main (String args[]){
        InitializeRandomNumbers ran = new InitializeRandomNumbers();
        ran.initiateArray();

    }
}
