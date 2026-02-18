package com.gla.Methods;

public class Circle {
    public void areaOfCircle(int radius) {
        System.out.println("Area of circle:");
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }

    public void circumferenceOfCircle(int radius) {
        System.out.println("Circumference of circle:");
        double circum = 2 * Math.PI * radius;
        System.out.println(circum);
    }


}