package com.ifelse;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
		System.out.println("This is an Alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("This is a number");
		}
		else
		{
			System.out.println("It is special character");
		}
	} 

}
