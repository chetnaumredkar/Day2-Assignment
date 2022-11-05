package com.bridgelabz;

import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the month m " + "and day d ");

		int m = ss.nextInt();
		int d = ss.nextInt();

		if ((d >= 20) && ((m >= 3) && (m <= 6))) {

			System.out.println("true date is correct");
		}

		else {
			System.out.println("false");
		}
	}
}