package Forloopprograms;

public class BreakandContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using break ");
		for(int i=1; i<=20; i++ )
		{
			if(i%3==0)
				break;
			System.out.println(i);
		}
			System.out.println("Using Continue ");
			for(int i=1;i<=20; i++ )
			{
				if(i%2==0)
					continue;
				System.out.println(i);
			}
				
				
	}

}
