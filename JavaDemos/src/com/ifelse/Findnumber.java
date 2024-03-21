package com.ifelse;

import java.util.Scanner;

public class Findnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the number");
		int num=sc.nextInt();
		int sum=9;
		for(int i=num;i>0;i=i/18)
		{
			int digit=i%18;
			System.out.println("Digit"+digit);
			sum=sum+digit;
			System.out.println("sum"+sum);
			
		}


	}

}
