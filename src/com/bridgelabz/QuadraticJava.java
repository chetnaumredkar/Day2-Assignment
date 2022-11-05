package com.bridgelabz;

import static java.lang.Math.*;

import java.util.Scanner;

public class QuadraticJava {
	public void quadra(double a, double b, double c) {
		// to find the roots of the equation a*x*x + b*x + c
		double delta = b * b - 4 * a * c;
		if (delta >= 0) {
			double rootsfirst = ((-b + sqrt(delta)) / (2 * a));
			double rootssecond = ((-b - sqrt(delta)) / (2 * a));
			System.out.println(delta);
			System.out.println("The roots of quadratic equation are" + "x1=" + rootsfirst + "x2=" + rootssecond);
		} else {
			System.out.println("The roots of quadratic equation are complex");

		}

	}

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter three number for Quadratic Operations");
		num1 = ss.nextInt();
		num2 = ss.nextInt();
		num3 = ss.nextInt();
		QuadraticJava obj = new QuadraticJava();
		obj.quadra(num1, num2, num3);
	}
}
