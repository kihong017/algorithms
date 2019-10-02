package algorithms.recursions.towerofhanoi;

public class TowerOfHanoiTest {

	public static void main(String[] args) {
		TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
		
		towerOfHanoi.move(3, "A", "C", "B");
		System.out.println(towerOfHanoi.getNumOfMoves());

	}

}
