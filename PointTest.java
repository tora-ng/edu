package day_10_22;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y; // 자식에서 얘 호출하면 됨 protected
	}
}

class ColorPoint extends Point {
	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y); // 부모 클래스에서 생성자가 있기 때문에 super( )로 써 줌
		this.color = color;
	}

	public void setXY(int x, int y) {
		super.move(x, y);

	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		String str = null;

		str = this.color + "색의 (" + super.getX() + "," + super.getY() + ")의 점";

		return str;
	}
}

public class PointTest {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20); // 이 함수는 부모 클래스에 없음
		cp.setColor("RED"); // 값을 바꾼 것임
		String str = cp.toString();
		System.out.println(str + "입니다. ");

	}

}
/*
 * 다음은 2차원 상의 한 점을 표현하는 Point 클래스이다. Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를
 * 작성하라. 다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.
 */