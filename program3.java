//3. WAP to Check voting eligibility

import java.util.*;

class program3{
	public static void main(String []args){

		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        

        if(age >= 18){
            System.out.println(age+" Hurray !! You're Eligible for voting");
        }else{
            System.out.println(age+" You're not eligible for voting");
        }
    }
}