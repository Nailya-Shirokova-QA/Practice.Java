package ru.courses.student.demo;

import ru.courses.student.model.Student;

public class StudentDemo {
    public static void testStudent(Student student) {
        int[] testGrades = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int grade : testGrades) {
            student.addGrade(grade);
        }

        System.out.println(student);
        System.out.println("Grades: " + student.getGrades());
    }
}