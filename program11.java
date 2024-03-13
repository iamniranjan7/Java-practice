//11.WAP to accept basic salary 20000/- and daily allowance, traveling allowance, house rent and Print gross salary of employee



import java.util.*;

public class program11 {
    public static void main(String[] args) {
        // Constants
        final double BASIC_SALARY = 20000.0;

        Scanner scanner = new Scanner(System.in);

        // Accepting allowances
        System.out.print("Enter daily allowance: ");
        double dailyAllowance = scanner.nextDouble();

        System.out.print("Enter traveling allowance: ");
        double travelingAllowance = scanner.nextDouble();

        System.out.print("Enter house rent: ");
        double houseRent = scanner.nextDouble();

        // Calculating gross salary
        double grossSalary = BASIC_SALARY + dailyAllowance + travelingAllowance + houseRent;

        // Printing gross salary
        System.out.println("Gross salary of the employee: " + grossSalary);
    }
}
