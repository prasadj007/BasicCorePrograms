package com.bridgelabz;

import java.util.*;

public class UC1CoinFlip {

	public static void main(String[] args) {

		int flipTimes,headCount = 0,tailCount = 0;
		System.out.println("Enter No. Times to Flip Coin");
		Scanner scan=new Scanner(System.in);
		flipTimes=scan.nextInt();
		scan.close();

		for(int i=1; i<=flipTimes;i++)
		{
			double coinFlip=Math.floor(Math.random()*10)%2;

			if(coinFlip < 0.5)
			{
				System.out.println("Its a Head!!!");
				headCount++;
			}

			else
			{
				System.out.println("Its tails!!!");
				tailCount++;
			}

		}
		System.out.println("Total Head Count:"+headCount);
		System.out.println("Total Tail Count:"+tailCount);
		System.out.println("Total Head Percent:"+(headCount*100)/flipTimes );
		System.out.println("Total tail Percent:"+(tailCount*100)/flipTimes );
	}

}
