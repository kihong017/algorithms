package algorithms.sorts.bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = new int[5];
		array[0] = 12;
		array[1] = 8;
		array[2] = 7;
		array[3] = 5;
		array[4] = 2;
		
		String ret = "[";
		
		for (int i = 0; i < array.length; i++) {
			ret += array[i];
			if (i < array.length -1 ) {
				ret += ", ";
			}
		}
		
		ret += "]";
		
		System.out.println(ret);
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				int temp = array[j]; //12
//				int temp2 = array[j+1]; //8
				if (temp > array[j+1]) {
					array[j] = array[j+1];
					array[j+1] = temp;
					
				}

				
				
			}
			
		}
		
		String ret2 = "[";
		
		for (int p = 0; p < array.length; p++) {
			ret2 += array[p];
			if (p < array.length -1 ) {
				ret2 += ", ";
			}
		}
		
		ret2 += "]";
		
		System.out.println(ret2);
		
	}

}
