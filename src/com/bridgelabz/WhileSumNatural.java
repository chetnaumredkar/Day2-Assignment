package com.bridgelabz;

import java.util.Scanner;

public class WhileSumNatural {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		 System.out.println("Enter the number");
		 int num=ss.nextInt(); 
 int a=0;
 int sum=0;
		 while(a<num) {
			 sum+=a;
			 a++;
		 
		 }
			 System.out.println("sum of natural number is " +sum);
		 		 
}
}