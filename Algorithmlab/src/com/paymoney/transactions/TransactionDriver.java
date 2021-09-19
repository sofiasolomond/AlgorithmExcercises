package com.paymoney.transactions;

import java.util.Scanner;
public class TransactionDriver {

	public static void main(String[] args) {
		System.out.println("Pay money transactions");
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int sizeOfArray = scannerObject.nextInt();
		int[] trasactionsList = new int[sizeOfArray];
		System.out.println("Enter the values of the transactions");
		for (int i = 0; i < sizeOfArray; i++) {
			trasactionsList[i] = scannerObject.nextInt();

		}
		TargetAchievabilityComputor targetAchievabilityComputor = new TargetAchievabilityComputor(trasactionsList);
		System.out.println("Enter the total number of targets");
		int numberOfTargets = scannerObject.nextInt();
		for (int i = 0; i < numberOfTargets; i++) {
			System.out.println("Enter the value of " + (i + 1) + " target");
			int targetValue = scannerObject.nextInt();
			targetAchievabilityComputor.checkTargetAchieved(targetValue);

		}
	}

}
