public class Start {
    private final int numerator;
    private final int denominator;

    public Start(int numerator, int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("Знаменатель должен быть положительным числом");
        }

        // Находим НОД для упрощения дроби при создании
        int gcd = gcd(Math.abs(numerator), denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Start(int number) {
        this(number, 1);
    }

    // Геттеры
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Сложение с другой дробью
    public Start sum(Start other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Start(newNumerator, newDenominator);
    }

    // Сложение с целым числом
    public Start sum(int number) {
        return sum(new Start(number));
    }

    // Вычитание другой дроби
    public Start minus(Start other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Start(newNumerator, newDenominator);
    }

    // Вычитание целого числа
    public Start minus(int number) {
        return minus(new Start(number));
    }

    // Нахождение наибольшего общего делителя
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Строковое представление
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Основной метод для тестирования
    public static void main(String[] args) {
        // 1. Создаем несколько экземпляров дробей
        Start f1 = new Start(1, 3);    // одна треть
        Start f2 = new Start(2, 5);    // две пятых
        Start f3 = new Start(7, 8);    // семь восьмых

        System.out.println("Созданные дроби:");
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);

        // 2. Вычисляем f1.sum(f2).sum(f3).minus(5)
        Start result = f1.sum(f2).sum(f3).minus(5);

        System.out.println("\nРезультат вычисления f1.sum(f2).sum(f3).minus(5):");
        System.out.println(result);
    }
}