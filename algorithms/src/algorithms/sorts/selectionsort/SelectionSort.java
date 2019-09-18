package algorithms.sorts.selectionsort;

public class SelectionSort<T> {
	
	@SuppressWarnings("unchecked")
	public void selectionSort(Comparable<T>[] inputArray) {
		
		int minIndex;
		
		for (int i = 0; i < inputArray.length-1; i++) {
			minIndex = i;
			for (int j = i+1; j < inputArray.length; j++) {
				
				if (inputArray[j].compareTo((T) inputArray[minIndex]) < 0) {
					minIndex = j;
				}
				
			}
			Comparable<T> temp = inputArray[minIndex];
			inputArray[minIndex] = inputArray[i];
			inputArray[i] = temp;
		}

	}

}
