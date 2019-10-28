package algorithms.sorts.quicksort;

public class QuickSort {
	
	public void quickSort(int[] inputArray, int start, int end) {
		
		int pivot;
		
		if (start < end) {
			// get pivot after partition
			pivot = partition(inputArray, start, end); // pivot index
			
			quickSort(inputArray, start, pivot-1);
			quickSort(inputArray, pivot, end);
	
		} else {
			return;
		}
		
	}
	
	public int partition(int[] inputArray, int start, int end) {
		int pivot = inputArray[end];
		int pivotIndex;
		int i = start;
		
		for (int j = start; j <= end-1; j++) {
			if (inputArray[j] <= pivot) {
				int temp = inputArray[i];
				// exchange inputArray[i] with inputArray[j]
				inputArray[i] = inputArray[j];
				inputArray[j] = temp;
				i++;
			}
		}
		
		// exchange inputArray[i] with inputArray[end]
		int temp = inputArray[i];
		inputArray[i] = inputArray[end];
		inputArray[end] = temp;
		pivotIndex = i;
		
		return pivotIndex;
	}

}
