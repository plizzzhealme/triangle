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

        leg1 = getDouble();
        leg2 = getPositiveDouble();
        area = Triangle.calcRightTriangleArea(leg1, leg2);
        perimeter = Triangle.calcRightTrianglePerimeter(leg1, leg2);

        System.out.println("P = " + perimeter);
        System.out.println("S = " + area);
    }

    public static double getDouble() {
        while (!INPUT.hasNextDouble()) {
            INPUT.next();
            System.out.println("Enter a real number:");
        }

        return INPUT.nextDouble();
    }

    public static double getPositiveDouble() {
        double userInput;

        do {
            userInput = getDouble();

            if (userInput <= 0) {
                System.out.println("Enter a positive real number:");
            }
        } while (userInput <= 0);

        return userInput;
    }
}
