package io.github.plizzzhealme.triangle;

public class Triangle {

    public static double calcRightTriangleArea(double leg1, double leg2) {
        if (leg1 <= 0 || leg2 <= 0) {
            throw new RuntimeException("Illegal triangle leg length");
        }

        return 0.5 * leg1 * leg2;
    }

    public static double calcRightTrianglePerimeter(double leg1, double leg2) {
        if (leg1 <= 0 || leg2 <= 0) {
            throw new RuntimeException("Illegal triangle leg length");
        }

        return leg1 + leg2 + Math.sqrt(leg1 * leg1 + leg2 * leg2);
    }
}
