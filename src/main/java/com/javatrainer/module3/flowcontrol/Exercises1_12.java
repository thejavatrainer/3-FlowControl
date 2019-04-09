package com.javatrainer.module3.flowcontrol;

import java.util.Scanner;

public class Exercises1_12 {
    public Integer getPerimeter(int a) {
        return a * 4;
    }

    public Integer getArea(int a, int b) {
        return a * b;
    }

    public static Boolean getEven(int a) {
        return a % 2 == 0;
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
        return a >= 0;
    }

    public static int countNumbers(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            j = j + a[i];

        }
        return j;
    }

    public static float mediaNumbers(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            j = j + a[i];

        }
        return ((float) j) / a.length;
    }

    public static float mediaNumbersEven(int[] a) {
        int j = 0;
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            if (getEven(a[i])) {
                j = j + a[i];
                x++;
            }


        }
        return ((float) j) / x;
    }

    public static float produsulNumbersOdd(int[] a) {
        float j = 1;

        for (int i = 0; i < a.length; i++) {
            if (!getEven(a[i])) {
                j = j * a[i];

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
