package Forloopprograms;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				count++;
			
		}
		if(count==0)
			System.out.println(num+ "is prime is number");
		else
			System.out.println(num+ "is not prime number");
	}

}