package com.university.department.cse;
public class Course {
    private String name;
    private double fees;
    private String duration;
    public Course(String name, double fees, String duration) {
        this.name = name;
        this.fees = fees;
        this.duration = duration;
    }
    public void displayCourseDetails() {
        System.out.println("Course: " + name);
        System.out.println("Fees: " + fees);
        System.out.println("Duration: " + duration);
    }
}
