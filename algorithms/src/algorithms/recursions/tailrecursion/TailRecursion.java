package algorithms.recursions.tailrecursion;

public class TailRecursion {

	public int factorial(int n, int result) {
		if (n == 0) {
			return result;
		}
		return factorial(n-1, n*result);
	}
	
}
