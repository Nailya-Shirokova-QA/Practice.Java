public class NumberAdder {
    private double total;

    public NumberAdder() {
        this.total = 0.0;
    }

    public void add(String input) {
        if (isValidNumber(input)) {
            double number = Double.parseDouble(input);
            this.total += number;
        }
    }

    private boolean isValidNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public double getTotal() {
        return total;
    }
}
