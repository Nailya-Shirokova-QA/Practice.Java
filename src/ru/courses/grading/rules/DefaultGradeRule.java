package ru.courses.grading.rules;

public class DefaultGradeRule implements GradeRule {
    @Override
    public boolean isValidGrade(int grade) {
        return grade >= 2 && grade <= 5;
    }
}