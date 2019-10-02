package algorithms.recursions.towerofhanoi;

public class TowerOfHanoi {

	private int numOfMoves = 0;
//	2^n - 1
	public void move(int numOfDisks, String from, String to, String intrmdt) {
		
		if (numOfDisks == 1) { // break-point
			System.out.println("moving disk 1 from " + from + " to " + to);
			numOfMoves++;
		} else {
			move(numOfDisks-1, from, intrmdt, to);
			numOfMoves++;
			System.out.println("moving disk " + numOfDisks + " from " + from + " to " + to);
			move(numOfDisks-1, intrmdt, to, from);
		}
		
	}
	public int getNumOfMoves() {
		return numOfMoves;
	}
	
}
