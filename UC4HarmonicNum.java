package com.bridgelabz;

import java.util.*;
public class UC4HarmonicNum {
	
	static void Harmonic(int N) {
		
    	
    	for(int i=1; i<=N; i++)
    	{
    		System.out.print(i+"/"+N+" "+"+"+" ");
    	}
    	
		
	}
	
	    public static void main(String[] args) { 
	    	
	    	System.out.println("Enter Value of N");
	    	Scanner scan = new Scanner(System.in);
	    	int N=scan.nextInt();
	    	Harmonic(N);
	    	
	    }

	}


