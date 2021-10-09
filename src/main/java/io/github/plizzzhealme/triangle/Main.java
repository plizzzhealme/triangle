package io.github.plizzzhealme.triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double leg1;
        double leg2;
        double perimeter;
        double area;

        System.out.println("Enter legs length:");

        leg1 = getPositiveDouble();
        leg2 = getPositiveDouble();

        area = calcTriangleArea(leg1, leg2);
        perimeter = calcTrianglePerimeter(leg1, leg2);

        System.out.println("P = " + perimeter);
        System.out.println("S = " + area);
    }

    private static double calcTrianglePerimeter(double leg1, double leg2) {
        return leg1 + leg2 + Math.sqrt(leg1 * leg1 + leg2 * leg2);
    }

    private static double calcTriangleArea(double leg1, double leg2) {
        return leg1 * leg2 / 2;
    }

    public static double getDouble() {
        Scanner in = new Scanner(System.in);

        while (!in.hasNextDouble()) {
            in.next();
            System.out.println("Enter a real number");
        }
        return in.nextDouble();
    }

    public static double getPositiveDouble() {
        double d;

        do {
            d = getDouble();

            if (d <= 0) {
                System.out.println("Enter a positive real number");
            }
        } while (d <= 0);
        return d;
    }
}
