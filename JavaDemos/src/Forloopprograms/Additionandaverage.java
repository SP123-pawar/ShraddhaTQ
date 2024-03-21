package Forloopprograms;

public class Additionandaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, average=0;
		for(int i=1; i<=10;i++)
		{
			sum=i+sum;
		}
		System.out.println("Addition of 1st 10 numbers is "+sum);
		average=sum/10;
		System.out.println("Average of 1st 10 numbers is "+average);
	}
	

}
