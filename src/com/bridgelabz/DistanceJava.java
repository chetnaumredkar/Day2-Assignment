package com.bridgelabz;

import java.lang.Math;

import java.util.Scanner;

public class DistanceJava {
	public static void main(String[] args) {
//the Euclidean distance from the point (x, y) to the origin (0, 0)
		int x1, x2, y1, y2, a1, a2, b1, b2;
		double dis, dis1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x1 point");
		x1 = sc.nextInt();
		System.out.println("enter y1 point");
		y1 = sc.nextInt();
		System.out.println("enter x2point");
		x2 = sc.nextInt();
		System.out.println("enter y2 point");
		y2 = sc.nextInt();
		dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("distancebetween" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")=" + dis);

		System.out.println("enter a1 point");
		a1 = sc.nextInt();
		System.out.println("enter a2 point");
		a2 = sc.nextInt();
		System.out.println("enter b1point");
		b1 = sc.nextInt();
		System.out.println("enter b2 point");
		b2 = sc.nextInt();
		dis1 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		System.out.println("distancebetween" + "(" + a1 + "," + a2 + ")," + "(" + b1 + "," + b2 + ")=" + dis1);
		if (dis == dis1) {
			System.out.println("both lines are equal");
		} else {
			System.out.println("both lines are not equal");
		}
	}
}