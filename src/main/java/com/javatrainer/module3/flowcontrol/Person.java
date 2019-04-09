package com.javatrainer.module3.flowcontrol;

import org.omg.CORBA.INTERNAL;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Boolean Major(Person a) {
        return a.age >= 18;
    }

    public static Integer returnAnaAge(Person[] a) {
        Integer j = null;
        for (int i = 0; i < a.length; i++) {
            if (a[i].name == "Ana") {
                j = a[i].age;
                break;

            }
        }
        return j;
    }

    public static Integer returnAnaIndex(Person[] a) {
        Integer j = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i].name == "Ana") {
                j = i;
                break;

            }
        }
        return j;
    }

    public static Person[] changePositionArray(Person[] a) {
        Person[] x = new Person[a.length];
        for (int i = 0; i < a.length; i++) {
            x[i] = a[a.length - i + 1];
        }
        return x;
    }


    public static void main(String args[]) {

        Person[] sir = new Person[3];
        Person[] sir2;
        sir[0] = new Person("Ana", 19);
        sir[1] = new Person("Anna", 11);
        sir[2] = new Person("Alex3", 18);
        for (int i = 0; i < sir.length; i++) {
            if (sir[i].Major(sir[i])) {
                System.out.println("Persona " + i + " " + sir[i].name);

            } else {
                System.out.println("Persona " + i + " Minor");
            }
            sir2=changePositionArray(sir);
            for (int i = 0; i < sir.length; i++) {
            }



        }
        System.out.println(" Ana age " + returnAnaAge(sir));
        System.out.println(" Ana index " + returnAnaIndex(sir));
    }
}


