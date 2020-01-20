package jtm.tasks.fundamentals;

import java.util.Arrays;

public class EvenNumbers {

	// TODO
	/*
	 * Complete the function which takes two arguments and returns all numbers which
	 * are divisible by the given divisor. First argument is an array of numbers and
	 * the second is the divisor. Example: divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2,
	 * 4, 6]
	 * 
	 */
	public static int[] newNumbers;

	public static int[] divisibleBy(int[] numbers, int divider) {

		int counter = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (i % divider == 0) {
				counter++;
			}
		}
		int[] newNumbers = new int[counter];
		return newNumbers;
	}
}
