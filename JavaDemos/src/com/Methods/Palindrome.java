package com.Methods;

public class Palindrome {
	
	public void palindrome() {
		int num=121;
		int digit;
		int sum=0;
		for(int i=num; i>0; i=i/10)
		{
			digit=i%10;
			sum=sum*10+digit;
		}
		if(sum==num)
			System.out.println("num is palindrome");
		else
			System.out.println("num is not palindrome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome obj=new Palindrome();
		obj.palindrome();
	}	

}
