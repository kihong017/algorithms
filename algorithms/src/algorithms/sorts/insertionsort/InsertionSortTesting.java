package algorithms.sorts.insertionsort;

public class InsertionSortTesting {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		InsertionSort insertionSort = new InsertionSort();
		
        Integer[] testArray = new Integer[]{9, 2, 8, 12, 7};
		
		StringBuffer str = new StringBuffer();
		str.append("[");
		
		for (int i = 0; i < testArray.length; i++) {
			str.append(testArray[i]);
			if (i != testArray.length -1) {
				str.append(", ");
			}
		}
		str.append("]");
		
		insertionSort.insertSort(testArray);
		
		StringBuffer str2 = new StringBuffer();
		str2.append("[");
		
		for (int i = 0; i < testArray.length; i++) {
			str2.append(testArray[i]);
			if (i != testArray.length -1) {
				str2.append(", ");
			}
		}
		str2.append("]");
		
		System.out.println("Before sort = " + str);
		System.out.println("After sort = " + str2);
	}

}
