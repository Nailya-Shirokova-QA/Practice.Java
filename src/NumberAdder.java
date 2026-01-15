public class NumberAdder {
    private double total;

    public NumberAdder() {
        this.total = 0.0;
    }

    public void process(String input) {
        try {
            double number = Double.parseDouble(input);
            addToTotal(number);
        } catch (NumberFormatException e) {
        }
    }

    private void addToTotal(double number) {
        this.total += number;
    }

    public double getTotal() {
        return total;
    }
}
