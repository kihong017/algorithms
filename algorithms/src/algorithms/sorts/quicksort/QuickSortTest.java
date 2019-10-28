package algorithms.sorts.quicksort;

public class QuickSortTest {

	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		
		int[] inputArray = new int[]{12,9,7,15,10};
		
		quickSort.quickSort(inputArray, 0, inputArray.length-1);
		
		for(int a : inputArray) {
			System.out.println(a);
		}

	}

}
