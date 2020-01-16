package jtm.extra01;

public class GetOne {

	public int iterations(int number) {

		int iterationCount = 0;
//		for (int i = number; i>1; i-- ) {
//			if (i%2 == 0) {
//				i= i/2;
//			}else {
//				i = (i*3)+1;
//			}
//			iterationCount++;
//		}

		while (number > 1) {

			if (number % 2 == 0) {
				number = number / 2;
			} else {
				number = (number * 3) + 1;
			}

			iterationCount++;
		}
		return iterationCount;

		// TODO #1: Implement method which processes the passed positive number
		// value until it's
		// reduced to 1.
		// If the number is even then divide it by 2. If it is odd then multiply
		// it by 3 and add 1. Count how many iterations
		// it takes to do this calculation and return that count. For example:
		// passed number is 6. Path to completion would be:
		// 6->3->10->5->16->8->4->2->1. Iteration count=8.
		// HINT: Use while loop.

	}

	public int theMostComplexNo(int maxNumber) {

		// TODO #2: Calculate how many iterations each number from 1 to
		// maxNumber (including) to get value till 1.
		// Return the number, which takes most iterations to do that.
		// E.g. if 3 is passed, then calculate iteration steps for 1, 2 and 3.
		// And return 3, because it has the biggest count of iterations.
		// (If count of iterations is the same for several numbers, return
		// smallest number).
		return 0;
	}

	public static void main(String[] args) {

		GetOne one = new GetOne();

		System.out.println(one.iterations(6));
	}

}