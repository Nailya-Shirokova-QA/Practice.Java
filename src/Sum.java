public class Sum {
    public static void main(String[] args) {
        NumberAdder adder = new NumberAdder();

        for (String arg : args) {
            adder.add(arg);
        }

        System.out.println(adder.getTotal());
    }
}
