package algorithms.sorts.countingsort;

import java.util.Arrays;

public class CountingSortTest {

	public static void main(String[] args) {

		CountingSort countingSort = new CountingSort();
		Integer[] data = new Integer[] { 3, 10, 2, 4, 2, 6, 9, 5, 7, 2, 8, 10, 3, 9 };
		countingSort.sort(data);
		System.out.println(Arrays.deepToString(data));
		
	}

}
