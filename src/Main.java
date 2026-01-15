public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(2, 3);
        Fraction fraction3 = new Fraction(3, 4);

        System.out.println("fraction1: " + fraction1);
        System.out.println("fraction2: " + fraction2);
        System.out.println("fraction3: " + fraction3);

        System.out.println("\nComparison:");
        System.out.println("fraction1.equals(fraction2): " + fraction1.equals(fraction2));
        System.out.println("fraction1.equals(fraction3): " + fraction1.equals(fraction3));

        Fraction clonedFraction = fraction1.clone();
        System.out.println("\nCloning:");
        System.out.println("Original: " + fraction1);
        System.out.println("Clone: " + clonedFraction);
        System.out.println("Are equal? " + fraction1.equals(clonedFraction));

        clonedFraction.setNumerator(5);
        System.out.println("\nAfter modifying clone:");
        System.out.println("Original: " + fraction1);
        System.out.println("Clone: " + clonedFraction);
        System.out.println("Are equal? " + fraction1.equals(clonedFraction));

        System.out.println("\nHash codes:");
        System.out.println("fraction1.hashCode(): " + fraction1.hashCode());
        System.out.println("fraction2.hashCode(): " + fraction2.hashCode());
        System.out.println("fraction3.hashCode(): " + fraction3.hashCode());
        System.out.println("clonedFraction.hashCode(): " + clonedFraction.hashCode());
    }
}
