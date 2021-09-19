package com.traveler.denominations;

public class SorterHelper {
	public int[] merge(int arr[], int left, int right) {
		int mid = (left + right) / 2;
		if (left < right) {
			merge(arr, left, mid);
			merge(arr, mid + 1, right);
			merge_sort(arr, left, mid, right);
		}
		return arr;
	}

	public void merge_sort(int arr[], int left, int mid, int right) {
		int sizeOfFirstArray = mid - left + 1;
		int sizeOfSecondArray = right - mid;

		int[] tempFirstArray = new int[sizeOfFirstArray];
		int[] tempSecondArray = new int[sizeOfSecondArray];

		for (int i = 0; i < sizeOfFirstArray; i++) {
			tempFirstArray[i] = arr[left + i];
		}
		for (int j = 0; j < sizeOfSecondArray; j++) {
			tempSecondArray[j] = arr[mid + 1 + j];
		}
		int indexOfOriginalArray = left;
		int indexOfFirstSubAray = 0;
		int indexOfSecondSubAray = 0;

		while (indexOfFirstSubAray < sizeOfFirstArray && indexOfSecondSubAray < sizeOfSecondArray) {
			if (tempFirstArray[indexOfFirstSubAray] > tempSecondArray[indexOfSecondSubAray]) {
				arr[indexOfOriginalArray] = tempFirstArray[indexOfFirstSubAray];
				indexOfFirstSubAray++;
				indexOfOriginalArray++;
			} else {
				arr[indexOfOriginalArray] = tempSecondArray[indexOfSecondSubAray];
				indexOfSecondSubAray++;
				indexOfOriginalArray++;
			}
		}
		while (indexOfFirstSubAray < sizeOfFirstArray) {
			arr[indexOfOriginalArray] = tempFirstArray[indexOfFirstSubAray];
			indexOfFirstSubAray++;
			indexOfOriginalArray++;

		}
		while (indexOfSecondSubAray < sizeOfSecondArray) {
			arr[indexOfOriginalArray] = tempSecondArray[indexOfSecondSubAray];
			indexOfSecondSubAray++;
			indexOfOriginalArray++;

		}

	}
}
