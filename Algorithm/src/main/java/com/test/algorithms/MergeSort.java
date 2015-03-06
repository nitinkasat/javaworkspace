package com.test.algorithms;

import java.util.Arrays;

public class MergeSort {

	public int[] sort(int[] input) {
		int[] output = null;
		if (input.length <= 1) {
			return new int[] { input[0] };
		}
		int middle = input.length / 2;
		int[] firstHalf = sort(Arrays.copyOfRange(input, 0, middle));
		int[] secondHalf = sort(Arrays.copyOfRange(input, middle, input.length));
		output = merge(firstHalf, secondHalf, middle);
		return output;
	}

	private int[] merge(int[] firstHalf, int[] secondHalf, int middle) {
		int[] merged = new int[firstHalf.length + secondHalf.length];
		int secondHalfCounter = 0;
		int firstHalfCounter = 0;
		for (int i = 0; i < firstHalf.length + secondHalf.length; i++) {
			if (firstHalfCounter < firstHalf.length
					&& (secondHalfCounter >= secondHalf.length || firstHalf[firstHalfCounter] <= secondHalf[secondHalfCounter])) {
				merged[i] = firstHalf[firstHalfCounter];
				firstHalfCounter++;
			} else if (secondHalfCounter < secondHalf.length) {
				merged[i] = secondHalf[secondHalfCounter];
				secondHalfCounter++;
			}
		}
		return merged;
	}

}
