package io.github.plizzzhealme.triangle;

import java.util.Scanner;

public class Main {

    public static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        double leg1;
        double leg2;
        double perimeter;
        double area;

        System.out.println("Enter legs length:");

        leg1 = enterPositiveDouble();
        leg2 = enterPositiveDouble();
        area = Triangle.calcRightTriangleArea(leg1, leg2);
        perimeter = Triangle.calcRightTrianglePerimeter(leg1, leg2);

        System.out.println("P = " + perimeter);
        System.out.println("S = " + area);
    }

    public static double enterPositiveDouble() {
        double userInput;

        do {
            while (!INPUT.hasNextDouble()) {
                INPUT.next();
            }

            userInput = INPUT.nextDouble();
        } while (userInput <= 0);

        return userInput;
    }
}
