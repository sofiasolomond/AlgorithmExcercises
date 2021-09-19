package com.traveler.denominations;

import java.util.Scanner;

public class DenominationCalculator {

	public int sizeOfDenominations;
	public int[] denominationsValue;
	public int amountToPay;

	public void getInput() {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("enter the size of currency denominations available");
		sizeOfDenominations = scannerObject.nextInt();
		denominationsValue = new int[sizeOfDenominations];
		System.out.println("Enter the values of the currency denominations");
		for (int i = 0; i < sizeOfDenominations; i++) {
			denominationsValue[i] = scannerObject.nextInt();

		}
		System.out.println("Enter the amount you want to pay");
		amountToPay = scannerObject.nextInt();
	}

	public void computePayment() {
		SorterHelper mergeSort = new SorterHelper();
		int partialValue = amountToPay;
		int[] sortedDenominations = mergeSort.merge(denominationsValue, 0, denominationsValue.length - 1);
		for (int i = 0; i < sortedDenominations.length; i++) {
			int denomination = partialValue / sortedDenominations[i];
			System.out.println("Number of Rs." + sortedDenominations[i] + "=" + denomination);
			partialValue = partialValue - denomination * sortedDenominations[i];
			if (partialValue == 0) {
				System.out.println("Amount paid");
				break;

			}
		}
	}

	public static void main(String[] args) {

		DenominationCalculator calculateDenominations = new DenominationCalculator();
		calculateDenominations.getInput();
		calculateDenominations.computePayment();
	}

}
