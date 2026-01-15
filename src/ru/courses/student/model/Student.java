package ru.courses.student.model;

import ru.courses.grading.rules.DefaultGradeRule;
import ru.courses.grading.rules.GradeRule;

import java.util.ArrayList;
import java.util.List;

public final class Student {
    private List<Integer> grades = new ArrayList<>();
    private String name;
    private GradeRule gradeRule;

    public Student(String name) {
        this(name, new DefaultGradeRule());
    }

    public Student(String name, GradeRule gradeRule) {
        this.name = name;
        this.gradeRule = gradeRule;
    }

    public void addGrade(int grade) {
        if (gradeRule.isValidGrade(grade)) {
            grades.add(grade);
        }
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public void setGradeRule(GradeRule gradeRule) {
        this.gradeRule = gradeRule;
    }

    public GradeRule getGradeRule() {
        return gradeRule;
    }

    @Override
    public String toString() {
        return "ru.courses.student.model.Student{name=" + name + ", grades=" + grades + '}';
    }
}