public class Main {
    public static void main(String[] args) {
        Fraction f = new Fraction(3, 4);

        System.out.println("Fraction: " + f);
        System.out.println("intValue: " + f.intValue());
        System.out.println("doubleValue: " + f.doubleValue());
        System.out.println("floatValue: " + f.floatValue());

        Number num = f;
        System.out.println("As Number: " + num.doubleValue());
    }
}