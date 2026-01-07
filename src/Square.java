/*public class Square {
    private int x;
    private int y;
    private int sideLength;

    // Конструктор
    public Square(int x, int y, int sideLength) {
        this.x = x;
        this.y = y;
        setSideLength(sideLength);
    }

    // Геттеры и сеттеры
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSideLength() {
        return sideLength;
    }

    // Сеттер для длины стороны с проверкой
    public void setSideLength(int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина стороны должна быть положительной");
        }
        this.sideLength = sideLength;
    }

    // Метод для перемещения квадрата
    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    // Метод для изменения размера квадрата
    public void resize(int newSideLength) {
        setSideLength(newSideLength);
    }

    // Строковое представление
    @Override
    public String toString() {
        return String.format("Квадрат в точке (%d, %d) со стороной %d", x, y, sideLength);
    }

    // Основной метод для тестирования
    public static void main(String[] args) {
        // Создаем квадрат
        Square square = new Square(10, 20, 30);
        System.out.println("Созданный квадрат:");
        System.out.println(square);

        // Изменяем положение квадрата
        square.moveTo(50, 60);
        System.out.println("\nПосле перемещения:");
        System.out.println(square);

        // Изменяем размер квадрата
        square.resize(40);
        System.out.println("\nПосле изменения размера:");
        System.out.println(square);

        // Пробуем установить недопустимую длину стороны
        try {
            square.setSideLength(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("\nОшибка: " + e.getMessage());
        }
    }
} */