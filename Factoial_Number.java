package org.Day3.App;

import java.util.Scanner;

public class Factoial_Number 
{
	public static void math(int num)
	{
		while(num>0) {
			int d= num%10; 
			num=num/10;
			int f=1;
			for(int i=1;i<=d;i++)
			{
				f=f*i;
			}
			System.out.println("Factorial of " +d+ " = " +f);
		}
	}
	
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		math(sc.nextInt());
		
		sc.close();
	}

}
