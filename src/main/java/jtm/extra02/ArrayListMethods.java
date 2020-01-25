package jtm.extra02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
	List<Integer> myList = new ArrayList<Integer>();

	public List<Integer> checkArray(int comparator, int... numbers) {
		for(int i: numbers) {
			if (i>=comparator) {
				i = i - comparator;
				myList.add(i);
			}else
		myList.add(i);
		}
		System.out.println(myList);
		// TODO #1:Implement method that compares values of passed array with
		// passed comparator.
		// Return list with values that are smaller than comparator.
		// Hint: Investigate how varargs are used.
		return myList;
	}

	public int sumResult() {
		int sum = 0;
		for(int i = 0; i < myList.size(); i++)
		    sum += myList.get(i-1);
		// TODO #2: Count element sum of the list
		return sum;
	}
}
