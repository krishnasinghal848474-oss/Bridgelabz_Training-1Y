package com.school.util;
import com.school.data.Student;
public class Analyzer {
    public double calculateAverage(Student s) {
        return (s.getSubject1() + s.getSubject2() + s.getSubject3()) / 3.0;
    }
    public String findGrade(double average) {
        if (average >= 90) return "A";
        if (average >= 80) return "B";
        if (average >= 70) return "C";
        if (average >= 60) return "D";
        return "F";
    }
}
