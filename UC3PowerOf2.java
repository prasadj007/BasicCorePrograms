package com.bridgelabz;

import java.util.*;
public class UC3PowerOf2 {
	public static void main(String[] args) {
		
		int power,exponent,base=2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Power for 2 between 0-31");
		exponent=sc.nextInt();
		
		for(int i=1; i<=exponent; i++)
		{
			power=(int)Math.pow(base,i);
			
			System.out.println(power);
		}
	}

}
