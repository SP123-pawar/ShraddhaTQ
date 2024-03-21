package com.ifelse;

import java.util.Scanner;

public class Billscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bill=0,totalbill=0,units;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println(" enter first units ");
		
		units =sc.nextDouble();
		if( units <=50)
			bill=units*0.50;
		else if(units <=150) //120
		    bill=(50*0.50)+(units -50)*0.75;
		
		else if ( units<=250)
			bill=(50*0.50)+(100*0.75)+(units-150)*1.20;
		else 
			bill=(50*0.50)+(100*0.75)+(100*1.2)+(units - 250)*1.50;
		
		totalbill=bill+(bill*0.20);
		
		System.out.println(bill+ "for "+units);
		System.out.println(totalbill+ " this is total electricity");
			
		}

}


	
