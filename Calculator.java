package damn420;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the first number: ");
			int a1=sc.nextInt();
			System.out.println("Enter the second number ");
			
			int a2=sc.nextInt();
			System.out.println("Select your choice baby: ");
			int choice=sc.nextInt();
			int memory=0;
			
			switch(choice){
			case 1: int sum=a1+a2;
			   		System.out.println(sum);
			   		memory+=sum;
			   		System.out.println("THE MEMORY"+memory);
			   		break;
			case 2: int mul=a1*a2;
					System.out.println(mul);
					memory+=mul;
					
					System.out.println("THE MEMORY"+memory);
					break;
			case 3: int div=a1%a2;
					System.out.println(div);
					memory+=div;
					
					System.out.println("THE MEMORY"+memory);
					break;
			case 4: int sub=a1-a2;	
					System.out.println(sub);
					memory+=sub;
					
					System.out.println("THE MEMORY"+memory);
					break;
			
			default:System.out.println("Choose a valid choice");
					memory+=0;
					System.out.println("THE MEMORY"+memory);
			        break;
			
}
		}

	}

	
}
