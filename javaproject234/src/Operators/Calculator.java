package Operators;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
			int num1;
			int num2;
			int result;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter first number:");
			num1 = scan.nextInt();
			System.out.println("Enter second number:");
			num2 = scan.nextInt();
			
		    result = num1 + num2;
			System.out.println("Addition   "+result);
			result = num1 - num2;
			System.out.println("subtraction   "+result);
			result = num1 * num2;
			System.out.println("Multiplication  "+result);
			result = num1 / num2;
			System.out.println("Division    "+result);
		}
}
				
	

