package algorithms.recursions.mergesort;

import java.util.Arrays;

public class MergeSortTest {

	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		
		int[] testArray = new int[]{23, 5, 2, 8, 12, 7, 16, 9};
		
		System.out.println("Before sort = " + Arrays.toString(testArray));
		mergeSort.sort(testArray);
		System.out.println("After sort = " + Arrays.toString(testArray));

	}

}
