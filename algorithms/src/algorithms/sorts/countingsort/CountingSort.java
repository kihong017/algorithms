package algorithms.sorts.countingsort;

public class CountingSort {

	public void sort(Integer[] data) {
		int[] temp = new int[11];

		for (int i = 0; i < data.length; i++) { // populate the temp array
			temp[data[i]] = temp[data[i]] + 1;
		}

		int current = 0;

		for (int i = 0; i < temp.length; i++) { // k iterations
			for (int j = 0; j < temp[i]; j++) { // n/k iterations for each (avg)
				data[current] = i;
				current++;
			}
		}
	}
	
}
