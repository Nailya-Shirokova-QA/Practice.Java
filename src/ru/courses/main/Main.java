package ru.courses.main;

import ru.courses.grading.rules.CustomRule;
import ru.courses.grading.rules.EvenNumbersRule;
import ru.courses.grading.rules.OddNumbersRule;
import ru.courses.grading.rules.RangeRule;
import ru.courses.student.demo.StudentDemo;
import ru.courses.student.model.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRATION OF STUDENT WITH DIFFERENT GRADE RULES ===\n");

        Student student1 = new Student("John Doe");
        System.out.println("Student 1 (default rule 2-5):");
        StudentDemo.testStudent (student1);

        Student student2 = new Student("Alice Smith", new EvenNumbersRule());
        System.out.println("\nStudent 2 (even numbers 1-100000):");
        StudentDemo.testStudent(student2);

        Student student3 = new Student("Bob Johnson", new RangeRule(1, 10));
        System.out.println("\nStudent 3 (range 1-10):");
        StudentDemo.testStudent(student3);

        Student student4 = new Student("Charlie Brown", new OddNumbersRule());
        System.out.println("\nStudent 4 (odd numbers 1-100):");
        StudentDemo.testStudent(student4);

        System.out.println("\n=== DYNAMIC RULE CHANGE ===");
        Student student5 = new Student("Emma Watson");
        System.out.println("Initially (default rule 2-5):");
        StudentDemo.testStudent(student5);

        student5.
                setGradeRule(new RangeRule(10, 20));
        System.out.println("\nAfter changing to range 10-20:");
        StudentDemo.testStudent(student5);

        System.out.println("\n=== CUSTOM RULE WITH LAMBDA ===");
        Student student6 = new Student("Liam Miller",
                new CustomRule(grade -> grade == 100 || grade == 200 || grade == 300));
        System.out.println("Student 6 (only 100, 200, 300 are valid):");

        student6.addGrade(100);  // valid
        student6.addGrade(50);   // invalid
        student6.addGrade(200);  // valid
        student6.addGrade(150);  // invalid
        student6.addGrade(300);  // valid

        System.out.println(student6);

        System.out.println("\n=== BOUNDARY VALUE TESTING ===");
        Student student7 = new Student("Test Student", new RangeRule(0, 100));
        student7.addGrade(-1);   // invalid
        student7.addGrade(0);    // valid
        student7.addGrade(50);   // valid
        student7.addGrade(100);  // valid
        student7.addGrade(101);  // invalid
        System.out.println(student7);
    }
}