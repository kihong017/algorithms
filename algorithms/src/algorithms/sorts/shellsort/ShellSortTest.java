package algorithms.sorts.shellsort;

import java.util.Random;

public class ShellSortTest {

	public static void main(String[] args) {
		int lengthOfArray = 100000;
		Integer[] data1 = new Integer[lengthOfArray];
		//populate the array with some random numbers
		Random rand = new Random(System.currentTimeMillis());
		
		for (int i=0; i < lengthOfArray; i++) {
			data1[i] = rand.nextInt(100001);
		}
		// make another copy of the array, so that we can use regular InsertionSort algo over it
		Integer[] data2 = new Integer[lengthOfArray];
		System.arraycopy(data1, 0, data2, 0, lengthOfArray);
		
		long start = System.currentTimeMillis();
		new ShellSort().sort(data1);
		long end = System.currentTimeMillis();
		System.out.println("Takes " + (end-start) + " millis for Shell Sort");

	}

}
