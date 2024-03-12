//5. WAP Enter three angles & check if it is a triangle

import java.util.*;

class program5{
	public static void main(String []args){

		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the angles of triangle");
        System.out.println( "Enter first angle of triangle : ");
        int a = scanner.nextInt();
        System.out.println("Enter second angle of triangle : ");
        int b = scanner.nextInt();
        System.out.println("Enter third angle of triangle : ");
        int c = scanner.nextInt();

        int sumOfAngles = a + b + c ;

        if(a <= 0 || c <= 0 || c <= 0 ){
            System.out.println("Angles of triangle cannot be negative");
        }else if (sumOfAngles == 180 ) {
            System.out.println("It is a triangle");            
        }
         else{
            System.out.println("It is not triangle");
        }
}}
