package ru.courses.grading.rules;

public class EvenNumbersRule implements GradeRule {
    @Override
    public boolean isValidGrade(int grade) {
        return grade >= 1 && grade <= 100000 && grade % 2 == 0;
    }
}