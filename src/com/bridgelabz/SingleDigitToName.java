package com.bridgelabz;

import java.util.Scanner;

//If Else Statement Problems
//1. Read a single Digit Number and write in word
public class SingleDigitToName {
	public static void main(String[] args) {

		Scanner ss = new Scanner(System.in);
		System.out.println("Enter single Digit number only");
		int a = ss.nextInt();
		if (a == 1) {
			System.out.println("ONE");
		} else if (a == 2) {
			System.out.println("TWO");
		} else if (a == 3) {
			System.out.println("THREE");
		} else if (a == 4) {
			System.out.println("FOUR");
		} else if (a == 5) {
			System.out.println("FIVE");
		} else if (a == 6) {
			System.out.println("SIX");
		} else if (a == 7) {
			System.out.println("SEVEN");
		} else if (a == 8) {
			System.out.println("EIGHT");
		} else if (a == 9) {
			System.out.println("NINE");
		} else {
			System.out.println("PLEASE ENTER SINGLE DIGIT ONLY");
		}
	}
}
