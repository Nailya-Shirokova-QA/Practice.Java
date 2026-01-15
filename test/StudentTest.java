import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.List;

public class StudentTest {
    private Student student;

    @Before
    public void setUp() {
        student = new Student("Ivan Ivanov");
    }

    @Test
    public void testStudentCreation() {
        assertNotNull(student);
        assertEquals("Ivan Ivanov", student.getName());
        assertTrue(student.getGrades().isEmpty());
    }

    @Test
    public void testSetName() {
        student.setName("Petr Petrov");
        assertEquals("Petr Petrov", student.getName());
    }

    @Test
    public void testAddValidGrade() {
        student.addGrade(5);
        student.addGrade(4);
        student.addGrade(3);

        List<Integer> grades = student.getGrades();
        assertEquals(3, grades.size());
        assertEquals(Integer.valueOf(5), grades.get(0));
        assertEquals(Integer.valueOf(4), grades.get(1));
        assertEquals(Integer.valueOf(3), grades.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddInvalidGradeTooLow() {
        student.addGrade(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddInvalidGradeTooHigh() {
        student.addGrade(6);
    }

    @Test
    public void testGetGradesEncapsulation() {
        student.addGrade(5);
        student.addGrade(4);

        List<Integer> grades = student.getGrades();

        try {
            grades.add(3);
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }

        try {
            grades.remove(0);
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }

        try {
            grades.clear();
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }

        assertEquals(2, student.getGrades().size());
    }

    @Test
    public void testGetGradesCopy() {
        student.addGrade(5);
        student.addGrade(4);

        List<Integer> copy = student.getGradesCopy();
        assertEquals(2, copy.size());

        copy.add(3);
        assertEquals(3, copy.size());
        assertEquals(2, student.getGrades().size());
    }

    @Test
    public void testGetAverageGrade() {
        student.addGrade(5);
        student.addGrade(4);
        student.addGrade(3);

        assertEquals(4.0, student.getAverageGrade(), 0.001);
    }

    @Test
    public void testGetAverageGradeEmpty() {
        assertEquals(0.0, student.getAverageGrade(), 0.001);
    }

    @Test
    public void testHasExcellentGrades() {
        assertFalse(student.hasExcellentGrades());

        student.addGrade(5);
        student.addGrade(5);
        assertTrue(student.hasExcellentGrades());

        student.addGrade(4);
        assertFalse(student.hasExcellentGrades());
    }

    @Test
    public void testEqualsAndHashCode() {
        Student student1 = new Student("Ivan Ivanov");
        student1.addGrade(5);
        student1.addGrade(4);

        Student student2 = new Student("Ivan Ivanov");
        student2.addGrade(5);
        student2.addGrade(4);

        Student student3 = new Student("Petr Petrov");
        student3.addGrade(5);
        student3.addGrade(4);

        assertTrue(student1.equals(student2));
        assertTrue(student2.equals(student1));
        assertEquals(student1.hashCode(), student2.hashCode());

        assertFalse(student1.equals(student3));
        assertFalse(student1.equals(null));
        assertFalse(student1.equals("Not a Student"));

        assertTrue(student1.equals(student1));
    }

    @Test
    public void testToString() {
        student.addGrade(5);
        student.addGrade(4);

        String str = student.toString();
        assertTrue(str.contains("Ivan Ivanov"));
        assertTrue(str.contains("marks=[5, 4]"));
    }
}
