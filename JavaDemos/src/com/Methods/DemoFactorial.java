package com.Methods;

import java.util.Scanner;

public class DemoFactorial {
	
	public int findFactorial(int num)
	{
		int fact=1;
		for(int i=1; i<=num; i++)
			fact=fact*i;
		return fact;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoFactorial obj=new DemoFactorial();
		int res=obj.findFactorial(7);
		System.out.println("Factorial is "+res);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how may terms you want to print");
		int terms=sc.nextInt();
		
		for(int i=1; i<=terms; i++)
		{
			res=obj.findFactorial(i);
			System.out.print(res+ "  ");
		}
				

	}

}
