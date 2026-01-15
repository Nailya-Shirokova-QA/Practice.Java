package ru.courses.grading.rules;

public class CustomRule implements GradeRule {
    private java.util.function.IntPredicate predicate;

    public CustomRule(java.util.function.IntPredicate predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean isValidGrade(int grade) {
        return predicate.test(grade);
    }
}