package com.ifelse;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int basicsalary=10000;
		float hra=0,da=0;
		if(basicsalary<=10000)
		{
			hra=basicsalary*0.20f;
			da=basicsalary*0.80f;
		}
		else if(basicsalary<=20000)
		{
			hra=basicsalary*0.25f;
			da=basicsalary*0.90f;
		}
		else if(basicsalary<=20000)
		{
			hra=basicsalary*0.30f;
			da=basicsalary*0.95f;
		}
		
		System.out.println("salary "+(basicsalary+hra+da));
		
		
        

	}

}
