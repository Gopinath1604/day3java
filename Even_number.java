package org.Day3.App;

import java.util.Scanner;

public class Even_number 
{
	public static void math(int num)
	{
		int sum=0;
		int lastnum=0;
		while(num>0)
		{
			lastnum = num%10;
			
			if(lastnum%2==0)
			{
				System.out.println(lastnum);
				sum+=lastnum; 
				
			}
			num=num/10;		
		}
		System.out.println(sum+" Is sum of even numbers");
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check: ");
		
		math(sc.nextInt());
		
		sc.close();
		
	}

}
