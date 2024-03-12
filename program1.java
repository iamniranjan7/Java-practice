// WAP to Check number is less than 20 

import java.util.*;

class program1{
	public static void main(String []args){
		Scanner num = new Scanner(System.in);

		System.out.println("Enter the number less than 20 : ");
		Double a = num.nextDouble();

		if(a<20){
			System.out.println("Number is less than 20");
		}else{
			System.out.println("Number is Greater than 20");
		}
	}
}