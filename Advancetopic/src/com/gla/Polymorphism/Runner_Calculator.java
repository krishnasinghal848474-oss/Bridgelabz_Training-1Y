package com.gla.Polymorphism;

public class Runner_Calculator {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        int sum1=c1.add(5,4);
        System.out.println("Sum of integer "+sum1);
        double sum2=c1.add(4.25,5.26);
        System.out.println("Sum of double "+sum2);
        String sum3=c1.add("krishna","Singhal");
        System.out.println("sum of string is "+sum3);
    }
}
