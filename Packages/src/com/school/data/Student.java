package com.school.data;
public class Student {
    private String name;
    private double subject1;
    private double subject2;
    private double subject3;
    public Student(String name, double s1, double s2, double s3) {
        this.name = name;
        this.subject1 = s1;
        this.subject2 = s2;
        this.subject3 = s3;
    }
    public String getName() { return name; }
    public double getSubject1() { return subject1; }
    public double getSubject2() { return subject2; }
    public double getSubject3() { return subject3; }
}
