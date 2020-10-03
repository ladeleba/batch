package Loop;

import java.util.Scanner;

public class LoopAssgnmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while loop method
	/*	int i;
		i = 1;
		while (i<=20) {
			System.out.println("number  "+i);
			i++;
		}
		
		
		//int i;
		// for loop method
		for (i=1; i<=20; i++)
		{
			System.out.println("No   "+i);
	}
		*/
		//question2
		/*int i;
		i=1;
		while (i<=20) {
			if (i%5==0) {
				System.out.println("Numbers divisible by 5   "+i);
			}
				i++;
			}*/
		
		//question3
		/*int i;
			i=1;
			while (i<=20) {
				if (i%5==1) {
					System.out.println("number not divisible by 5    "+i);
				}
				i++;
			}*/
		
		//question4
		int i;
		i=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		i = scan.nextInt();
		while (1<=10) {
			if (i==6) 
			{
				System.out.println("Secret number is  "+i);
				break;
			}
		
			else 
			{
				System.out.println("That is incorrect. Guess again");
			
			}
			i++;
				break;
			}
		
		}
	}

