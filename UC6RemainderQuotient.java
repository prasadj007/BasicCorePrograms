package com.bridgelabz;

import java.util.*;
public class UC6RemainderQuotient {

	public static void main(String[] args) {

		double numerator, denominator;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numerator to Find Remainder and Quotient:");
		numerator=sc.nextInt();

		System.out.println("Enter denominator to Find Remainder and Quotient:");
		denominator=sc.nextInt();

		System.out.println("Quotient: "+numerator/denominator);
		System.out.println("Remainder: "+numerator%denominator);
		sc.close();

	}

}
