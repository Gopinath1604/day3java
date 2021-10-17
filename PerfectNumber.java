package org.Day3.App;

import java.util.Scanner;

public class PerfectNumber
{

	public static void math(int num)
	{
		int sum = 1;
		for(int i = 2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum = sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println(num+" is a Perfect Number");
		}
		else
			System.out.println(num+" is not a Perfect Number");
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check :");
		math(sc.nextInt());
		
		
		sc.close();
	}

}
