package ru.courses.main;

import ru.courses.math.MathUtils;

public class Main {
    public static void main(String[] args) {
        testPower("2", "3");
        testPower("5", "2");
        testPower("10", "0");
        testPower("3", "4");

        if (args.length == 2) {
            try {
                double result = MathUtils.power(args[0], args[1]);
                System.out.println(args[0] + " ^ " + args[1] + " = " + result);
            } catch (NumberFormatException e) {
                System.out.println("Error: invalid numbers in arguments");
            }
        }
    }

    private static void testPower(String base, String exponent) {
        double result = MathUtils.power(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + result);
    }
}
