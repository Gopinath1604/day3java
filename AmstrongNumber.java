package org.Day3.App;

import java.util.Scanner;

public class AmstrongNumber
{
	
	public static void math(int num)
	{
		int m,r,result=0;
		m=num;
		while(m!=0)
		{
			r=m%10;
			result=result+(r*r*r);
			m=m/10;
			
		}
		if(result==num) 
		{		
			System.out.println( "armstrong number");
		}
		else
		{
			System.out.println(" not armstrong number");
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you want to check: ");
		math(sc.nextInt());
		
		
		
		sc.close();

	}

}
