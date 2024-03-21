package Forloopprograms;

public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		int sum=0;
		int i;
		
		for(int i1=1;i1<=num/2;i1++)
		{
			if(num%i1==0);
				sum=sum+i1;
		}
				if(sum==num)
			
				{
			System.out.println("Perfect number");
		}
		else
			{
				System.out.println("not perfect number");
			

	         }
}
}