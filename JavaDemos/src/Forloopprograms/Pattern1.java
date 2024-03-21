package Forloopprograms;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k,rows,sp;
		rows= 5;
		sp = rows-1;
		for(i=1;i<=rows;i++)
		{
			for(k=1;k<=sp;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			sp--;
			
		}
		

	}

}
