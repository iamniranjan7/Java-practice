//4. WAP to Check if number is even or odd

import java.util.*;

class program4{
	public static void main(String []args){

		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        
        if(num % 2 ==0 ){
        	System.out.println(num+" is Even");
        }else{
        	System.out.println(num+" is Odd");
        }       
}
}