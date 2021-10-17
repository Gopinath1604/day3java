package org.Day3.App;

import java.util.Scanner;

public class DigitalNumber {

	public static void meth(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int lastNumber = num%10;
			sum = sum+lastNumber;
			num=num/10;
		}
		System.out.println("Digital number : "+sum);
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number you want to know the sum");
		int number = s.nextInt();
		meth(number);
		s.close();

	}

}
