package algorithms.sorts.insertionsort;

public class InsertionSort<T> {

	@SuppressWarnings("unchecked")
	public void insertSort(Comparable<T>[] inputArray) {
		
		Comparable<T> current;
		int j;
//		[5, 2, 8, 12, 7]
		for (int i = 0; i < inputArray.length; i++) {
			current = inputArray[i];
			j = i - 1;
			
			while (j >= 0 && inputArray[j].compareTo((T) current) > 0) {
				inputArray[j+1] = inputArray[j];
				j--;
			}
			inputArray[j+1] = current;
		}
		
	}
	
}
