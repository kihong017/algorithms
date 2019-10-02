package algorithms.recursions.mergesort;

public class MergeSort {

	public void sort(int[] inputArray) {
		mergeSort(inputArray, 0, inputArray.length-1);
	}

	private void mergeSort(int[] inputArray, int start, int end) {
		if (start < end) {
			int mid = (int) Math.floor( (start+end)/2 );
			mergeSort(inputArray, start, mid);
			mergeSort(inputArray, mid+1, end);
			merge(inputArray, start, mid, end);
		}
	}

	private void merge(int[] inputArray, int start, int mid, int end) {
		int leftLength = mid - start + 1;
		int rightLength = end - mid;

		int[] leftArray = new int[leftLength];
		int[] rightArray = new int[rightLength];

		for (int i = 0; i < leftLength; i++) {
			leftArray[i] = inputArray[start + i];
		}

		for (int j = 0; j < rightLength; j++) {
			rightArray[j] = inputArray[mid + 1 + j];
		}

		int i = 0, j = 0;

		for (int k = start; k <= end; k++) {
			if ( (j >= rightLength) || (i < leftLength &&  leftArray[i] <= rightArray[j]) ) {
				inputArray[k] = leftArray[i];
				i++;
			} else {
				inputArray[k] = rightArray[j];
				j++;
			}
		}
	}

}
