public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1: 2 + 3/5 + 2.3");
        double result1 = NumberSum.sumAll(
                2,
                new Fraction(3, 5),
                2.3
        );
        System.out.println("Result: " + result1);

        System.out.println("\nTask 2: 3.6 + 49/12 + 3 + 3/2");
        double result2 = NumberSum.sumAll(
                3.6,
                new Fraction(49, 12),
                3,
                new Fraction(3, 2)
        );
        System.out.println("Result: " + result2);

        System.out.println("\nTask 3: 1/3 + 1");
        double result3 = NumberSum.sumAll(
                new Fraction(1, 3),
                1
        );
        System.out.println("Result: " + result3);

        System.out.println("\n=== Verification ===");
        System.out.println("Task 1: 2 + 0.6 + 2.3 = " + (2 + 0.6 + 2.3));
        System.out.println("Task 2: 3.6 + 4.0833... + 3 + 1.5 = " + (3.6 + 49.0/12 + 3 + 1.5));
        System.out.println("Task 3: 0.3333... + 1 = " + (1.0/3 + 1));
    }
}