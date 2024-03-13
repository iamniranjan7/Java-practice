//17.WAP to Check sum of digit greater than 10

import java.util.*;

public class program17 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int originalNumber = number;

        // Calculate the sum of digits
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        // Check if the sum is greater than 10
        if (sum > 10) {
            System.out.println("The sum of digits of " + originalNumber + " is greater than 10.");
        } else {
            System.out.println("The sum of digits of " + originalNumber + " is not greater than 10.");
        }

        scanner.close();

    }
}
