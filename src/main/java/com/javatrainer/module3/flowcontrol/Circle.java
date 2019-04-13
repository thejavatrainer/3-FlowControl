package com.javatrainer.module3.flowcontrol;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return (2*radius*Math.PI);
    }
    public double getPerimeter(){
        return (radius*radius*Math.PI);
    }
    public static void main (String args[]){
        Circle unu = new Circle(1);
        System.out.println(unu.getArea()+" perimetru "+unu.getPerimeter());
    }
}
