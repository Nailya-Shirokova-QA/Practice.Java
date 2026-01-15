package ru.courses.main;

import ru.courses.geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point geometryPoint = new Point(3.5, 7.2);
        System.out.println("Our Point: " + geometryPoint);

        java.awt.Point awtPoint = new java.awt.Point(10, 20);
        System.out.println("AWT Point: (" + awtPoint.x + ", " + awtPoint.y + ")");
    }
}
