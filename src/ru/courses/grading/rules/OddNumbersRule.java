package ru.courses.grading.rules;

public class OddNumbersRule implements GradeRule {
    @Override
    public boolean isValidGrade(int grade) {
        return grade >= 1 && grade <= 100 && grade % 2 != 0;
    }
}