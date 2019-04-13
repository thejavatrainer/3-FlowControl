package com.javatrainer.module3.flowcontrol;

public class ConstructorMinMax {
    int field1, field2, field3;

    public ConstructorMinMax(int field1, int field2, int filed3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = filed3;
    }

    private int maximum(ConstructorMinMax constructor) {
        int max;
        max = constructor.field1;
        if (constructor.field2 > max)  {
            max = constructor.field2;
            }
        if (constructor.field3 > max)  {
            max = constructor.field3;
        }
        return max;
    }

    private int minimumSimple() {
        int min;
        min = field1;
        if (field2 < min) {
            min = field2;
        }
        if (field3 < min) {
            min = field3;}
        return min;
}

    private int minimum(ConstructorMinMax constructor) {
        int min;
        min = constructor.field1;
        if (constructor.field2 < min) {
            min = constructor.field2;
        }
        if (constructor.field3 < min) {
            min = constructor.field3;
        }
        return min;
    }


    public static void main(String args[]) {
        ConstructorMinMax unu = new ConstructorMinMax(1, 2, 3);
        ConstructorMinMax doi = new ConstructorMinMax(4, 3, 2);
        System.out.println("maxim: " + unu.maximum(unu) + " minim: " + unu.minimum(unu));
        System.out.println("min de doi : " + doi.minimum(doi) + " minim unu de doi: " + unu.minimum(unu) + " miniumSimple" + doi.minimumSimple());


    }
}
