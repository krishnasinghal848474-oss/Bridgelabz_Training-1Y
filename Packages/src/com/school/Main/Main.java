package com.school.Main;
import com.school.data.Student;
import com.school.util.Analyzer;
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Krishna", 85.5, 90.0, 78.0);
        Analyzer analyzer = new Analyzer();
        double avg = analyzer.calculateAverage(student);
        String grade = analyzer.findGrade(avg);
        System.out.println("Student: " + student.getName());
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}
