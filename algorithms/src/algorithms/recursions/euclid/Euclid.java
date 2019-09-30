package algorithms.recursions.euclid;

public class Euclid {
	
	public int findGDC(int a, int b) {
		if (b == 0) {
			return a;
		}
		
		return findGDC(b, a%b);
	}

}
