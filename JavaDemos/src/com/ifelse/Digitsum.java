package com.ifelse;

import java.util.Scanner;

public class Digitsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=num;i>0;i=i/10)
		{
			int digit=i%10;
			System.out.println("Digit"+digit);
			sum=sum+digit;
			System.out.println("sum"+sum);
			
		}

	}

}
