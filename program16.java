//16.WAP to Check type of triangle

import java.util.*;

 class program16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of the triangle:");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();

        if (side1 == side2 && side2 == side3) {
            System.out.println("It is an equilateral triangle.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("It is an isosceles triangle.");
        } else {
            System.out.println("It is a scalene triangle.");
        }
    }
}
