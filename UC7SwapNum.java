package com.bridgelabz;

import java.util.*;
public class UC7SwapNum {
public static void main(String[] args) {
	
	int num1,num2;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter Num1");
	num1=in.nextInt();
	System.out.println("Enter Num2");
	num2=in.nextInt();
	in.close();
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	
	System.out.println("Output After Swapping:");
	
	System.out.println("Num1:"+num1);
	System.out.println("Num2:"+num2);
}
}
