package com.bridgelabz;

import java.util.*;
public class UC9VowelConsonent {

	public static void main(String[] args) {

		System.out.println("Enter any Alphabet");
		Scanner scan= new Scanner(System.in);
		char ch=scan.next().charAt(0);

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch + " is vowel");
			break;
		default:
			System.out.println(ch + " is consonant");
		}
	}
}

