package Forloopprograms;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int fno=0;
		int sno=1;
		System.out.println(fno);
		System.out.println(sno);
		int tno=0;
		System.out.println("Enter the number of terms");
		int terms=sc.nextInt();
		for(int i=0; i<terms-2; i++)
		{
			tno=fno+sno;
			System.out.println(tno);
			fno=sno;
			sno=tno;
		}
			

	}

}
