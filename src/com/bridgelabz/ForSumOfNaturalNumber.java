package com.bridgelabz;

public class ForSumOfNaturalNumber {
	public void SumOfN() {
		int i;
		int sum = 0;
		for (i = 1; i < 6; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {

		ForSumOfNaturalNumber Obj = new ForSumOfNaturalNumber();
		Obj.SumOfN();
	}
}
