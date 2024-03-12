//6. WAP to accept 5 paper marks from user and find total marks & percentage

import java.util.*;

class program6{
	public static void main(String []args){
		Scanner num = new Scanner(System.in);

		System.out.println("Enter your Marks : ");

		System.out.println("Enter Maths Marks : ");
		int Maths = num.nextInt();

		System.out.println("Enter English Marks : ");
		int English = num.nextInt();

		System.out.println("Enter Marathi Marks : ");
		int Marathi = num.nextInt();

		System.out.println("Enter History Marks : ");
		int History = num.nextInt();

		System.out.println("Enter Science Marks : ");
		int Science = num.nextInt();

		int total = Maths + English+Marathi+History+Science ;
		if(total <= 500 ){
			System.out.println("Your Total marks are "+total);
		}else{
			System.out.println("Please input correct marks ");
		}

		double Percentage = (total/500.0)*100 ;
		if(Percentage >= 40 ){
			System.out.println("Your Percentaeg is "+Percentage+" Your are pass");
		}else{
			System.out.println("Your Percentaeg is "+Percentage+" Your are fail");
		}
		
	}
}