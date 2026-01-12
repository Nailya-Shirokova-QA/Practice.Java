public class Tochka {
    private final int x;
    private final int y;

    public Tochka(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toStringRepresentation() {
        return "{" + x + ";" + y + "}";
    }

    @Override
    public String toString() {
        return toStringRepresentation();
    }

    public static void main(String[] args) {
        Tochka tochka1 = new Tochka(1, 3);
        Tochka tochka2 = new Tochka(1, 3);
        Tochka tochka3 = new Tochka(5, 8);

        System.out.println("Text representation of points:");
        System.out.println(tochka1);
        System.out.println(tochka2);
        System.out.println(tochka3);
        System.out.println();

        System.out.println("Comparison results:");
        System.out.println(tochka1 == tochka2);
        System.out.println(tochka1 == tochka3);
    }
}