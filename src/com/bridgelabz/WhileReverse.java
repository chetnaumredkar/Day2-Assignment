package com.bridgelabz;

import java.util.Scanner;

public class WhileReverse {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = ss.nextInt();
		int reverse = 0;
		while (a != 0) {
			int remainder = a % 10;
			reverse = reverse * 10 + remainder;
			a = a / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}
}
