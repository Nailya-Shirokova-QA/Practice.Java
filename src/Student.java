/*import java.util.Arrays;

public class Student {
    private final String name;
    private int[] grades;
    private int gradeCount;

    // Конструктор с именем (без оценок)
    public Student(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
        this.grades = new int[10];
        this.gradeCount = 0;
    }

    // Конструктор с именем и начальными оценками
    public Student(String name, int[] initialGrades) {
        this(name);
        if (initialGrades != null) {
            for (int grade : initialGrades) {
                addGrade(grade);
            }
        }
    }

    public void addGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть в диапазоне от 2 до 5");
        }

        if (gradeCount == grades.length) {
            grades = Arrays.copyOf(grades, grades.length * 2);
        }

        grades[gradeCount] = grade;
        gradeCount++;
    }

    @Override
    public String toString() {
        if (gradeCount == 0) {
            return name + ": []";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": [");

        for (int i = 0; i < gradeCount; i++) {
            sb.append(grades[i]);
            if (i < gradeCount - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }

    public static void main(String[] args) {
        Student student = new Student("Иванов Иван");
        student.addGrade(5);
        student.addGrade(4);
        student.addGrade(3);
        System.out.println(student);
    }
} */