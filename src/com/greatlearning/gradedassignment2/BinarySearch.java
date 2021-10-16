package com.greatlearning.gradedassignment2;
public class BinarySearch {


	public void searchValue(double priceArray[], double stock) {
		int left = 0;
		int right = priceArray.length - 1;
		int mid = left + (right - left) / 2;

		while (left <= right) {

			if (stock < priceArray[mid]) {
				// range is l to mid-1
				right = mid - 1;
			} else if (stock > priceArray[mid]) {
				// range is mid+1 to r
				left = mid + 1;

			} else {
				System.out.println("Stock of value " + stock + " is present ");
				break;
			}
			mid = left + (right - left) / 2;
		}

		if (left > right) {
			System.out.println("Value not found");
		}
	}

}

