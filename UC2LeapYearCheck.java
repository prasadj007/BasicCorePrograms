package com.bridgelabz;

import java.util.*;
public class UC2LeapYearCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year:");
		int year=sc.nextInt();
		LeapYear(year);		
	}

	static int LeapYear(int x)
	{
		if(x<1000)
		{
			System.out.println("Enter Valid Year");
		}
		else if((x % 400 == 0) || (x % 4 == 0) && (x%100 != 0))
		{
			System.out.println("Its a Leap Year");
		}
		else
		{
			System.out.println("Its Not a Leap year");
		}
		return(x);
	}
}
