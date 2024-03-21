package com.ifelse;

public class Que4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub{
		//Distance from sun (150 million kilometers)
		long kmFromSun=150000000;
		long lightSpeed=299792458;//meters per second
		//Convert distance to meters.
		long mFromSun=kmFromSun*1000;
		long seconds=mFromSun/lightSpeed;
		System.out.println("Light will use");
		long min=seconds / 60;
		//seconds=seconds - (min*60);
		System.out.println(min + "minute(s) and "+ seconds +"second(s)");
		System.out.println(" to travel from the sun to the earth.");
	}
}
		