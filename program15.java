//15.WAP to Check if student scored distinction

import java.util.*;

public class program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Percentage :");
        double percentage = sc.nextDouble();

        if (percentage > 75) {
            System.out.println("Congratulations! You scored a distinction.");
        } else {
            System.out.println("You did not get distinction");
        }
    }
}
