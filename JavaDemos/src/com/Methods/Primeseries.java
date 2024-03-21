
package com.Methods;

public class Primeseries {
	
	public boolean checkPrime(int num)
	{
		boolean flag=true;
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
			
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Primeseries obj=new Primeseries();
		for(int i=400; i>=300; i--)
		{
			if(obj.checkPrime(i))
				System.out.println(i);
			
	}

}
}
