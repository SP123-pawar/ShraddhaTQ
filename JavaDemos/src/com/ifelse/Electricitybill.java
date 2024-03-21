package com.ifelse;


public class Electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bill=0,totalbill=0;
		int unit=100;
		if(unit<=50)
		{
			bill=unit*0.50;
	}
		else if(unit<=150) //120
		{
			bill=(50*0.50)+(unit-50)*0.75;
		}
		else if ( unit<=250)
		{
			bill=(50*0.50)+(100*0.75)+unit*1.20;
	}
		else 
		{
			bill=(50*0.50)+(100*0.75)+unit*1.20+unit*1.50;
		
		}
		totalbill=bill+(bill*0.20);
		System.out.println(bill+ "for "+unit);
		System.out.println(totalbill+ " this is total electricity");
			
		}

}
