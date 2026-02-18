package com.gla.Arrays;
import java.util.Scanner;
public class Calculator {
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int sub(int num1,int num2){

        return num1-num2;
    }
    public int mul(int num1,int num2){

        return num1*num2;
    }
    public int div(int num1,int num2){
        return num1/num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the Second number");
        int b = sc.nextInt();
        Calculator c1 = new Calculator();
        int addition = c1.add(a, b);
        System.out.println("Addition of two no is :-  " + addition);
        int Subtraction = c1.sub(a, b);
        System.out.println("subtraction of two no is :-  " + Subtraction);
        int multiplication = c1.mul(a, b);
        System.out.println("Multiplication of two no is :-  " + multiplication);
        int division = c1.div(a, b);
        System.out.println("division of two no is :-  " + division);

    }
}











