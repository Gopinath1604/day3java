package org.Day3.App;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void math(int num)
	{
		int rev=0;
		
		while(num!=0)
		{
			
			int reminder=num%10;
			rev = rev*10+reminder;
			num = num/10;
			
		}
		System.out.println("Reversed number : "+rev);
		
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number what you want to reverse: ");
		math(s.nextInt());
		s.close();


	}

}
