public class RangeRule implements GradeRule {
    private int min;
    private int max;

    public RangeRule(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isValidGrade(int grade) {
        return grade >= min && grade <= max;
    }
}