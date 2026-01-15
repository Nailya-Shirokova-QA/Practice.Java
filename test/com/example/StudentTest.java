package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private StudentServiceStub serviceStub;
    private Student student;

    @BeforeEach
    void setUp() {
        serviceStub = new StudentServiceStub();
        serviceStub.startServer();
        student = new Student("Ivan");
    }

    @AfterEach
    void tearDown() {
        serviceStub.stopServer();
    }

    @Test
    void addGradeShouldAddValidGrade() {
        serviceStub.stubForCheckGrade(5, true);
        student.addGrade(5);
        assertEquals(1, student.getGrades().size());
        assertEquals(5, student.getGrades().get(0));
    }

    @Test
    void addGradeShouldThrowExceptionForInvalidGrade() {
        serviceStub.stubForCheckGrade(6, false);
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> student.addGrade(6)
        );
        assertEquals("Grade 6 is wrong grade", exception.getMessage());
        assertTrue(student.getGrades().isEmpty());
    }

    @Test
    void ratingShouldSumGradesAndAddEducateValue() {
        serviceStub.stubForCheckGrade(4, true);
        serviceStub.stubForCheckGrade(5, true);
        serviceStub.stubForEducate(10);

        student.addGrade(4);
        student.addGrade(5);
        int rating = student.rating();

        assertEquals(19, rating);
    }
}
