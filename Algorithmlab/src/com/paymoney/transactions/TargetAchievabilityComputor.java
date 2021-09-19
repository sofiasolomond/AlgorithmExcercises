package com.paymoney.transactions;

public class TargetAchievabilityComputor {

	private int[] transactionList;

	public TargetAchievabilityComputor(int[] transactionList) {
		this.transactionList = transactionList;

	}

	public void checkTargetAchieved(int targetValue) {
		int totalTarget = this.transactionList[0];
		for (int i = 0; i < this.transactionList.length; i++) {
			if (totalTarget > targetValue) {
				System.out.println("Target of " + targetValue + " Achieved in " + (i + 1) + " transactions");
				return;
			} else
				totalTarget = totalTarget + transactionList[i];
		}

		System.out.println("Target not achieved");

	}

}
