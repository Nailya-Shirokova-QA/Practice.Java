package ru.courses.math;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class MathUtils {
    public static double power(String base, String exponent) {
        int x = parseInt(base);
        int y = parseInt(exponent);
        return pow(x, y);
    }
}