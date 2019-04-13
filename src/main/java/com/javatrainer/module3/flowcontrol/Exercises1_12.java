package com.javatrainer.module3.flowcontrol;

import java.util.Scanner;

public class Exercises1_12 {
    public Integer getPerimeter(int a) {
        return a * 4;
    }

    public Integer getArea(int a, int b) {
        return a * b;
    }

    public static Boolean isEven(int a) { //TODO: better name choice: isEven
        return (a & 1) == 0;
    }

    public static boolean containNumberTwo(int a) {
        String b = Integer.toString(a);
//        boolean c = false; // boolean
//        for (int i = 0; i < b.length(); i++) { // int
//            if (b.charAt(i) == '2') {
//                c = true;
//
//            }
//
//        }
//        if (b.contains("2")){c = true;}
        return (b.contains("2"));
    }

    public static Boolean getPositiv(int a) {
        return a > 0;
    } //TODO: positiv is just when >0 :)

    public static int countNumbers(int[] a) { //TODO: a better name coice for this method would be sumNumbers or getSum
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            j = j + a[i];

        }
        return j;
    }

    public static float mediaNumbers(int[] a) { //TODO: better name choice like: calculateNumbersAverage
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            j = j + a[i];

        }
        return ((float) j) / a.length; //TODO: this is not an error, but usually we work with double... however indeed the best fit in this case is float (represented on 4 bytes) instead of double (represented in 8 bytes)
    }

    public static float mediaNumbersEven(int[] a) {
        int j = 0; //TODO: this is in fact the evenNumbersSum :)
        int x = 0; //TODO: this is in fact the evenNumberCount :)
        for (int i = 0; i < a.length; i++) {
            if (getEven(a[i])) {
                j = j + a[i];
                x++;
            }


        }
        return ((float) j) / x;
    }

    public static float produsulNumbersOdd(int[] a) { //TODO: verbose names ;-)
        float j = 1;

        for (int i = 0; i < a.length; i++) {
            if (!getEven(a[i])) {
                j = j * a[i];
                //TODO: however it was not a topic for this training,
                //TODO: here you can do an optimisation: like if once j becomes 0, there is no chance to become other number
                //TODO: so, this means would perfect a check like:
                //TODO: if (j==0) {
                //TODO:     break;
                //TODO: }
                //TODO: but once again, this is just an optimisation
            }


        }
        return j;
    }

    public static int countLessFive(int[] a) {
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 5) {
                j++;

            }


        }
        return j;
    }
    public static int countStringElement(String a) {

        return a.length();
    }
    public static String listStringThree(String a) {

       return a.substring(1,3);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Exercises1_12 test = new Exercises1_12();
        int i = 0;
//        System.out.print("Te rog introdu latura unui patrat:");
//        i = sc.nextInt();
//        System.out.println("Perimetrul patratatului:" + test.getPerimeter(i));
//        System.out.print("Te rog introdu latimea unui deptunghi:");
//        int latimea = sc.nextInt();
//        System.out.print("Te rog introdu lungimea unui deptunghi:");
//        int lungimea = sc.nextInt();
//        System.out.println("Perimetrul dreptunghiului:" + test.getArea(latimea, lungimea));
//        System.out.print("Te rog un numar:");
//        i = sc.nextInt();
//        System.out.println("Numarule " + i + " este par: " + getEven(i));
//        System.out.print("Te rog un numar:");
//        i = sc.nextInt();
//        System.out.println("Numarule " + i + " contine cifra 2: " + containNumberTwo(i));
//        System.out.print("Te rog un numar:");
//        i = sc.nextInt();
//        System.out.println("Numarule " + i + " este pozitiv: " + getPositiv(i));

        int[] j = {7, 2, 3, 4, 11};
        System.out.println("Suma de  este     : " + countNumbers(j));
        System.out.println("Media de  este     : " + mediaNumbers(j));
        System.out.println("Media numerelor pare de  este     : " + mediaNumbersEven(j));
        System.out.println("Produsul numerelor impare de  este     : " + produsulNumbersOdd(j));
        System.out.println("countLessFive     : " + countLessFive(j));
        System.out.println("countStringElement     : " + countStringElement("countStringElemen"));
        System.out.println("listStringThree     : " + listStringThree("Alex"));
    }

}
