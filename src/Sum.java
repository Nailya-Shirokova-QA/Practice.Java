public class Sum {
    private double total = 0.0;

    public void add(String value) {
        try {
            this.total += Double.parseDouble(value);
        } catch (NumberFormatException e) {
            // invalid values are treated as 0
        }
    }

    public double getTotal() {
        return this.total;
    }

    public static void main(String[] args) {
        Sum calculator = new Sum();

        for (String arg : args) {
            calculator.add(arg);
        }

        System.out.println(calculator.getTotal());
    }
}
