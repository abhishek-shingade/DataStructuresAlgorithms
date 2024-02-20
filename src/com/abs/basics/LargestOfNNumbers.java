package com.code.generalTopics;

import java.util.Scanner;

public class LargestOfNNumbers {
	public static void main(String[] args) {
		int i;
		int maxValue;
		int numInputs;
		int currValue;

		try (Scanner scan = new Scanner(System.in)) {
			numInputs = scan.nextInt();
			maxValue = Integer.MIN_VALUE;

			for (i = 0; i < numInputs; i++) {
				currValue = scan.nextInt();
				maxValue = Math.max(maxValue, currValue);
			}
		}

		System.out.print("Max Value = " + maxValue);
	}
}
