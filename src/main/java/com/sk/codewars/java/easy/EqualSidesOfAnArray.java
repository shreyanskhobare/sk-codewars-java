/*
Copyright [2024] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.codewars.java.easy;

import java.util.Arrays;

/**
 * @author - Shreyans Khobare Codewars link:
 *         https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java
 */
public class EqualSidesOfAnArray {

	public int findEvenIndex(int[] arr) {
		// your code

		for (int i = 0; i < arr.length; i++) {
			int leftSum = getSum(arr, 0, i);
			int rightSum = getSum(arr, i, arr.length - 1);
			if (leftSum == rightSum) {
				return i;
			}
		}

		return -1;

	}

	private int getSum(int[] arr, int start, int end) {

		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += arr[i];
		}

		return sum;
	}

	public int findEvenIndex_Better(int[] arr) {

		int left = 0;
		int right = Arrays.stream(arr).sum();
		for (int i = 0; i < arr.length; i++) {
			right -= arr[i];
			if (left == right)
				return i;
			left += arr[i];
		}
		return -1;

	}

}
