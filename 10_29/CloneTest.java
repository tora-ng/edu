package class_10_29_Ex;

class Point1 implements Cloneable {
	private int xPos;
	private int yPos;

	public Point1(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void showPosition() {
		System.out.println("[" + xPos + "," + yPos + "]");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CloneTest {

	public static void main(String[] args) {
		Point org = new Point(3, 5);
		Point cpy;

		try {
			cpy = (Point) org.clone();
			org.showPosition();
			cpy.showPosition();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
