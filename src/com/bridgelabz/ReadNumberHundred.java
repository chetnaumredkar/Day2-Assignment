package com.bridgelabz;

import java.util.Scanner;

public class ReadNumberHundred {
	public static void main(String[] args) {

		Scanner ss = new Scanner(System.in);
		System.out.println("Enter 1,10,100,1000 number only");
		int a = ss.nextInt();
		if (a == 1) {
			System.out.println("ONE");
		} else if (a == 10) {
			System.out.println("TEN");
		} else if (a == 100) {
			System.out.println("HUNDRED");
		} else if (a == 1000) {
			System.out.println("THOUSAND");
		} else {
			System.out.println("INVALID ENTRY");
		}

	}
}