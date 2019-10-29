package algorithms.sorts.shellsort;

public class ShellSort {
	public void sort(Integer[] data) {
		if (data == null || data.length == 0)
			return;
		
		int knuthNum = maxKnuthSeqNumber(data.length);
		while (knuthNum >= 1) {
			for (int i = 0; i < knuthNum; i++) {
				// internally we use insertion sort for each pass
				insertionSortWithGap(data, i, knuthNum);
			}
			knuthNum = (knuthNum-1) / 3; //decrease the gap
		}
	}
	
	private void insertionSortWithGap(Integer[] data, int startIndex, int gap) {
		int i = startIndex;
		while (i < data.length) {
			int current = data[i];
			int j = i-gap;
			while (j >=0 && data[j] >= current) {
				data[j+gap] = data[j];
				j = j - gap;
			}
			data[j+gap] = current;
			i = i + gap;
		}
	}
	
	private int maxKnuthSeqNumber(int size) {
		int h = 1;
		while (h < size/3) {
			h = 3 * h + 1;
		}
		return h;
	}
	
}
